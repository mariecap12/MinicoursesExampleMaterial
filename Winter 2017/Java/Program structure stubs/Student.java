/*
*	Student.java
*
*	Author: Marc Cataford
* Last updated: 7-3-2017
*
* An example object representing a student. Demonstrates what a 
* constructor is, what instance variables are, and what a general
* instance method looks like.
*/

public class Student {
	/*
	* INSTANCE VARIABLES represent properties or qualities that belong
	* with the object. In this case, the properties of a student are,
	* amongst others, their name, age, ID number and the list of courses
	* they are taking.
	*/
	
	String studentName;
	int studentAge;
	String studentID;
	String[] coursesTaken;
	
	/*
	* The CONSTRUCTOR is a special method that creates the object. It
	* prepares the object to be used by setting instance variables to their
	* initial value (whether set by default or based on parameters) and executes
	* any tasks that need to be done when creating the object.
	*/
	
	public Student(String name, int age, String ID, String[] courses) {
		//Here, our constructor sets all the instance variables using the parameters given.
		studentName = name;
		studentAge = age;
		studentID = ID;
		coursesTaken = courses;
		
		//It also prints a message to notify the user that the object has been created.
		System.out.println("Created a new student!");
	}
	
	/*
	* INSTANCE METHODS are general 'actions' that can be executed by our object.
	* They can modify the instance variables, print out information, or execute any sort
	* of process that Java can implement.
	*
	* In this case, introduceYourself() simple prints a small paragraph introducing the user.
	* Notice that the instance variables are used to customize the output. Since we can set
	* the instance variables to our liking when creating the object, each object is independent
	* from other objects of the same type.
	*/
	
	public void introduceYourself() {
		//Here, we print a simple concatenated sentence.
		System.out.println("Hello! My name is " + studentName + ", I am " + studentAge + " years old and my student identification number is " + studentID);
		
		//Using conditionals, we can print the list of courses, if any.
		if(coursesTaken.length > 0) {
			System.out.println("I am taking " + coursesTaken.length + " courses:");
			for(int i = 0 ; i < coursesTaken.length ; i = i + 1) {
				System.out.println(coursesTaken[i]);
			}
		}
	}
	
}