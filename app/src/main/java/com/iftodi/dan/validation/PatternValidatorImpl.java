package com.iftodi.dan.validation;

/**
 * Created by daniftodi on 4/28/16.
 */
import com.iftodi.dan.validation.interfaces.Validator;
import java.util.regex.Pattern;

public class PatternValidatorImpl extends AbstractValidator implements Validator {
    private String pattern;
    public PatternValidatorImpl(String value) {
        super(value);
    }
    public PatternValidatorImpl(String value,String pattern)
    {
        super(value);
        this.pattern = pattern;
    }
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean isValid() {
        if(pattern == null)
            return  false;

        Pattern pattern = Pattern.compile(this.pattern);
        return pattern.matcher(value).matches();
    }
}
