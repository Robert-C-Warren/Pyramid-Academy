package com.genspark.courseRegistry.DAO;

import com.genspark.courseRegistry.Entities.CourseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDAO extends JpaRepository<CourseInfo, Integer> {

}
