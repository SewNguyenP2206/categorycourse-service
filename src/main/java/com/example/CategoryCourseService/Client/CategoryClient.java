package com.example.CategoryCourseService.Client;


import com.example.CategoryCourseService.DTO.ResponeCategoryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CATEGORY-APP",path = "/api/category")
public interface CategoryClient {
    @GetMapping("/getCategoryById/{id}")
    public ResponeCategoryDTO getCategoryById(@PathVariable int id);
}
