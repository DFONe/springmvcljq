package com.imooc.service;

import org.springframework.stereotype.Service;

import com.imooc.model.Course;

@Service
public interface CourseService {
	Course getCoursebyId(Integer courseId);
}
