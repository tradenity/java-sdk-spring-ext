package com.tradenity.sdk.spring.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * User: Joseph Fouad
 * Date: 7/27/2015
 * Time: 8:22 AM
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TradenitySDKConfig.class)
public @interface EnableTradenity {
}
