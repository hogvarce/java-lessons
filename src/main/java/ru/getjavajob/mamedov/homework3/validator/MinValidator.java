package ru.getjavajob.mamedov.homework3.validator;

import ru.getjavajob.mamedov.homework3.annotations.Min;
import ru.getjavajob.mamedov.homework3.exceptions.ValidationException;
import ru.getjavajob.mamedov.homework3.product.Product;

import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * Created by Ganzhenko on 22.09.2016.
 */
public class MinValidator implements Validator {
    @Override
    public boolean validate(Product product) throws Exception {
        Field[] fields = product.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                Min minField = field.getAnnotation(Min.class);
                Number b = (Number) minField.min();
                Number a = (Number) field.get(product);
                if (compare(a, b) <= 0) {
                    throw new ValidationException("Задано значение меньше допустимого!");
                }
            }
        }
        return true;
    }
    public int compare(Number a, Number b){
        return new BigDecimal(a.toString()).compareTo(new BigDecimal(b.toString()));
    }
}
