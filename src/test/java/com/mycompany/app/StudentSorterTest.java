package com.mycompany.app;

import java.util.Arrays;

import junit.framework.TestCase;

public class StudentSorterTest extends TestCase {

	public StudentSorterTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void test() {
		StudentSorter ss=new StudentSorter();
		Student[] stuArr=new Student[3];
		stuArr[0]=new Student(17,27,"Raju");
		stuArr[1]=new Student(2,27,"Raju");
		stuArr[2]=new Student(30,25,"babu");
		
		Student[] expected=new Student[3];
		expected[0]=new Student(17,27,"Raju");
		expected[1]=new Student(2,27,"Raju");
		expected[2]=new Student(30,25,"babu");
		
		
		
		Student[] actual=ss.sortStudent(stuArr);
		int exp = expected[0].id;
		System.out.println(exp);
		int act=actual[0].id;
		System.out.println(act);
		System.out.println(Arrays.toString(actual));
		System.out.println(Arrays.toString(expected));
		//assertArrayEquals(expected, actual);
		assertEquals(exp,act);
		
		
	}

}
