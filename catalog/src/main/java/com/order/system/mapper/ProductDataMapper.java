package com.order.system.mapper;

import com.order.system.controller.dto.ProductDTO;
import com.order.system.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDataMapper {

    public Product from(ProductDTO createRequest) {
        return Product.builder()
                .name(createRequest.name())
                .category(createRequest.category())
                .description(createRequest.description())
                .price(createRequest.price())
                .status(createRequest.status())
                .build();
    }

    public ProductDTO from(Product product) {
        return ProductDTO.builder()
                .name(product.getName())
                .category(product.getCategory())
                .description(product.getDescription())
                .price(product.getPrice())
                .status(product.getStatus())
                .id(product.getId())
                .build();
    }
}
