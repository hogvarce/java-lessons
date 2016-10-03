package ru.getjavajob.mamedov.homework3.validator;

import ru.getjavajob.mamedov.homework3.exceptions.ValidationException;
import ru.getjavajob.mamedov.homework3.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ganzhenko on 22.09.2016.
 */
public class ValidatorImpl implements Validator {

    private List<Validator> validators;

    public ValidatorImpl() {
        validators = new ArrayList<>();
        validators.add(new NotNullValidator());
        validators.add(new NotEmptyValidator());
        validators.add(new LessThanValidator());
        validators.add(new MinValidator());
        validators.add(new UppercaseValidator());
    }

    public boolean validate(Product product) {
        for (Validator validator : validators) {
            try {
                validator.validate(product);
            } catch (ValidationException e) {
                e.printStackTrace();
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return true;
    }
}
