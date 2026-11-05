package com.order.system.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.math.BigDecimal;
@Builder
public record ProductDTO(Long id,
                         @NotBlank(message = "name must be not blank")
                                   @Size(min = 3, max = 50)
                                   String name,
                         @NotBlank(message = "description must be not blank")
                                   @Size(min = 10, max = 100, message = "description size must be between 10 and 100")
                                   String description,
                         @NotNull
                                   BigDecimal price,
                         @NotBlank(message = "category must be not blank")
                                   @Size(min = 2, max = 20)
                                   String category,
                         @NotBlank(message = "status must be not blank")
                                   @Size(min = 3, max = 20, message = "status size must be between 3 and 20")
                                   String status){
}
