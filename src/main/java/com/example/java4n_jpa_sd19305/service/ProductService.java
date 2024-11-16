package com.example.java4n_jpa_sd19305.service;


import com.example.java4n_jpa_sd19305.entity.Product;
import com.example.java4n_jpa_sd19305.repository.ProductRepository;

import java.util.ArrayList;

public class ProductService {

    ProductRepository productRepository = new ProductRepository();

    public ArrayList<Product> getProducts() {

        return productRepository.getProducts();
    }

    public Product getProductById(Long id) {

        return productRepository.getProductById(id);
    }

    public void updateProduct(Product product) {

        productRepository.updateProduct(product);
    }

    public void deleteProduct(long id) {

        productRepository.deleteProduct(id);
    }

    public void addProduct(Product product) {

        productRepository.addProduct(product);
    }

}
