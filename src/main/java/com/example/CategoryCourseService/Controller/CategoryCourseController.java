package com.example.CategoryCourseService.Controller;

import com.example.CategoryCourseService.Client.CategoryClient;
import com.example.CategoryCourseService.DTO.CreateCategoryCourseDTO;
import com.example.CategoryCourseService.DTO.ResponeCategoryNameDTO;
import com.example.CategoryCourseService.Entity.CategoryCourse;
import com.example.CategoryCourseService.Service.ServiceOfCategoryCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryCourseController implements ICategoryCourseController{

    @Autowired
    ServiceOfCategoryCourse serviceOfCategoryCourse;

    @Autowired
    CategoryClient categoryClient;
    @Override
    public int DeleteCategoryCourseByCourseID(int courseId) {
        return serviceOfCategoryCourse.DeleteCategoryCourseByCourseID(courseId) ;
    }

    @Override
    public List<ResponeCategoryNameDTO> getCategoriesByCourseID(int id) {
        return serviceOfCategoryCourse.getCategoriesByCourseID(id).stream().map(categoryCourse -> serviceOfCategoryCourse.fromCategoryToCategotyResponeNameDTO(categoryCourse)).toList();
    }

    @Override
    public List<CategoryCourse> getCategoris() {
        return serviceOfCategoryCourse.getCategoris();
    }

    @Override
    public ResponeCategoryNameDTO createCategoryCourse(CreateCategoryCourseDTO dto) {
        return serviceOfCategoryCourse.createCategoryCourse(dto);
    }
}
