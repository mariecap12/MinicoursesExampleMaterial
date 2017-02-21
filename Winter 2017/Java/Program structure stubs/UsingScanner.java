/*
*
* Using the Scanner
* File: UsingScanner.java
* Author: Marc Cataford
* 
* USing the different methods that Scanner gives us, we can prompt the user for input!
*/


//First, we import the element into our program so we can use it.
import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        /*
        * We then create a Scanner variable and bind it to System.in, which
        * represents the standard input of our system.
        */
        Scanner input = new Scanner(System.in);
        
        
        //We can then use different methods to poll the user for data.
        System.out.println("Enter an integer.");
        int anInteger = input.nextInt();
        
        System.out.println("Enter a double.");
        double aDouble = input.nextDouble();
        
        System.out.println("Enter a word.");
        String aWord = input.next();
        
        //To make sure that we have captured data properly, we can print it out.
        System.out.println(anInteger + " " + aDouble + " " + aWord);
        
        //Finally, we 'unbind' the Scanner and the standard input to clean up.
        input.close();
