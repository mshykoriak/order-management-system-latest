package com.order.system.service.impl;

import com.order.system.controller.dto.ProductDTO;
import com.order.system.entity.Product;
import com.order.system.mapper.ProductDataMapper;
import com.order.system.repository.ProductRepository;
import com.order.system.service.ProductService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductDataMapper mapper;
    private ProductRepository productRepository;

    @Override
    public void save(ProductDTO request) {
        productRepository.save(mapper.from(request));
    }

    @Override
    public List<ProductDTO> findAll() {
        return productRepository.findAll().stream()
                .map(mapper::from)
                .toList();
    }
}
