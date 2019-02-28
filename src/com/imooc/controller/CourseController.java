package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.imooc.model.Course;
import com.imooc.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	private CourseService courseService;
	
	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService=courseService;
	}
	
	@RequestMapping("/view1")
	public String viewCourse1() {
		System.out.println("ÊÇÔÚview1ÖÐ");
		return "course_overview";
	}
	
	
	@RequestMapping(value="/view",method=RequestMethod.POST)
	public String viewCourse(@RequestParam("courseId") Integer courseId,@RequestParam("courseNa") String courseNa,Model model) {
		System.out.println(courseId);
		System.out.println(courseNa);
		Course course=courseService.getCoursebyId(courseId);
		model.addAttribute(course);
		return "course_overview";
	}
	
}
