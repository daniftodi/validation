package com.iftodi.dan.validation;

/**
 * Created by daniftodi on 4/27/16.
 */
public class StringValidatorImpl extends AbstractValidator {
    int minLength = -1;
    int maxLength = -1;
    public StringValidatorImpl(String value) {
        super(value);
    }
    public StringValidatorImpl(String value, int minLength)
    {
        super(value);
        this.minLength = minLength;
    }
    public StringValidatorImpl(String value, int minLength, int maxLength)
    {
        super(value);
        this.minLength = minLength;
        this.maxLength = maxLength;
    }
    @Override
    public boolean isValid() {
        if(minLength != -1 && maxLength != -1)
        {
            return value.length() > minLength && value.length() < maxLength;
        }
        else if(minLength != -1)
        {
            return value.length() > minLength;
        }
        else if(maxLength != -1)
        {
            return value.length() < maxLength;
        }

        return true;
    }
}
