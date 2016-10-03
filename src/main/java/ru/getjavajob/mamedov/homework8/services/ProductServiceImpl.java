package ru.getjavajob.mamedov.homework8.services;

import ru.getjavajob.mamedov.homework8.models.Product;

import java.util.ArrayList;
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
}
