package com.jackson.adoteumpet.api.pet.validators;

import com.jackson.adoteumpet.core.repositories.PetRepossitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class PetExistsByIdValidator implements ConstraintValidator<PetExistsById, Long> {

    @Autowired
    private PetRepossitory petRepossitory;
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null){
            return  true;
        }
        return petRepossitory.existsById(value);
    }
}
