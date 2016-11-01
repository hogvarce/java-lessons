package ru.getjavajob.mamedov.homework11;

import ru.getjavajob.mamedov.homework8.models.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ganzhenko on 18.10.2016.
 */
public class Main2 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        recurse(productList);
        System.out.println("productList = " + productList);
    }

    static void recurse(List<Product> productList) {
        if (!(productList.size() > 10)){
            productList.add(new Product());
            recurse(productList);
        }
    }
}
