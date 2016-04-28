package com.iftodi.dan.validation.interfaces;

/**
 * Created by daniftodi on 4/28/16.
 */
public @interface PatternValidator {
    String message() default "Invalid input";
    String pattern();
}
