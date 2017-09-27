package com.mycompany.app;
//Bound class of generics
/*Category: Generic

Create a generic class in which we want to access the group of objects from same family.

Create 3 classes A,B and C which having the same method inside of all classes .A is a super 
class of B and C. Create generic class Bound  and  try to access the method inside the class 
using that Bound class.*/
class Bound<T extends A>{
	public T objRef;
	public Bound(T  objRef) {
		// TODO Auto-generated constructor stub
		this.objRef=objRef;
	}

	public void doRunTest() {
		this.objRef.displayClass();
	}
	
}
//Here A is parent class of B and C
class A{
	public void displayClass() {
		System.out.println("This is class A method");
	}
}
//B is child of class A
class B extends A{
	public void displayClass() {
		System.out.println("This is class B method");
	}
}
//C is child of class A
class C extends A{
	public void displayClass() {
		System.out.println("This is class C method");
	}
}
public class BoundedClass {
	public static void main(String args[]) {
		Bound<A> boundA=new Bound<A>(new A());
		boundA.doRunTest();
		Bound<B> boundB=new Bound<B>(new B());
		boundB.doRunTest();
		Bound<C> boundC=new Bound<C>(new C());
		boundC.doRunTest();
	}

}
