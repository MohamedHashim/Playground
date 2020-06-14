package com.mohamedhashim.playground;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Mohamed Hashim on 6/14/2020.
 */
@Scope
@Documented
@Retention(RUNTIME)
@interface ActivityScopeSingleton {
}
