package com.librarymanagementsystem.annotations;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * This custom annotation when added to class/method/constructor excludes it from
 * test coverage report. e.g. it can be applied to dto classes
 */
@Documented
@Retention(RUNTIME)
@Target({TYPE, METHOD, CONSTRUCTOR})
public @interface  Generated {
}
