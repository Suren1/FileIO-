/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cms;

import com.leapfrog.cms.dao.CourseDAO;
import com.leapfrog.cms.dao.impl.courseDAOImpl;
import com.leapfrog.cms.entity.Course;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author suren
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //FileWriter wirter= new FileWriter("G:/Cources.csv");
            
            
            
            BufferedReader  reader = new BufferedReader(new FileReader("G:\\Courses.csv"));
            String line="";
            CourseDAO courseDAO= new courseDAOImpl();
            while((line= reader.readLine())!=null)
            {
                String[] tokens=line.split(",");
                if(tokens.length>=4){
                    Course course = new Course();
                    course.setId(Integer.parseInt(tokens[0]));
                    course.setName(tokens[1]);
                    course.setDescription(tokens[2]);
                    course.setFees(Double.parseDouble(tokens[3]));
                    course.setStatus(tokens[4].equals("1")?true:false);
                    
                    courseDAO.addCourse(course);
                    
                }    
               
            }
            reader.close();
        
            courseDAO.showAll().forEach(c->{
                System.out.println(c.getName()   );
        });
        }
        catch(IOException ioe){
        System.out.println(ioe.getMessage());
    }
    
}}
