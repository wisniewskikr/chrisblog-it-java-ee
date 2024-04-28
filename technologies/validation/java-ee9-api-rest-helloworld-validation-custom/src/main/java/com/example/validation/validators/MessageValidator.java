package com.example.validation.validators;

import com.example.validation.annotations.MessageValidationAnnotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MessageValidator implements ConstraintValidator<MessageValidationAnnotation, String> {

    @Override
    public boolean isValid(String message, ConstraintValidatorContext context) {
        return message != null;
    }
    
    

}