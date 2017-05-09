package com.iftodi.dan.validation.interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by daniftodi on 4/28/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface PatternValidator {
    String message() default "Invalid input";
    String pattern();
}
