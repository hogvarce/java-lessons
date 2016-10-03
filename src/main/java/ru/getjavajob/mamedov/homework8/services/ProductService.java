package ru.getjavajob.mamedov.homework8.services;

import ru.getjavajob.mamedov.homework8.models.Product;

import java.util.List;

/**
 * Created by Ganzhenko on 03.10.2016.
 */
public interface ProductService {

    void addProduct(Product product);

    void update(Product product);

    List<Product> getAll();

}
