//Alex Ehrlich
//lab03-Check
//Brian Chen
//Determine how much each person needs to pay for a certain bill with a tip
//import scanner class
import java.util.Scanner;
//start public class
public class Check{

//main method required for every Java Program

public static void main(String [] args) {
    
    Scanner myScanner = new Scanner (System.in);
    
    System.out.print("Enter the original cost of the check in the form xx.xx: ");//Prompt for input of check cost
    
        double checkCost = myScanner.nextDouble();//Store check cost as double value
    
    System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");//Prompt for input of tip
    
        double tipPercent = myScanner.nextDouble();//Store tip as double value
    
            tipPercent /= 100; //Divide tip by 100 to convert to decimal
    
    System.out.print("Enter the number of people who went out to dinner: ");//Prompt for input of # of people
    
        int numPeople = myScanner.nextInt();//Store people as int value
        
        double totalCost;//declare variable
        double costPerPerson;//declare variable
        int dollars;//declare variable
        totalCost = checkCost * (1 + tipPercent);//include formula
        costPerPerson = totalCost / numPeople;//include formula
        dollars=(int)costPerPerson;//explicitly cast as integer
        int dimes=(int)(costPerPerson*10) % 10;//.1
        int pennies=(int)(costPerPerson * 100) % 10;//.01
        System.out.println("Each person in the group owes $" +dollars+ '.' + dimes + pennies);//Print amount owed per person
        
    
    
    
    }//end of method
}//end of class