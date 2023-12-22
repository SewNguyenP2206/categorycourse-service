package com.example.CategoryCourseService.Controller;

import com.example.CategoryCourseService.DTO.CreateCategoryCourseDTO;
import com.example.CategoryCourseService.DTO.ResponeCategoryNameDTO;
import com.example.CategoryCourseService.Entity.CategoryCourse;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/categoryCourse")
public interface ICategoryCourseController {

    @PostMapping("/deleteCategoryCourse")
    int DeleteCategoryCourseByCourseID(@RequestParam  int courseId);


    @PostMapping("/getCategoriesByCourseID")
    List<ResponeCategoryNameDTO> getCategoriesByCourseID(@RequestParam int id);

    @GetMapping("/getCategoris")
    List<CategoryCourse> getCategoris();

    @PostMapping("/createCategoryCourse")
    ResponeCategoryNameDTO createCategoryCourse(@RequestBody CreateCategoryCourseDTO dto) ;
}
