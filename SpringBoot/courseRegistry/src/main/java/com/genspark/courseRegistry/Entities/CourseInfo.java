package com.genspark.courseRegistry.Entities;

import javax.persistence.*;

@Entity
@Table(name="tbl_courses")
public class CourseInfo {

    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseID;
    private String courseName;
    private String instructor;

    public CourseInfo() {
    }

    public CourseInfo(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
