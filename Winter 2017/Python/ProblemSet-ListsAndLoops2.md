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
```

In this case, we obtain the matrix:

1 2 3

4 5 6

7 8 9

Using this, build a set of functions that implement __matrix addition__, __matrix scalar product__ and __matrix cross product__. You should then confirm the correctness of your solution using 3x3 matrices (that way, you can confirm the results on paper). If you aren't certain of how those operations work, you should read up on [matrix addition](), [matrix scalar product]() and [matrix cross product]().

