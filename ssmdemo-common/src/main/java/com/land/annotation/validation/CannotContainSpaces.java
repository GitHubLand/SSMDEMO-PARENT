/*
 * Copyright (c) 2017 Land Inc. All rights reserved.
 * 项目名称：ssmdemo-parent
 * 文件名称：CannotContainSpaces.java
 * Date：17-11-9 下午3:16
 * Author：LAND
 */

package com.land.annotation.validation;

import com.land.annotation.validation.impl.CannotContainSpacesValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Created by LAND on 2017/11/9.
 */
/**
 * 不能包含空格的校验注解
 */
@Constraint(validatedBy = CannotContainSpacesValidator.class) //具体的实现
@Target({java.lang.annotation.ElementType.METHOD,
        java.lang.annotation.ElementType.FIELD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
public  @interface CannotContainSpaces {
    String message() default "不能包含空格"; //提示信息,可以写死,可以填写国际化的key

    int length() default 5;

    //下面这两个属性必须添加
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
