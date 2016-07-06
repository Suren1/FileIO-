/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cms.dao;
import com.leapfrog.cms.entity.Course;
import java.util.List;
        
/**
 *
 * @author suren
 */
public interface CourseDAO {
    boolean addCourse(Course c);
    boolean editCourse(Course c);
    boolean deleteCourse(int id);
    Course getByID(int id);
    List<Course> showAll();
       
}
