# Lecture Activity 4 - Instructions

In lecture activity 4, we will practice writing some more Java programs taking in user inputs and also include some conditional statements. 

## General instructions for creating Java files

For each of the following Tasks, create a separate Java file called task1.java, task2.java, task3.java etc... 

Remember, to create a new file, first navigate to this directory locally using `cd path/to/this/repo` and then type: `code task1.java`.
This will open a new file called `task1.java` in Visual Studio Code.
You can also work in Geany, or Eclipse, it's your choice.


```
public class task1 {

	public static void main(String[] args) {
	  // Enter your code
	}
  
}
```

Don't forget to change the name of the public class method for each file!

## Task 1: Conditionally printing integers

Write Java code that prompts the user to enter an integer, and then print the corresponding message.

Write a program that prompts the user to enter an integer. 

- If the number is a multiple of 5, print HiFive. 
- If the number is divisible by 2, print HiEven.
- That is, you could have one of the following three outputs:
	- HiFive
	- HiEven
	- HiFive HiEven

*Hint: Use if and else statements, combined with remainder operator `%`.*

## Task 2: Conditionally assigning variables

Write Java code that accepts an integer number between 0 and 100 that corresponds to a course grade. 

Your program should have the following requirements:

- If the integer `n` is greater than 0, assign “positive” to a `String` called `type`. If it's anything else, print out a message saying the number is invalid.
- If the integer `n` is larger than or equal to 50, 
assign "passed" to a `String` called `status` and then print it out.
- If the integer `n` is less than 50, assign "try again!" to a `String` called `status` and then print it out.
- If the integer `n` is greater than 90, increase a `double` called `pay` by 3%.

## Task 3: Getting a Driver's License

Let’s say a person can get a driving license in BC if they satisfy exactly two conditions: 

- Be at least 17 years old.
- Be a current resident of BC.

Write a Java program to check the age (input is an integer) and ask a Yes/No question about whether their living address is in BC (input is character Y or N).

- The program should then inform the user whether they can get a driving license or not.

- The program should either display to the user why they were denied a driving license (if applicable) or congratulate them for their license.
 
## Task 4: Update your README file 

If you named your files as suggested above, you do not have to do anything in this section.
If you named your files differently, please update the links below to make sure they work.

[Task 1 Java file](./task1.java)

[Task 2 Java file](./task2.java)

[Task 3 Java file](./task3.java)
