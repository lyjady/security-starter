package org.augutus.demo.constraint;

import org.augutus.demo.validator.UserStatus;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author LinYongJin
 * @date 2020/7/28 10:26
 */
public class UserStatusConstraint implements ConstraintValidator<UserStatus, Integer> {

    private Set<Integer> status;

    @Override
    public void initialize(UserStatus constraintAnnotation) {
        int[] values = constraintAnnotation.values();
        status = Arrays.stream(values).collect(HashSet::new, HashSet::add, HashSet::addAll);
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return status.contains(integer);
    }
}
