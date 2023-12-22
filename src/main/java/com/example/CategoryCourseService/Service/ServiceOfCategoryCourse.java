package com.example.CategoryCourseService.Service;



import com.example.CategoryCourseService.Client.CategoryClient;
import com.example.CategoryCourseService.DTO.CreateCategoryCourseDTO;
import com.example.CategoryCourseService.DTO.ResponeCategoryDTO;
import com.example.CategoryCourseService.DTO.ResponeCategoryNameDTO;
import com.example.CategoryCourseService.Entity.CategoryCourse;
import com.example.CategoryCourseService.Repository.CategoryCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ServiceOfCategoryCourse implements ICategoryCourseService {

    @Autowired
    CategoryCourseRepository categoryRepository;

    @Autowired
    CategoryClient categoryClient;



    @Override
    public ResponeCategoryNameDTO fromCategoryToCategotyResponeNameDTO(CategoryCourse categoryCourse) {
        ResponeCategoryNameDTO responeCategoryNameDTO = new ResponeCategoryNameDTO();
        ResponeCategoryDTO category = categoryClient.getCategoryById(categoryCourse.getCategoryId());
        if (category != null) {
            responeCategoryNameDTO.setName(category.getName());
        }
        return responeCategoryNameDTO;
    }
    @Override
    public ResponeCategoryNameDTO createCategoryCourse(CreateCategoryCourseDTO dto) {
        CategoryCourse category = new CategoryCourse();
        category.setCategoryId(dto.getCategoryId());
        category.setCourseId(dto.getCourseId());
        return fromCategoryToCategotyResponeNameDTO(categoryRepository.save(category));
    }


    @Override
    public int DeleteCategoryCourseByCourseID(int courseId)
    {
        return categoryRepository.deleteCategoryCourseByCourseID(courseId);
    }



    @Override
    public List<CategoryCourse> getCategoris() {

        return categoryRepository.findAll();
    }

    @Override
    public List<CategoryCourse> getCategoriesByCourseID(int id) {
        return categoryRepository.findByCourseId(id);
    }
}
