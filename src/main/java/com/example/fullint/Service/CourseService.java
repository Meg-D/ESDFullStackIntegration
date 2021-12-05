package com.example.fullint.Service;

import com.example.fullint.DAO.Implementation.CourseDAOImpl;
import com.example.fullint.bean.Courses;

public class CourseService {
    CourseDAOImpl courseDAO = new CourseDAOImpl(); //in DAO impl
    public boolean addCourse(Courses course){ //called from controller
        return courseDAO.addCourse(course); //calls the DAO method
    }
}
