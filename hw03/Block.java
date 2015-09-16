//Alex Ehrlich
//hw03-Block
//Brian Chen
//9/15/2015
//Determine volume of block based off input dimensions
//import scanner class
import java.util.Scanner;
//start public class
public class Block{
    
//main method required for every Java program

public static void main(String [] args) {
    
    Scanner myScanner = new Scanner (System.in);//define scanner
    
    System.out.print("Enter the the length of the block: ");//prompt user for length
    
        double blockLength = myScanner.nextDouble();//store value
        
    System.out.print("Enter the the width of the block: ");//prompt user for width
    
        double blockWidth = myScanner.nextDouble();
        
    System.out.print("Enter the the height of the block: ");//prompt user for height
    
        double blockHeight = myScanner.nextDouble();
    
    double totalVolume = blockHeight * blockLength * blockWidth;//volume of block formula
    
    double totalSurfaceArea = 2 * ((blockHeight * blockLength) + (blockLength * blockWidth) + (blockWidth * blockHeight));//SA of block formula
        
     System.out.println("The volume of the block of dimensions " +blockLength+ " x " +blockWidth+ " x " +blockHeight+ " is " +totalVolume+ " units cubed");//print volume
     System.out.println("The surface area of the block is " +totalSurfaceArea+ " units squared");//print surface area
}//end class

}//end method