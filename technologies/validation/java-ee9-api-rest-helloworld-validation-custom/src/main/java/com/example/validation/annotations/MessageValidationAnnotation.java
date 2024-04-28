package com.example.validation.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import com.example.validation.validators.MessageValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MessageValidator.class)
public @interface MessageValidationAnnotation {

    String message() default "Sorry, message can not be null";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}