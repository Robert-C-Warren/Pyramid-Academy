package com.genspark.courseRegistry.Services;

import com.genspark.courseRegistry.Entities.CourseInfo;

import java.util.List;

public interface CourseService {
    List<CourseInfo> getAllCourses();
    CourseInfo getCourseByID(int id);
    CourseInfo addCourse(CourseInfo courseInfo);
    CourseInfo updateCourseCatalog(CourseInfo courseInfo);
    String deleteCourseById(int courseID);
}
