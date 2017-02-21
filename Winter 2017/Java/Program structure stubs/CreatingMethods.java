/*
* Creating methods
* File: CreatingMethods.java
* Author: Marc Cataford
* 
* A few simple examples on how to create methods with varying input and return types.
*/

public class CreatingMethods {
  public static void main(String[] args) {
    printTwice(1,2);
    System.out.println(returnSum(1,2));
  }
  
  public static void printTwice(int myVar1, int myVar2) {
    System.out.println(myVar1);
    System.out.println(myVar2);
  }
  
  public static int returnSum(int myVar1, int myVar2) {
    return myVar1 + myVar2;
  }
}
