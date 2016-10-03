package ru.getjavajob.mamedov.homework3.validator;

import ru.getjavajob.mamedov.homework3.annotations.LessThan;
import ru.getjavajob.mamedov.homework3.exceptions.ValidationException;
import ru.getjavajob.mamedov.homework3.product.Product;

import java.lang.reflect.Field;

/**
 * Created by Ganzhenko on 22.09.2016.
 */
public class LessThanValidator implements Validator {

    @Override
    public boolean validate(Product product) throws Exception {
        Field[] fields = product.getClass().getDeclaredFields();
        for(Field field : fields) {
            if (field.isAnnotationPresent(LessThan.class)) {
                LessThan lessThan = field.getAnnotation(LessThan.class);
                String fieldName = lessThan.fieldName();
                Field secondField = product.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);
                secondField.setAccessible(true);
                Integer countOnStorage = (Integer) secondField.get(product);
                Integer count = (Integer) field.get(product);
                if (count > countOnStorage) {
                    throw new ValidationException("Превышение допустимого количества!");
                }
            }
        }
        return true;
    }
}
