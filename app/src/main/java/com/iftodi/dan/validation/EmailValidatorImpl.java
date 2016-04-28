package com.iftodi.dan.validation;

import android.util.Log;
import android.util.Patterns;
import com.iftodi.dan.validation.interfaces.Validator;
import java.util.regex.Pattern;

/**
 * Created by daniftodi on 4/27/16.
 */
public class EmailValidatorImpl extends AbstractValidator implements Validator {
    public EmailValidatorImpl(String email)
    {
        super(email);
    }
    @Override
    public boolean isValid() {
        Pattern pattern = Pattern.compile(
                "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                        "\\@" +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                        "(" +
                        "\\." +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                        ")+"
        );
        return pattern.matcher(value).matches();
    }
}
