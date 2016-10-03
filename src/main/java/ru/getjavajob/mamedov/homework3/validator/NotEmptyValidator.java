package ru.getjavajob.mamedov.homework3.validator;

import ru.getjavajob.mamedov.homework3.annotations.NotEmpty;
import ru.getjavajob.mamedov.homework3.exceptions.ValidationException;
import ru.getjavajob.mamedov.homework3.product.Product;

import java.lang.reflect.Field;

/**
 * Created by Ganzhenko on 22.09.2016.
 */
public class NotEmptyValidator implements Validator {
    @Override
    public boolean validate(Product product) throws ValidationException {
        Field[] fields = product.getClass().getDeclaredFields();
        for(Field field : fields) {
            if (field.isAnnotationPresent(NotEmpty.class)) {
                Object o = null;
                try {
                    field.setAccessible(true);
                    o = field.get(product);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (o.equals("")){
                   throw new ValidationException("Задано пустое значение!");
                }
            }
        }
        return true;
    }
}
