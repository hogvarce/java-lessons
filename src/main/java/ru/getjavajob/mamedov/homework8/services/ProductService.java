package ru.getjavajob.mamedov.homework8.services;

import ru.getjavajob.mamedov.homework8.models.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void update(Product product);

    List<Product> getAll();

    List<Product> getSorted(SortMethod method);

}
