package com.Testing.Service;

import com.Testing.Course.Course;

public class PurchaseCourse {

	private Course course;
	public boolean proceedWithCourse(Course course) { //Course course = new JavaCourse
		return course.coursePurchased();
	}
}
