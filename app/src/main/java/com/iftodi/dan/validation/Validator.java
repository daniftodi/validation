package com.iftodi.dan.validation;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.iftodi.dan.validation.interfaces.*;
import com.iftodi.dan.validation.interfaces.EmailValidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Formatter;

/**
 * Created by daniftodi on 4/27/16.
 */
public class Validator {
    private static final String TAG = Validator.class.getCanonicalName();
    public static boolean validate(Object target)
    {
        boolean valid = true;
        Field fields[] = target.getClass().getDeclaredFields();
        for(Field field : fields)
        {
            if(field.isAnnotationPresent(EmailValidator.class))
            {
                valid = emailValidate(field,target);
            }
            else if(field.isAnnotationPresent(StringValidator.class))
            {
                valid = stringValidate(field,target);
            }
            else if(field.isAnnotationPresent(PatternValidator.class))
            {
                valid = patternValidate(field,target);
            }
        }

        return  valid;
    }
    private static boolean emailValidate(Field field, Object target)
    {
        try {
            if(!field.isAccessible())
                field.setAccessible(true);

            EditText view = (EditText) field.get(target);
            AbstractValidator validator = new EmailValidatorImpl(view.getText().toString());
            EmailValidator annotation = field.getAnnotation(EmailValidator.class);
            if(!validator.isValid())
            {
                view.setError(annotation.message());
            }
            return validator.isValid();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return false;
    }
    private static boolean stringValidate(Field field, Object target)
    {
        try {
            if(!field.isAccessible())
                field.setAccessible(true);
            StringValidator annotation = field.getAnnotation(StringValidator.class);

            EditText view = (EditText) field.get(target);
            AbstractValidator validator = new StringValidatorImpl(view.getText().toString(),annotation.minLength(),annotation.maxLength());
            Formatter formatter = new Formatter();
            String message = formatter.format(annotation.message(),annotation.minLength(),annotation.maxLength()).toString();
            if(!validator.isValid())
            {
                view.setError(message);
            }
            return validator.isValid();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }
    private static boolean patternValidate(Field field, Object target)
    {
        try {
            if(!field.isAccessible())
                field.setAccessible(true);
            PatternValidator annotation = field.getAnnotation(PatternValidator.class);

            EditText view = (EditText) field.get(target);
            AbstractValidator validator = new PatternValidatorImpl(view.getText().toString(),annotation.pattern());

            if(!validator.isValid())
            {
                view.setError(annotation.message());
            }
            return validator.isValid();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return false;
    }
}
