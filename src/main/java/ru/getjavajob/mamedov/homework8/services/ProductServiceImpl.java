package ru.getjavajob.mamedov.homework8.services;

import ru.getjavajob.mamedov.homework8.models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ganzhenko on 03.10.2016.
 */
public class ProductServiceImpl implements ProductService {

    private List<Product> allProduct = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
         allProduct.add(product);
    }

    @Override
    public void update(Product product) {
         for (Product productIterable : allProduct) {
            if (productIterable.getId() == product.getId()) {
                product = productIterable;
            }
         }
    }

    @Override
    public List<Product> getAll() {
        return allProduct;
    }

    public List<Product> getSorted(SortMethod method) {
        int size = allProduct.size();
        switch(method) {
            case BUBBLE:
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        Comparable productA = allProduct.get(j);
                        Comparable productB = allProduct.get(j + 1);
                        if (productA.compareTo(productB) > 0){
                            allProduct.set(j, (Product) productB);
                            allProduct.set(j+1,(Product) productA);
                        }
                    }
                }
                break;
            case FAST:

                break;
            case SHELLA:
                int i, j, step;
                for (step = size / 2; step > 0; step /= 2) {
                    for (i = step; i < size; i++) {
                        Comparable productA = allProduct.get(i);
                        for (j = i; j >= step; j -= step) {
                            Comparable productB = allProduct.get(j - step);
                            if (productA.compareTo(productB) < 0)
                                allProduct.set(j, (Product) productB);
                            else
                                break;
                        }
                        allProduct.set(j, (Product) productA);
                    }
                }
                break;
        }
        return allProduct;
    }

}
