package com.Testing.Course;

public class JavaCourse implements Course {
	
	@Override
	 public boolean coursePurchased() {
		System.out.println("java course purchased");
		return true;
		
	}
}
