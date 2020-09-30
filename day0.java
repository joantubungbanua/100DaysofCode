import java.io.*; 
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



// inputString = "my name is Joan"
// output = my name is Joan
public class day0 { 
    public static void main(String[] args){
        // create a Scanner object to read input from stdin
        Scanner scan = new Scanner(System.in); 

        System.out.println("Type what you would want to display on the screen");

        //read a full line of input from stdin and save it to our variable, input string. 
        String inputString = scan.nextLine(); 

        //close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge 
        scan.close(); 

        //Print a string literal saying "Hello World." to stdout

        System.out.println(inputString);

    }
}