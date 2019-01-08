/*
 * 5/19/2016
 * Exercise 4.7
 * 
 * Write a program that administers a basic addition quiz to the user. 
 * There should be ten questions. 
 * Each question is a simple addition problem such as 17 + 42, 
 * where the numbers in the problem are chosen at random (and are not too big). 
 * The program should ask the user all ten questions and get the user's answers.
 * After asking all the questions, the user should print each question again, 
 * with the user's answer. 
 * If the user got the answer right, the program should say so; 
 * if not, the program should give the correct answer. 
 * At the end, tell the user their score on the quiz, 
 * where each correct answer counts for ten points
 * 
 * The program should use three subroutines, 
 * one to create the quiz, one to administer the quiz, and one to grade the quiz. 
 * It can use three arrays, with three global variables of type int[], to refer to the arrays. 
 * The first array holds the first number from every question, 
 * the second holds the second number from every questions, 
 * and the third holds the user's answers.
 * 
 */

import java.util.Scanner;
import java.lang.Math;

public class AdditionQuiz {

	static DynamicArray<Integer> firstNumbers = new DynamicArray<Integer>();		
	static DynamicArray<Integer> secondNumbers = new DynamicArray<Integer>();
	static DynamicArray<Integer> userAnswers = new DynamicArray<Integer>();
	
	public static void main(String[] args) 
	{	
		int sum = 0;
		int score = 0;
		
		createQuiz();
		
		// Output the quiz again
		for(int i = 0; i < userAnswers.size(); i++)
		{
			System.out.println("Question: " + (i+1) + ": " + firstNumbers.getValue(i) + " + " + secondNumbers.getValue(i));
			System.out.println(userAnswers.getValue(i));
			
			sum = (int) firstNumbers.getValue(i) + (int) secondNumbers.getValue(i);
			
			if(sum == (int)userAnswers.getValue(i))
			{
				System.out.println("Correct!");
				score++;
			}
			else 
			{
				System.out.println("Incorrect!");
			}
		}
		
		System.out.println("Score: " + score + " out of " + userAnswers.size());
	}
	
	public static void createQuiz()
	{
		Scanner scanner = new Scanner(System.in);	
		int userAnswer = 0;
		
		int num1 = 0;
		int num2 = 0;
		int questions = 10;
		for(int i = 1; i <= questions; i++)
		{
			num1 = (int) (Math.random()*100)+1;
			num2 = (int) (Math.random()*100)+1;
			
			firstNumbers.add(num1);
			secondNumbers.add(num2);
			System.out.println("Question " + i
					+ ": " + num1 + " + " + num2);
			
			userAnswer = scanner.nextInt();
			
			userAnswers.add(userAnswer);
		}
	}
	
}
