package com.iftodi.dan.validation.interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by daniftodi on 4/27/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailValidator {
    String message() default  "Invalid email address";
}
