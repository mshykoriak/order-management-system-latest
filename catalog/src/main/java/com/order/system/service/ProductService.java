package com.order.system.service;

import com.order.system.controller.dto.ProductDTO;
import com.order.system.entity.Product;

import java.util.List;

public interface ProductService {

    void save(ProductDTO request);
    List<ProductDTO> findAll();
}
