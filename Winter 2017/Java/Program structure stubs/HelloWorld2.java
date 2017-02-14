/*
* Hello, world! 2
* File: HelloWorld2.java
* Author: Marc Cataford
* 
* A simple program that prints the variables we defined.
*/

public class HelloWorld2 {
  public static void main(String[] args) {
    /*
    * First, let's define a bunch of variables using the types
    * we saw earlier.
    *
    * We can assign appropriate values to each variable using
    * the = operator.
    *
    * Note that char values must be surrounded by single quotes.
    */
    int myInteger = 5;
    double myFractionalNumber = 1.2;
    char aLetter = 'C';
    boolean aBooleanValue = true;
    
    /*
    * Now that we know that the System.out.println() method will
    * print the parameter we put between its parentheses we can use
    * the variables we defined earlier.
    *
    * The value of the variable we use will be inserted and printed.
    */
    System.out.println(myInteger);
    System.out.println(myFractionalNumber);
    System.out.println(aLetter);
    System.out.println(aBooleanValue);
  }
}
