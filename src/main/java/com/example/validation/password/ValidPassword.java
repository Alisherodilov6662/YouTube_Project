package com.example.validation.password;

import com.example.validation.password.ValidationPassword;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ValidationPassword.class)
public @interface ValidPassword {
    String message() default "";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default {};
}
