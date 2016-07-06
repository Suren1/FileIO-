package com.leapfrog.cms.dao.impl;

import com.leapfrog.cms.dao.CourseDAO;
import com.leapfrog.cms.entity.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suren
 */
public class courseDAOImpl implements CourseDAO{
    private List<Course> courseList= new ArrayList<Course>();

    @Override
    public boolean addCourse(Course c) {
        return courseList.add(c);
    }

   
    @Override
    public boolean deleteCourse(int id) {
        Course c= getByID(id);
        if (c!=null){
            courseList.remove(c);
            return true;
        }
        return false;
    }

    @Override
    public Course getByID(int id) {
     for(Course s: courseList){
         return s;
     }
     return null;
    }

    @Override
    public List<Course> showAll() {
        return courseList;
    }

   
    @Override
    public boolean editCourse(Course c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
