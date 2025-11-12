package com.ulco.ecommerce.models.response;
import lombok.Builder;
import com.ulco.ecommerce.repository.entities.Category;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class CategoryResponse {
    Category category;



}

