package com.xyc.argumentresolver.annotation;

import com.xyc.argumentresolver.constant.DateFormatPattern;

import java.lang.annotation.*;

/**
 * Created by xyc on 2017/7/27 0027.
 */
@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestDateParam {
    String value() default "";

    DateFormatPattern pattern() default DateFormatPattern.YYYY_MM_DD_HH_MM_SS;

    boolean required() default true;
}
