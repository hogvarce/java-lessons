package ru.getjavajob.mamedov.homework3.validator;

import org.junit.Before;
import org.junit.Test;
import ru.getjavajob.mamedov.homework3.product.Product;

import static org.junit.Assert.*;

/**
 * Created by Ganzhenko on 22.09.2016.
 */
public class LessThanValidatorTest {
    LessThanValidator lessThanValidator;
    Product product;

    @Before
    public void setUp() {
        lessThanValidator = new LessThanValidator();
        product = new Product();
    }

    @Test
    public void validateTrue() throws Exception {
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= i; j++) {
                product.setCountOnStorage(j);
                product.setCount(i);
                boolean validate = lessThanValidator.validate(product);
                assertTrue(validate);
            }
        }
    }

    @Test
    public void validateFalse() throws Exception {
        for (int i = 1; i <= 100; i++) {
            for (int j = i+1; j <= i; j++) {
                product.setCountOnStorage(i);
                product.setCount(j);
                boolean validate = lessThanValidator.validate(product);
                assertFalse(validate);
            }
        }
    }

}