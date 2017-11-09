/*
 * Copyright (c) 2017 Land Inc. All rights reserved.
 * 项目名称：ssmdemo-parent
 * 文件名称：CannotContainSpacesValidator.java
 * Date：17-11-9 下午3:18
 * Author：LAND
 */

package com.land.annotation.validation.impl;

import com.land.annotation.validation.CannotContainSpaces;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by LAND on 2017/11/9.
 */
public class CannotContainSpacesValidator implements ConstraintValidator<CannotContainSpaces, String> {
    private int len;

    /**
     * 初始参数,获取注解中length的值
     */
    @Override
    public void initialize(CannotContainSpaces arg0) {
        this.len = arg0.length();
    }

    @Override
    public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
        if (str != null) {
            if (str.indexOf(" ") < 0) {
                return true;
            }
        } else {
            constraintValidatorContext.disableDefaultConstraintViolation();//禁用默认的message的值
            //重新添加错误提示语句
            constraintValidatorContext
                    .buildConstraintViolationWithTemplate("字符串不能为空").addConstraintViolation();
        }
        return false;
    }

}
