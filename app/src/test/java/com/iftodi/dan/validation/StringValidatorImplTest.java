package com.iftodi.dan.validation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniftodi on 4/28/16.
 */
public class StringValidatorImplTest {
    StringValidatorImpl validator;
    @Test
    public void testIsValid() throws Exception {
        validator = new StringValidatorImpl("test",3,5);
        assertTrue(validator.isValid());
    }
    @Test
    public void testIsInvalid() throws Exception {
        validator = new StringValidatorImpl("testlongstring",3,5);
        assertFalse(validator.isValid());
    }
}