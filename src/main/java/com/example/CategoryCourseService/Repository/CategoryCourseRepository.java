package com.example.CategoryCourseService.Repository;


import com.example.CategoryCourseService.Entity.CategoryCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CategoryCourseRepository extends JpaRepository<CategoryCourse,Integer> {

    public List<CategoryCourse> findByCourseId(int id);

    @Modifying
    @Transactional
    @Query("DELETE FROM CategoryCourse c WHERE c.courseId = ?1")
    int deleteCategoryCourseByCourseID(int courseId);


}
