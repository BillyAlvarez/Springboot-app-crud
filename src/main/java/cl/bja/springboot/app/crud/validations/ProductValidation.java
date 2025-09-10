package cl.bja.springboot.app.crud.validations;

import cl.bja.springboot.app.crud.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ProductValidation implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        Product product = (Product) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null,"es requerido !!");
        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "NotEmpty.product.description");
        if (product.getName() == null || product.getName().trim().equals("")) {
            errors.rejectValue("name", null,"es requerido !!");
        }
        if (product.getDescription() == null || product.getDescription().trim().equals("")) {
            errors.rejectValue("description", null,"es requerido por favor !!");
        }
        if (product.getPrice() == null) {
            errors.rejectValue("price", null,"no puede ser nulo, ok!");
        }else if (product.getPrice() < 500) {
            errors.rejectValue("price", null,"debe ser un valor numerico mayor o igual que {value}!!");
        }
    }
}
