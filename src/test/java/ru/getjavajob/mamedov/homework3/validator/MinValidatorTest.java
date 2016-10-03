package ru.getjavajob.mamedov.homework3.validator;

import org.junit.Before;
import org.junit.Test;
import ru.getjavajob.mamedov.homework3.product.Product;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Ganzhenko on 22.09.2016.
 */
public class MinValidatorTest {

    MinValidator minValidator;

    @Before
    public void setUp() {
        minValidator = new MinValidator();
    }

    @Test
    public void validateTrue() throws Exception {
        Product product = new Product();
        product.setPrice(10);
        product.setCount(10);
        product.setCountOnStorage(10);
        boolean validate = minValidator.validate(product);

        assertTrue(validate);
    }

    @Test
    public void validateFalse() throws Exception {
        Product product = new Product();
        product.setPrice(-10);
        product.setCount(10);
        product.setCountOnStorage(10);

        boolean validate = minValidator.validate(product);

        assertFalse(validate);
    }

    @Test
    public void compare() throws Exception {

    }

}