//Alex Ehrlich
//hw03-Timer
//Brian Chen
//9/15/2015
//Determine amount of time until dinner based off of input time
//modulus maybe?
//import scanner class
import java.util.Scanner;
//start public class
public class Timer{
    
    //main method required for every Java Program
    
    
public static void main(String [] args) {
    
        Scanner myScanner = new Scanner (System.in);//declare scanner variable
    
        System.out.print("Enter the current time in the form HHMM, on a 24-hour time system: ");//Prompt user for current time
    
            int currentTime = myScanner.nextInt();//Store current time as int value
        
                int currentMM = currentTime % 100; //Introduce modulus, remainder will be minute value after division of 100
                int currentHH = ((currentTime - currentMM) / 100);//Make compatible for calculations
        
        
        System.out.print("Enter the time you plan on eating dinner in the form HHMM, on a 24-hour time system: ");//Prompt user for time they plan on eating dinner
        
            int plannedTime = myScanner.nextInt();//Store planned time as double value
            
                int plannedMM = plannedTime % 100;//Make compatible for calculations
                int plannedHH = (plannedTime - plannedMM)/100 ; //Introduce modulus, remainder will be minute value after division of 100
        
        //formula to determine difference in hours;
        int hourDiff = plannedHH - currentHH;
        
        //formula to determine in minutes
        int minDiff = plannedMM - currentMM;
        
        System.out.println("You have " +hourDiff+ " hours and " +minDiff+ " minutes until dinner.");//Prints number of hours and minutes until dinner
        
        
        
        
        
        
        
}
    
}