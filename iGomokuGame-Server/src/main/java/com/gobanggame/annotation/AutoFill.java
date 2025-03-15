package com.gobanggame.annotation;

import com.gobanggame.constant.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: 自定义注解，公共字段自动填充
 **/

@Target(ElementType.METHOD) // 作用域限制为方法
@Retention(RetentionPolicy.RUNTIME)  // 生命周期限制为运行时
public @interface AutoFill {
    OperationType value();
}

