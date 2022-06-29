package com.genspark.courseRegistry.Services;

import com.genspark.courseRegistry.DAO.CourseDAO;
import com.genspark.courseRegistry.Entities.CourseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDAO courseDAO;

    @Override
    public List<CourseInfo> getAllCourses() {
        return this.courseDAO.findAll();
    }

    @Override
    public CourseInfo getCourseByID(int id) {
        Optional <CourseInfo> c = this.courseDAO.findById(id);
        CourseInfo courseInfo = null;
        if(c.isPresent()) {
            courseInfo = c.get();
        } else {
            throw new RuntimeException(" Course not found for id: " + id);
        }

        return courseInfo;
    }

    @Override
    public CourseInfo addCourse(CourseInfo courseInfo) {
        return this.courseDAO.save(courseInfo);
    }

    @Override
    public CourseInfo updateCourseCatalog(CourseInfo courseInfo) {
        return this.courseDAO.save(courseInfo);
    }

    @Override
    public String deleteCourseById(int courseID) {
        this.courseDAO.deleteById(courseID);
        return "Deleted Successfully";
    }
}
