public class ConditionalStatements {
  public static void main(String[] args) {
    /*
    * Conditional statements will allow you to make your program diverge from its normal execution path
    * depending on conditions that you define.
    *
    * That way, you can apply special processing when conditions are fulfilled. For example, you could save certain
    * pieces of data if it's large enough.
    *
    * They are defined in blocks:
    *
    * if(condition1) {
    * //Code.
    * } else if(condition2) {
    * //Code.
    * } else {
    * //Code.
    * }
    */
    
    /*
    * Given a variable A, we'll print "fizz" if A is larger than 5, "buzz" if A is smaller than 2, and "fizz buzz" otherwise:
    */
    
    //We declare and give A some value.
    int A = 6;
    
    //We declare our conditional statements:
    if(A > 5) {
      System.out.println("fizz");
    } else if(A < 2) {
      System.out.println("buzz");
    } else {
      System.out.println("fizz buzz"); 
    }
  }
}
