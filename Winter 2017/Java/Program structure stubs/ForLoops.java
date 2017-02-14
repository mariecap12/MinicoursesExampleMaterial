/*
* ForLoops.java
* Author: Marc Cataford
* Last modified: 14/2/2017
* 
* Explanation document for the usage of for loops.
*/

public class ForLoops {
  public static void main(String[] args) {
    /*
    * For loops are defined using this standard header:
    * 
    * for( counter ; continuation condition ; counter operation ) {
    *   //Code to be repeated.
    * }
    * 
    * The 'counter' usually is a variable that is incremented or decremented to count
    * cycles of the loop.
    *
    * The 'continuation condition' is a condition that is evaluated at every cycle. As
    * long as the condition is true, another cycle is possible.
    *
    * The 'counter operation' is a statement that is executed at the end of every cycle. 
    * It is often used to manipulate the loop's counter.
    */
    
    /*
    * For example, the following is a for loop that loops 10 times and prints the value of
    * its counter at every cycle.
    */
    
    for(int i = 0 ; i < 10 ; i = i + 1) {
      System.out.println("Counter variable i = " + i);
    }
    
    /*
    * In this case:
    * The counter is the variable i, declared within the loop,
    * The condition is i < 10,
    * The end of loop operation, i = i + 1, will increment i at every cycle.
    *
    * i will then take every integer value 0...9, and when it reaches 10, the
    * condition i < 10 is no longer true (since 10 < 10 is false) and the loop
    * will end.
    */
  }
  
  
}
