package ru.getjavajob.mamedov.homework8;

import ru.getjavajob.mamedov.homework8.models.Product;
import ru.getjavajob.mamedov.homework8.services.ProductServiceImpl;

/**
 * Created by Ganzhenko on 03.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Begin shop work!\n ------------------");

        ProductServiceImpl shop = new ProductServiceImpl();

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.setTitle("Nokia 1280");
        product1.setPrice(300);

        product2.setTitle("IPhone 7");
        product2.setPrice(70000);

        product3.setTitle("Nexus 6");
        product3.setPrice(25000);

        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        System.out.println(shop.getAll());

        product1.setPrice(1000);
        shop.update(product1);

        System.out.println(shop.getAll());

        System.out.println("End shop work!\n ------------------");
    }
}
