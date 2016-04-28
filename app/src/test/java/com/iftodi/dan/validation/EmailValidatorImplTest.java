package com.iftodi.dan.validation;

import com.iftodi.dan.validation.interfaces.EmailValidator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by daniftodi on 4/28/16.
 */
public class EmailValidatorImplTest {
    EmailValidatorImpl validator;
    @Test
    public void testIsValid() throws Exception {
        validator = new EmailValidatorImpl("email@example.com");
        assertTrue(validator.isValid());
    }
    @Test
    public void testIsInvalid() throws Exception {
        validator = new EmailValidatorImpl("@example.com");
        assertFalse(validator.isValid());
    }

}