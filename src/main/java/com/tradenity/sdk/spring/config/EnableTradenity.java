package com.tradenity.sdk.spring.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TradenitySDKConfig.class)
public @interface EnableTradenity {
}