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
    
    System.out.print("Enter the original cost of the check in the form xx.xx: ");
    
        double checkCost = myScanner.nextDouble();
    
    System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
    
        double tipPercent = myScanner.nextDouble();
    
            tipPercent /= 100; //Divide tip by 100 to convert to decimal
    
    System.out.print("Enter the number of people who went out to dinner: ");
    
        int numPeople = myScanner.nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars;
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        dollars=(int)costPerPerson;
        int dimes=(int)(costPerPerson*10) % 10;
        int pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" +dollars+ '.' + dimes + pennies);
        
    
    
    
    }//end of method
}//end of class