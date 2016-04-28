package com.iftodi.dan.validation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daniftodi on 4/28/16.
 */
public class PatternValidatorImplTest {
    PatternValidatorImpl validator;
    @Before
    public void setUp() throws Exception
    {
        validator = new PatternValidatorImpl("!Hello");
    }
    @Test
    public void testGetPattern() throws Exception {
        validator.setPattern("![A-Z][a-z]{4}");
        assertEquals(validator.getPattern(),"![A-Z][a-z]{4}");
    }

    @Test
    public void testIsValid() throws Exception {
        validator.setPattern("![A-Z][a-z]{4}");
        assertTrue(validator.isValid());
    }
    @Test
    public void testIsInvalid() throws Exception
    {
        validator.setPattern("//d");
        assertFalse(validator.isValid());
    }
}