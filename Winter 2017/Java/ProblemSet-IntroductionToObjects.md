# SSMU MiniCourses - Introduction to Java

## Introduction to Objects

### A - Designing objects

#### Short questions

Determine whether the following statements are true or false, make sure to know why either way.

- _Object_ and _primitive type_ refers to the same concept.
- Strings are objects.
- An object can have other objects as _instance variables_.
- Objects of the same type are _independent_ from each other.
- A _constructor_ is a type of instance method and cannot have the same name as the class it is in.

#### Programming questions

__Problem 1__

Implement a _reference type_ that represents a _sentence_. You can use any type, pattern or element available to you.

Your `Sentence` type should be able to do the following:

- Contain a sentence of any length,
- Print and/or return the number of _words_ in the sentence when queried (ie. using an instance method),
- Return the sentence as uppercase (each letter of each word should be uppercase) or lowercase,
- Print and/or return the number of _characters_, not counting spaces, that it contains,
- Return the _longest word_ that it contains.

__Challenge:__ Can you modify your _driver program_ so that it prompts the user for a sentence to use instead of hardcoding one?

_Hint:_ A `String` such as "Hello World!" can be split into an array of Strings by using the `.split(sep)` method on it. The `sep` parameter is a character that will be used as a separator for the split.

For example, if your String is "I_am_Marc", using `split(' ')` on it will give you the array ["I", "am", "Marc"]. You can find more information in `split(sep)` [here](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)).

__Problem 2__

Expanding from the [example in the slides](http://tinyurl.com/zkfrbpr), implement an object that would model a _classroom_ of students. You already have a basic `Student` object which you can build upon.

Your `Classroom` object should allow you set a maximum number of students who can be enrolled at once in the class, to _add_ and _remove_ students depending on vacancy, and to produce a list of student IDs, names and ages based on who is enrolled.

_Hint:_ This one is a bit harder, first, think of how you could store _multiple_ `Student` objects together. Consider that your class has a _static size_ which cannot change.