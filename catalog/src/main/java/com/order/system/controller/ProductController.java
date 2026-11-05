package com.order.system.controller;

import com.order.system.controller.dto.ProductDTO;
import com.order.system.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<String> addProduct(@Valid @RequestBody ProductDTO createRequest) {
        productService.save(createRequest);
        return ResponseEntity.ok("Product with name: \"" + createRequest.name() + "\" successfully added.");
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductDTO>> findProducts() {
        return ResponseEntity.ok(productService.findAll());
    }


}
