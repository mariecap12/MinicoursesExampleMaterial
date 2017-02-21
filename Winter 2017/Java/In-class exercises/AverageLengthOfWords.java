/*
* Finding the average length of a word from an array
* File: AverageLengthOfWords.java
* Author: Marc Cataford
* 
* Computes the average length of words within an array.
*/

public class AverageLengthOfWords {

    public static void main(String[] args) {
       //The given list of words
       String[] someWords = {"Hello,", "World", "Java", "is", "a", "pretty", "cool", "language", "despite", "all", "the", "keywords", "it", "contains", "and", "that", "make", "our", "lives", "a", "bit", "harder", "as", "students"};
       
       //First, we initialize our counter to 0. This will be our running sum for the summation used in the average.
       int sumLengths = 0;
       
       /*
       * For each word in our array, we get the length and add it to the current sum of lengths.
       * We use the .length() method to get the length of our strings.
       */
       for(int i = 0 ; i < someWords.length ; i = i + 1) {
           sumLengths = sumLengths + someWords[i].length();
       }
       
       /*
       * Once we have our sum, we use .length on the array to know how many words we had
       * and we divide the sum of lengths by the number of words, giving us our average.
       */
       double avgLengths = sumLengths / someWords.length;
       
       System.out.println("The average length of a word in the given array is " + avgLengths + " letters.");
    }
    
}
