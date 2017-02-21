# SSMU MiniCourses - Introduction to Java

## Variables, arrays and loops I

### A - Creating and manipulating variables

#### Short questions

Determine if each of the following is true or false, and in either case, explain your reasoning.

- `int` is a __reference__ variable type.
- You can use the - operator (subtraction) on a String to achieve __concatenation__.
- Primitive types are __numerical__ types.
- A __method__ is the top-level container of our code.
- A __class__ must always have the same name as the file it is in.

#### Code analysis questions

Errors are present in the following snippet of code. Find, identify and correct those errors. Make sure to be able to justify why they are errors.

```java
public class HelloClass {

  public void main(String[] arg) {
    INT a = 1
    double b = 2;
    
    System.out.println('a + b = ' + (a + b));
    
    String = "Hello, World";
    System.out.println(helloWorld);
  }

```

#### Programming questions

__Problem 1__

Put together a short program that will calculate the tax on the price of three items part of a single purchase, respectively priced at 15$, 10$ and 19$, given that the tax rate is 15%. You can start using the stub below if you aren't sure of how to start off. The output of your program should be printed nicely and as a full sentence.

```java
public class taxCalculations {
  public static void main(String[] args) {
    double price1 = 15;
    double price2 = 10;
    double price3 = 19;
    
    //Your code starts here!
  }
}
```


### B - Loops

#### Code analysis questions

__Problem 1__

Can you explain _in plain English_ the structure of the loop below? Make sure that you can describe the first line, where the loop start, end and step are defined.

```java
for(int i = 0 ; i < 10 ; i = i + 1) {
  System.out.println(i);
}
```

__Problem 2__

If you run the following snippet of code, you will notice that while it compiles, the program stalls during execution. Can you find and fix the issue?

```java
int j = 0;
int i = 0;

while(j < 10) {

  for(i = 0 ; i < 10 ; i = i + 1) {
    System.out.println(j+i);
    j = j - 1;
  }
  
  j = j + 1;
}
```

__Problem 3__

Is the loop below functional? If so, can you explain how it works?

```java
int i = 0;

for(;;) {

  if(i >= 10) {
    break;
  }

  System.out.println(i);
  
  i = i + 1;
  
}
```

__Problem 4__

We know that we can transform any __for loop__ into a __while loop__ and vice versa. Can you 'translate' the loops below?

```java
int i = -10;

while(i < 0) {
  char letter = 'A' + i;

  System.out.println(letter);

  i = i + 1;
}

```

```java
int counter = 0;

for(int i = 2 ; i <= 100 ; i = i * i) {
  counter = counter + 1;
}

System.out.println("There are " + counter + " powers of 2 lesser or equal to 100!");
```

#### Programming questions

__Problem 1__

Write a short program that will compute the sum of all __even__ numbers under a certain integer, which you can define in a variable.

__Problem 2__

Starting from problem 1, can you also calculate the sum of all __odd__ numbers, and find out the difference between the two sums?

### C - Creating and manipulating arrays

#### Short questions

Determine if each of the following is true or false, and in either case, explain your reasoning.

- An array's length can be changed without recreating a new array.
- The __square bracket notation__ can be used to __access__ data from an array, but not to __modify it__.
- The __indexing system__ used by arrays has the first element be at position 0 and the last, at position (length - 2).
- You can store elements of different types inside of an array.
- The correct way to declare an empty array of `int` and length 5 is `int[] myArray = int[5];`.

#### Code analysis questions

Given the following snippet of code:
```java
char[] myCharacters = {'a','b','c','d'};
int[] myNumbers = new int[10];
```

What is the content of each array after the following statements are executed?

- `System.out.println(myCharacters[0]);`
- `myNumbers[5] = myCharacters[0];`
- `myNumbers[0] = myNumbers.length;`
- `myCharacters[0] = myCharacters[1]`
- `myCharacters = new char[10];`

#### Programming questions

__Problem 1__

Starting from the code snippet below, build a program that will convert the temperatures given in the `celsius` array into Kelvin and Fahrenheit degrees. Make sure to store your results in arrays as well. The position of an element in the `celsius` array should match the position of its equivalents in the other arrays.

```java
public class myTemperatureArrays {
  public static void main(String[] args) {
    double[] celsius = {26.5, 10.0, 0.0, 65};
    
    //Your code should start here!
  }
}
```

__Problem 2__

Given a sentence of variable length defined as a `String`, how would you calculate the _frequency_ at which each character appears? You should print a report composed of 26 lines, each line being of the format `letter: frequency`.

```java
public class frequencyOfLetters {
  public static void main(String[] args) {
    String mySentence = "This is a fairly long sentence that doesn't say much, but contains a variety of letters.";
    
    //Start here!
  }
}
```

_Hint: An array may be handy to organize your frequencies!_ 


