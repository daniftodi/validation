package com.iftodi.dan.validation;

import com.iftodi.dan.validation.interfaces.Validator;

/**
 * Created by daniftodi on 4/27/16.
 */
public abstract class AbstractValidator implements Validator {
    protected String value;

    public AbstractValidator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public abstract boolean isValid();
}
