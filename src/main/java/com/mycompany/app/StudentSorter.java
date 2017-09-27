package com.mycompany.app;
import java.util.Comparator;
import java.util.Arrays;
//Bean class to define properties

/*Category: Object Sorting

Create a Student class that represents the following information of a student: id, name, and age. 

Create a StudentSorter class with a sortStudent() method that accepts Student object. Sort the list based on their age in decreasing order. For student having same age, sort based on their name. For students having same name and age, sort them according to their iD. */
class Student{
	public int id;
	public int age;
	public String name;
	
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "[id="+ this.id+ ",age="+this.age +",name=" +this.name+ "]";
		
	}
	public Student(int id,int age,String name){
		this.id=id;
		this.age=age;
		this.name=name;
	}

}
//Using comparator interface
class Studentcomparatorbyage implements Comparator<Student>{

	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		int flag = arg1.getAge() - arg0.getAge();
        if(flag==0)
        	
        	flag = arg0.getName().compareTo(arg1.getName());
        	if(flag==0) flag= arg1.getId()-arg0.getId();
        	
 
        
		return flag;
	}
	
}
public class StudentSorter{
	public static Student[] sortStudent(Student[] stuArr) {
		Arrays.sort(stuArr, new Studentcomparatorbyage());
		System.out.println("Age and Name Sorting of students list:\n"+Arrays.toString(stuArr));
		System.out.println("ijnhhggh------------------"+stuArr.toString()  );
		return stuArr;
		
	}
	
	public static void main(String args[]) {
		Student[] stuArr=new Student[3];
		stuArr[0]=new Student(17,27,"Raju");
		stuArr[1]=new Student(2,27,"Raju");
		stuArr[2]=new Student(30,25,"babu");
		
		StudentSorter.sortStudent(stuArr);
		
		
		
		
	
	}
}
