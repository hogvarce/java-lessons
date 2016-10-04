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
        switch(method) {
            case BUBBLE:
                int size = allProduct.size();
                Product temp;
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        Comparable productA = allProduct.get(j);
                        Comparable productB = allProduct.get(j + 1);
                        if (productA.compareTo(productB) > 0){
                            temp = allProduct.get(j);
                            allProduct.set(j, allProduct.get(j+1));
                            allProduct.set(j+1, temp);
                        }
                    }
                }
                break;
            case QUICK:
                break;
            case SHELLA:
                break;
        }
        return allProduct;
    }

}
