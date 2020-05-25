package com.dongguangming.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import org.springframework.context.annotation.Conditional;

import com.dongguangming.condition.LogServiceTypeCondition;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Conditional(LogServiceTypeCondition.class)
public @interface LogServiceType
{
	//日志输出到什么地方去（控制台，file还是写到数据库mysql）
    String value() default "stdout";
}