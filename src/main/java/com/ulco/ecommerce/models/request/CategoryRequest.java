package com.ulco.ecommerce.models.request;

import lombok.Builder;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class CategoryRequest {
    private String name;

}
