/**Complete the code in the editor below. The variables i,d ,s and  are already declared and initialized for you. You must:

Declare  variables: one of type int, one of type double, and one of type String.
Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
Use the  operator to perform the following operations:
Print the sum of  i plus your int variable on a new line.
Print the sum of  d plus your double variable to a scale of one decimal place on a new line.
Concatenate  with the string you read as input and print the result on a new line.**/ 


/*
declare 3 variables
int i 
double d 
String s 


*/ 

/*
input = int, double, and a string 
output = 
i + int 
d + double
s + string 


int = 8
double = 4.3 
String = "the bain of my existence "

output = 
8+ 4 = 12
4.3 + 4.0 = 7.3
"hacker rank is the bain of my existence"




 */

 //time complexity: O

import java.io.*;
import java.util.*;
import java.text.*; 
import java.math.*; 
import java.util.regex.*;


public class day1{ 
    public static void main(String [] args){ 
        int i =4; 
        double d =4.0; 
        String s = "Hacker Rank"; 
        Scanner scan = new Scanner(System.in); 

    

    /*Declare second integer, double, and String variables.*/ 
    int inputInt; 
    double inputDouble; 
    String inputString; 
      
 
    
    

    /*Read and save an integer, double, and string variables to your variables.*/
    System.out.println("Enter an string");
    inputString = scan.nextLine(); 
        System.out.println("Enter an integer.");
        inputInt = scan.nextInt();
        System.out.println("Enter an double");
        inputDouble = scan.nextDouble(); 
       

    // Note: if you have trouble reading the entire String, please go back and review the tutorial closely.

    /* Print the sum of both integer variables on a new line. */
        System.out.println(i+inputInt);

    /* Print the sum of the double variables on a new line. */ 
        System.out.println(d+inputDouble);

    /* Concatenate and print the String variables on a new line;
    the s variable above should be printed first. 
    */

        System.out.println(s+" "+inputString);
    //scan.close(); 
}


}



