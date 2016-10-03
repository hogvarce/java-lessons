package ru.getjavajob.mamedov.homework3.validator;

import ru.getjavajob.mamedov.homework3.exceptions.ValidationException;
import ru.getjavajob.mamedov.homework3.product.Product;

/**
 * Created by Ganzhenko on 22.09.2016.
 */
public interface Validator {
    boolean validate(Product product) throws ValidationException, Exception;
}
