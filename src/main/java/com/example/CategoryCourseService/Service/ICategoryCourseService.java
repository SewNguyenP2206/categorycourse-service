package com.example.CategoryCourseService.Service;




import com.example.CategoryCourseService.DTO.CreateCategoryCourseDTO;
import com.example.CategoryCourseService.DTO.ResponeCategoryNameDTO;
import com.example.CategoryCourseService.Entity.CategoryCourse;

import java.util.List;

public interface ICategoryCourseService {
   ResponeCategoryNameDTO createCategoryCourse(CreateCategoryCourseDTO dto) ;

    List<CategoryCourse> getCategoris();

    List<CategoryCourse> getCategoriesByCourseID(int id);

    public ResponeCategoryNameDTO fromCategoryToCategotyResponeNameDTO(CategoryCourse categoryCourse);


    public int DeleteCategoryCourseByCourseID(int courseId);

}
