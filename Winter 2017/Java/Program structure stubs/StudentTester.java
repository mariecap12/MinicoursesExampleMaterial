/*
*	StudentTester.java
*
*	Author: Marc Cataford
* Last updated: 7-3-2017
*
* A driver class for our Student object. Creates an object and invokes instance methods.
*/

public class StudentTester {
	
	public static void main(String[] args) {
		//First, we create an array containing course titles.
		String[] courses = {"Chemistry", "Biology", "Basket-weaving"};
		
		/*
		* Using the 'new' keyword, we call the constructor to build a new
		* Student object. The parameters given to it will be passed on
		* to the instance variables.
		*/
		
		Student testStudent = new Student("Bob",25,"0001",courses);
		
		/*
		*	We can call the instance methods by appending their name to the end
		* of the object on which we are applying them.
		*/
		
		testStudent.introduceYourself();
	}
}