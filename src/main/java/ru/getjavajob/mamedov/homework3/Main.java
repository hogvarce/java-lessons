package ru.getjavajob.mamedov.homework3;


import ru.getjavajob.mamedov.homework3.product.Product;
import ru.getjavajob.mamedov.homework3.validator.Validator;
import ru.getjavajob.mamedov.homework3.validator.ValidatorImpl;

/**
 * Created by Ganzhenko on 22.09.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product();
        product.setTitle("ewtt");
        product.setCountOnStorage(10);
        product.setCount(2);
        product.setPrice(3.5);
        product.setCustomerId("ASA12");
        product.setCustomerEmail("admin@gmain.com");
        product.setCustomerPhone("+7 903 322 13 12");
        Validator validatorImpl = new ValidatorImpl();
        boolean validate = validatorImpl.validate(product);
        System.out.println("validate = " + validate);
    }
}
