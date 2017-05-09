package com.iftodi.dan.validation.interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by daniftodi on 4/27/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface StringValidator {
    String message() default "Length must be between %d and %d";
    int minLength() default -1;
    int maxLength() default  -1;
}
