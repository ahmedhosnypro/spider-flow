package org.spiderflow.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 该注解用来标注自定义的方法注释，用来页面提示返回值类型
 * This annotation is used to mark the custom method annotation, which is used to prompt the return value type on the page
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Return {
	Class<?>[] value();
}
