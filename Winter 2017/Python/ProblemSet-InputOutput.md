# SSMU MiniCourses - Introduction to Python

## Input/Output

### User input

#### Short questions

Determine whether the following statements are true or false, and in either case, make sure you can explain why.

- When querying the user for input, whatever the user types is interpreted as a _String_.
- You can only ask the user for _one piece of data at a time_, which makes it trouble for the user to fill up a list of numbers, for example.
- It is customary to use a `print()` call to ask the user a question before using `input()` to capture data.
- Using the second parameter of `input()`, you can decide the type of the data that should be captured.

#### Programming questions

__Problem 1__

Write a script that will act as a _phone book_ each time it is run: it will first ask for _five_ name and phone number combinations, _store_ them in an appropriate data structure, and then allow the user to _retrieve_ a number using the name associated with it.

_Hint_: You should first decide which _data structure(s)_ is (or are) appropriate to store names and phone numbers. You can also decide if you need one or more method to accomplish this _without having to duplicate code_.

__Problem 2__

In a previous exercise, you wrote a _grade calculator_ that took as input a list of grades and calculated the letter grade to determine whether a student passed or failed a course. Either by _reusing code_ or by _rewriting it_, allow your grade calculator to take a list of grades of unknown length from the user.

### File input

#### Short questions

Determine whether the following statements are true or false, and in either case, make sure you can explain why.

- When opening a file in _read_ mode, you do not need to use `close()` to finish reading.
- You can use a relative or absolute path to point to a file when using `open()`.
- The second parameter of `open()` determines if you read or write, and the third, if you are operating on _human-readable characters_ or _binary data_.
- Once a file is opened, you can read through it using a _for loop_ just as if you were reading elements of a list.

#### Programming questions

__Problem 1__

Using the [English dictionary file](), build a _Scrabble word finder_. Your script should allow the user to _see if a word is valid_ and should display the _number of points_ associated with a word if one is found. You can refer to the [official rules of Scrabble](https://en.wikipedia.org/wiki/Scrabble_letter_distributions) for the per-letter point count.

__Problem 2__

Using the [City of Montreal's 2017 Fire Department logs](http://donnees.ville.montreal.qc.ca/dataset/701683f0-a838-4fe0-b4d6-a4964d9ea7f0/resource/36c26f05-3581-4706-9dc5-11c33bec29eb/download/donneesouvertes-interventions-sim.csv), answer the following:

- Set up your script to _read_ the contents of the file and _count_ how many entries there are.
- The 6th column of the file describes the _district_ in which the incident happened. Can you tally the incidents per district and display a results table of those tallies?
- The 2nd column of the file defines the _time_ at which each incident was logged. Can you identify which district is the most active in the past month? Since the start of 2017?
- Using your previous _standard deviation_ implementation, can you calculate the standard deviation of each district?
- Use the `w` mode to write the results that you have printed to the screen in the previous questions in a CSV file. You should then be able to open the output file in Excel or any other CSV editor.
