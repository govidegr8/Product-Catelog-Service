package org.example.productcatalogservice.controller;

import org.example.productcatalogservice.DTO.ProductDTO;
import org.example.productcatalogservice.model.Product;
import org.example.productcatalogservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

//    get all products
    @GetMapping
    public List<ProductDTO> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        List<ProductDTO> productDTOs = new ArrayList<>();
//        map products to productDTO.
        for (Product product : products) {
            ProductDTO productDTO = new ProductDTO();

        }
        return productDTOs;
    }

//    get a product based on id
    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable String id) {
        Product product = productService.getProductById(id);
        ProductDTO productDTO = new ProductDTO();
//        map product to productDTO
        return productDTO;
    }

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
        return productDTO;
    }

    @PutMapping
    public ProductDTO updateProduct(@RequestBody ProductDTO productDTO) {
        return productDTO;
    }

    @DeleteMapping
    public ProductDTO deleteProductById(@RequestBody ProductDTO productDTO) {
        return productDTO;
    }
}
