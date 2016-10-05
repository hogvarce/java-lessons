package ru.getjavajob.mamedov.homework8;

import ru.getjavajob.mamedov.homework8.models.Product;
import ru.getjavajob.mamedov.homework8.services.CSVReaderImpl;
import ru.getjavajob.mamedov.homework8.services.ProductService;
import ru.getjavajob.mamedov.homework8.services.ProductServiceImpl;
import ru.getjavajob.mamedov.homework8.services.SortMethod;

import java.util.List;

/**
 * Created by Ganzhenko on 03.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Begin shop work!\n ------------------");

        ProductService shop = new ProductServiceImpl();
        CSVReaderImpl csv = new CSVReaderImpl();

        csv.setPathName("src/main/resources/data-example-2.csv");
        List<String[]> items = csv.read();

        for (String[] item : items) {
            Product product = new Product();
            product.setTitle(item[0]);
            product.setPrice(Double.parseDouble(item[2]));
            shop.addProduct(product);
        }


        System.out.println(shop.getAll());

        System.out.println("Сортировки...\n");

        System.out.println("Сортировка методом пузырька: \n" + shop.getSorted(SortMethod.BUBBLE));

        System.out.println("Сортировка методом Шелла: \n" + shop.getSorted(SortMethod.SHELLA));

        System.out.println("End shop work!\n ------------------");
    }
}
