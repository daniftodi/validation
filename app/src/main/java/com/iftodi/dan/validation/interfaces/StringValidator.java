package com.iftodi.dan.validation.interfaces;

/**
 * Created by daniftodi on 4/27/16.
 */
public @interface StringValidator {
    String message() default "Length must be between %d and %d";
    int minLength() default -1;
    int maxLength() default  -1;
}
