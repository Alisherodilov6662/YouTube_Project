package com.example.validation.emil;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ValidationEmail.class)
public @interface ValidEmail {
    String message() default "";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default {};
}
