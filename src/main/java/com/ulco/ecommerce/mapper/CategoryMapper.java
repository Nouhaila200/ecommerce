package com.ulco.ecommerce.mapper;

import com.ulco.ecommerce.models.request.CategoryRequest;
import com.ulco.ecommerce.models.response.CategoryResponse;
import com.ulco.ecommerce.repository.entities.*;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public Category toEntity(CategoryRequest categoryRequest){
        return Category.builder().name(categoryRequest.getName()).build();

    }
    public CategoryResponse toResponse(CategoryResponse category)
{
            return CategoryResponse.builder().id(category.getId()).name(category.getName())
            .build();

}
}






















