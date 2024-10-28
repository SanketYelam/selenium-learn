 package collection_framework;

import school_management_system.Student;

public class ArrayLearning {
	public static void main(String[] args) {
	
	int a; //declaration
	
	a=1;//initialization
	
	a=10;//assignment
	
	Object strArray[]=new Object[6]; //hetrogenous array
	
	int[] b = new int[5]; // array=homogenous data
	
	b[0]=5;
	
     b[1]=1;
     b[1]=2;
     b[1]=3;
     
     int c[] = {1,2,3};// decl and intialization

   System.out.println(c[0]);

     
     
     String d[]= {"a","b"};
     
	}
	
	public void student() {
		
		Student std[] = new Student[4];
		
		Student student[] = {new Student(),new Student()};//Object array
		
		student[0]=new Student();
		
		student[0].printStudDetails();
	
		
	}


}