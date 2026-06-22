package org.example.productcatalogservice.service.impl;

import org.example.productcatalogservice.model.Product;
import org.example.productcatalogservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(String id) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
