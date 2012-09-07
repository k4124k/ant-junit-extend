package org.junit;


import java.lang.annotation.Target;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;


/**
 * To associate description to test cases
 * <p/>
 * e.g. @Description ("输入对test case的描述信息")
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {
    String value() default "";
}