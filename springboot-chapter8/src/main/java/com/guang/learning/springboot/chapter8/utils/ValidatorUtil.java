package com.guang.learning.springboot.chapter8.utils;

import com.guang.learning.springboot.chapter8.exception.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.HibernateValidatorConfiguration;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * 参数校验处理工具类
 */
@Slf4j
public class ValidatorUtil {

    private static Validator validator = ((HibernateValidatorConfiguration)
            Validation.byProvider(HibernateValidator.class).configure()).failFast(true).buildValidatorFactory().getValidator();

    /**
     * 实体校验
     * @param obj
     * @throws CommonException
     */
    public static <T> void validate(T obj) throws CommonException {

        Set<ConstraintViolation<T>> constraintViolations = validator.validate(obj, new Class[0]);

        if (constraintViolations.size() > 0) {

            ConstraintViolation<T> validateInfo = (ConstraintViolation<T>) constraintViolations.iterator().next();

            // validateInfo.getMessage() 校验不通过时的信息，即message对应的值

            throw new CommonException(1, validateInfo.getMessage());

        }

    }


}
