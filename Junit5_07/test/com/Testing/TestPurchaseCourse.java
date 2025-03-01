package com.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Testing.Course.JavaCourse;
import com.Testing.Course.PythonCourse;
import com.Testing.Service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void testProceedWithCourse() {
		PurchaseCourse obj = new PurchaseCourse();
		 boolean status = obj.proceedWithCourse(new JavaCourse());
//		 assertTrue(status);   //normal return true for java course 
		 
		 
		 //python return false 
		 assertFalse(obj.proceedWithCourse(new PythonCourse()),()->"failed bcz unit in result in true");  // status= false => test pass
	}

}
