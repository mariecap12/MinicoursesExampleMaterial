# SSMU MiniCourses - Introduction to Python

## Lists and loops II

### Combining loops and lists

#### Programming questions

__Problem 1__

Build a function that, when given a list of words and a single character, will output a list of all the words from the first list that had the given character either as their first letter or their last.

Your function should be declared like this:

```python
def filterWords(wordsList,character):
  #Your code
```

__Problem 2__

You can use Python lists to produce __matrices__ by using a list to contain other lists. In this case, we would declare this sort of 2D list by first declaring a list, then by appending lists to it:

```python
myMatrix = [[1,2,3],[4,5,6],[7,8,9]]

# This produces a matrix
# 1 2 3
# 4 5 6
# 7 8 9
```
That structure can be accessed by using the __square bracket notation__ twice: `myMatrix[0][0]` would access the first element of the first row, for example. Before playing with 2D lists further, make sure that you can use this notation properly to access all the elements of your matrix.

Using this, build a set of functions that implement __matrix addition__, __matrix scalar product__ and __matrix multiplication__. You should then confirm the correctness of your solution using 3x3 matrices (that way, you can confirm the results on paper). If you aren't certain of how those operations work, you should read up on [matrix addition](https://en.wikipedia.org/wiki/Matrix_addition), [scalar and matrix multiplcation](http://www.purplemath.com/modules/mtrxmult.htm).

__Problem 3__

Build a script that will find the __intersection__ of two lists (the elements that are common to both lists). Add in a function that will process the given lists to produce their __difference__. 

