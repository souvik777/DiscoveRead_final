package com.example.erp.dao;

import com.example.erp.bean.Course_Schedule;
import com.example.erp.bean.Courses;
import com.example.erp.bean.Students;

import java.util.List;

public interface StudentDao {

    Students emailVerify(Students student);
    boolean registerStudent(Students student);
    List<Course_Schedule> getCourse(Students student);
}