package com.genspark.courseRegistry.Controller;

import com.genspark.courseRegistry.Entities.CourseInfo;
import com.genspark.courseRegistry.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistryController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Welcome to The Course Navigator</H1></HTML>";
    }

    @GetMapping("/courses")
    public List<CourseInfo> getCourses() {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseID}")
    public CourseInfo getCourse(@PathVariable String courseID) {
        return this.courseService.getCourseByID(Integer.parseInt(courseID));
    }

    @PostMapping("/courses")
    public CourseInfo addCourse(@RequestBody CourseInfo courseInfo) {
        return this.courseService.addCourse(courseInfo);
    }

    @PutMapping("/courses")
    public CourseInfo updateCourse(@RequestBody CourseInfo courseInfo) {
        return this.courseService.updateCourseCatalog(courseInfo);
    }
    @DeleteMapping("/courses/{courseID}")
    public String deleteCourseByID(@PathVariable String courseID) {
        return this.courseService.deleteCourseById(Integer.parseInt(courseID));
    }
}
