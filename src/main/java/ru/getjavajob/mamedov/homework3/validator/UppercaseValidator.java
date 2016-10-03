package ru.getjavajob.mamedov.homework3.validator;

import ru.getjavajob.mamedov.homework3.annotations.Uppercase;
import ru.getjavajob.mamedov.homework3.exceptions.ValidationException;
import ru.getjavajob.mamedov.homework3.product.Product;

import java.lang.reflect.Field;

/**
 * Created by Ganzhenko on 22.09.2016.
 */
public class UppercaseValidator implements Validator {

    @Override
    public boolean validate(Product product) throws Exception {
        Field[] fields = product.getClass().getDeclaredFields();
        for (Field field: fields) {
            if (field.isAnnotationPresent(Uppercase.class)) {
                field.setAccessible(true);
                String customerId = (String) field.get(product);
                if (customerId.equals(customerId.toLowerCase())) {
                     throw new ValidationException("В значение есть не заглавные буквы!");
                }
            }
        }
        return true;
    }
}
