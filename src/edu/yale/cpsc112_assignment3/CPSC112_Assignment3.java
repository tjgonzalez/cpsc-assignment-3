package edu.yale.cpsc112_assignment3;

import java.util.Random;

public class CPSC112_Assignment3 {

  public static String mySecret = "";
  public static boolean DEBUG = true;
  public static Random r = new Random();
  
  public static int firstNumber = 0;
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
	  try
	  {
	  
		  int a = Integer.parseInt(input.substring(0, 1));
		  int b = Integer.parseInt(input.substring(1, 2));
		  int c = Integer.parseInt(input.substring(2, 3));
		  String dstring = "" + input.charAt(input.length()-1);
		  int d = Integer.parseInt(dstring);
		
		  if (input.length() != 4 || (a > 7 && b > 7 && c > 7 && d > 7))
		  {
			
				  System.out.println("Input must be a 4-digit number with digits between 1 and 7.");
				  return false;
			  
		  }
		
		  else
		  {
			  return true;
		  }
		  
	
	  }
  	  catch (Exception e)
  		{
  			System.out.println("Input must be a 4-digit number with digits between 1 and 7.");
			  return false;
  		}
  
} 

  public static boolean isGameOver(String input) {
    // Parts 3 and 4 code goes here
	  try{
		  isGuessValid(input);
		  int a = Integer.parseInt(input.substring(0, 1));
		  int b = Integer.parseInt(input.substring(1, 2));
		  int c = Integer.parseInt(input.substring(2, 3));
		  int d = Integer.parseInt(input.substring(input.length(), input.length()-1));
		 //checks to see if numbers are in the correct position (second number)
		 // if (a == aSecret)
		  {
			  secondNumber++;
		  }
		 // if (b == bSecret)
		  {
			  secondNumber++;
		  }
		 // if (c == cSecret)
		  {
			  secondNumber++;
		  }
		  //if (d == dSecret)
		  {
			  secondNumber++;
		  }
		  
		  System.out.println("Guess:" + input + " Result:" + firstNumber + "," + secondNumber );
		  return false;
		  }
	  catch (Exception e)
	  {
		  return false;
	  }
	  
  }
}
