package edu.yale.cpsc112_assignment3;

import java.util.Random;

public class CPSC112_Assignment3 {

  public static String mySecret = "";
  public static boolean DEBUG = true;
  public static Random r = new Random();

  public static void main(String[] args) {
    makeMySecret();
    //isGameOver("1234");
    //isGameOver("4321");
    //isGameOver("2567");
    //isGameOver("1432");
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
	  
	  
	  String mySecret=""+ mySecret1 + mySecret2 + mySecret3 + mySecret4 ;
	  
	 
    if (DEBUG)
    {
       System.out.println(mySecret);
    }
  }

  //public static boolean isGuessValid(String input) {
    // Part 2 code goes here
  //}

  //public static boolean isGameOver(String input) {
    // Parts 3 and 4 code goes here
  }
//}
