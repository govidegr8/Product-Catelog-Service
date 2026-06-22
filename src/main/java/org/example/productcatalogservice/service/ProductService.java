package org.example.productcatalogservice.service;

import org.example.productcatalogservice.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();

    public Product getProductById(String id);

    public Product createProduct(Product product);

    public Product updateProduct(Product product);

    public Product deleteProductById(String id);
}
