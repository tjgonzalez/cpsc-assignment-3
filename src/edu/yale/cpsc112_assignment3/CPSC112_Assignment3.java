package edu.yale.cpsc112_assignment3;

import java.util.Random;

public class CPSC112_Assignment3 {

  public static String mySecret = "";
  public static boolean DEBUG = true;
  public static Random r = new Random();
  public static int firstNumber = 1;
  public static int secondNumber = 0;

  public static void main(String[] args) {
    makeMySecret();
    isGameOver("1234");
    isGameOver("4321");
    isGameOver("2567");
    isGameOver("1432");
  }

  public static void makeMySecret() {
     // Part 1 code goes here (please leave the next few lines at the end of the makeMySecret method)
	  int mySecret1 = r.nextInt(7)+1;
	  int mySecret2 = r.nextInt(7)+1;
	  while (mySecret2 == mySecret1)
	  {
		   mySecret2 = r.nextInt(7)+1;
	
	  }
	  int mySecret3 = r.nextInt(7)+1;
	  while (mySecret3 == mySecret1 || mySecret3 == mySecret2)
	  {
		   mySecret3 = r.nextInt(7)+1;
		 
	  }
	  int mySecret4 = r.nextInt(7)+1;
	  while (mySecret4 == mySecret1 || mySecret4 == mySecret2 || mySecret4== mySecret3)
	  {
		   mySecret4 = r.nextInt(7)+1;
		 
	  }
	  
	  
	   mySecret=""+ mySecret1 + mySecret2 + mySecret3 + mySecret4 ;
	  
	 
    if (DEBUG)
    {
       System.out.println(mySecret);
    }
  }

  public static boolean isGuessValid(String input) {
    // Part 2 code goes here
	  try{
		  Integer.parseInt(input);
		  while (input.length() <= 4)
		  {
			  if (input.charAt(0) == 1 || input.charAt(0) == 2 || input.charAt(0) == 3 || input.charAt(0) == 4 || input.charAt(0) == 5 || input.charAt(0) == 6 || input.charAt(0) == 7)
				  {
					  if (input.charAt(1) == 1 || input.charAt(1) == 2 || input.charAt(1) == 3 || input.charAt(1) == 4 || input.charAt(1) == 5 || input.charAt(1) == 6 || input.charAt(1) == 7)
					  {
						  if (input.charAt(2) == 1 || input.charAt(2) == 2 || input.charAt(2) == 3 || input.charAt(2) == 4 || input.charAt(2) == 5 || input.charAt(2) == 6 || input.charAt(2) == 7)
						  {
							  if (input.charAt(3) == 1 || input.charAt(3) == 2 || input.charAt(3) == 3 || input.charAt(3) == 4 || input.charAt(3) == 5 || input.charAt(3) == 6 || input.charAt(3) == 7)
							  {
								String dummy = "abcd";
								 return true;
							  }  
						  }
					  }
				  } 	
			  }
		  
		  System.out.println("Input must be a 4-digit number with digits between 1 and 7.");
		  return false;
		  }
	
	  catch (Exception e)
	     {
		  	System.out.println("Input must be a 4-digit number with digits between 1 and 7.");
	        return false;
	     }
  }

  public static boolean isGameOver(String input) {
    // Parts 3 and 4 code goes here
	  if (isGuessValid(input)==false)
	  {
		  return false;
	  }
	  else 
	  {
	  //when guess is false
	  if (firstNumber != 4 && secondNumber !=4 && isGuessValid(input)==true )
	  {
		  String currentguess = input;
		 
		  int charlocation = 0;
		  for (charlocation=0; charlocation<4; charlocation++)
		  {
			  if (input.charAt(charlocation) == mySecret.charAt(charlocation))
			  {
				  secondNumber++;
				  charlocation++;
			  }
			  else if (input.charAt(charlocation) == mySecret.charAt(0) || input.charAt(charlocation) == mySecret.charAt(1) || input.charAt(charlocation) == mySecret.charAt(2) || input.charAt(charlocation) == mySecret.charAt(3) )
			  {
				  firstNumber++;
				  charlocation++;
			  }
		  }
		  System.out.println("Guess:" + input + " Result:" + firstNumber + "," + secondNumber );
		  return false;
		  
	  }
	  }
	
	  {
	  System.out.println("You won!");
	  return true;
	  }
  }
}
