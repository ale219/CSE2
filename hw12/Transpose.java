/*Alex Ehrlich
Brian Chen
November 17, 2015
Create a two-dimensional array using inputted values for width and height, then transpose the array and print the transposed array*/

import java.util.Scanner;//import scanner for user input
import java.util.Random; //random numbers for matrix later on

public class Transpose{//start of class

public static void main(String [] args){//start of main method
    
    Scanner input = new Scanner (System.in);//intialize and declare scanner variable
    boolean yesInt = false;//boolean for later tests for integers
   while(!yesInt){
    System.out.println("Please enter a positive integer to use as the width of the matrix: ")//ask user for width
   
        while(!yesInt){//loop to check for integer and positive
   
            if(input.hasNextInt()){//checks integer
                
                if (input.nextInt()>0){//checks positive
                    
                    int width = input.nextInt();//store as width
    
                    
                    yesInt = true;//ends loop
                    continue;//continues to next loop
                }
                else{//if not positive integer
                    
                    
                    System.out.println("ERROR--Please enter a positive integer: ");
                    input.next();//store new value
                    
                }
                
                
            }
            
            else{
                
                    System.out.println("ERROR: Integer required");//if not integer
                    System.out.println("Enter an integer: ");
                    scanner.next();//store new value
                
                
            }
            }
   
   
    
    
    System.out.println("Please enter a positive integer to use as the height of the matrix: ")//same loop as width, but for height
    
    while(!yesInt){
   
            if(input.hasNextInt()){
                
                if (input.nextInt()>0){
                    
                    int height = input.nextInt();
    
                    
                    yesInt = true;
                    continue;//return to outside loop
                }
                else{
                    
                    
                    System.out.println("ERROR--Please enter a positive integer: ");
                    input.next();
                    
                }
                
                
            }
            
            else{
                
                    System.out.println("ERROR: Integer required");
                    System.out.println("Enter an integer: ");
                    scanner.next();
                
                
            }
            }
            return height;//return both variables for later use
            return width;
            
            
}
    
    randomMatrix(height, width);//use methods with inputted variables
    printMatrix(originalMatrix[]);
    transposeMatrix(originalMatrix[]);
    System.out.println(originalMatrix[]);
    
    
    
 }//end of main method
public static int[] randomMatrix(int height, int width){//accept height and width to create a random matrix using math.random
    
    int[][] originalMatrix = new int[height][width]//create array of inputted height and width
    for (int row = 0; row < originalMatrix.length; row++) {//loop for row
for (int column = 0; column < originalMatrix[row].length; column++) {//loop for column
 originalMatrix[row][column] = (int)((Math.random() * 21)-10);//store random value -10 to 10 in each element
 return originalMatrix[];//return the final random matrix
 }
}
}//end of randomize method
public static int[] printMatrix(int [] originalMatrix) {//print the matrix
    
    /*Want to check that all of the row lengths are equal to each other, and that all of the column lengths are equal to each other, unsure of a solution
    for rows:
    if(originalMatrix[row].length==originalMatrix[row+1].length==originalMatrix[row+2].length ... ==originalMatrix[height].length)
    does not work unless height is known ahead of time
    for columns:
    if(originalMatrix[column].length==originalMatrix[column+1].length==originalMatrix[column+2].length ... ==originalMatrix[width].length)
    does not work unless width is known ahead of time
    */
        
        
    
return int originalMatrix[];//return matrix if conditions are satisfied(if it is rectangular)
    
}//end of print method
public static int[] transposeMatrix(int [] originalMatrix) {//transpose the matrix using
    
    
    if (originalMatrix.length > 0) {//loop to control end of loop
            for (int i = 0; i < originalMatrix[0].length; i++) {//for row and column under length
                for (int j = 0; j < originalMatrix.length; j++) {
                    System.out.print(originalMatrix[j][i] + " ");//switch variables
                }
                System.out.print("\n");//print new line after complete
                return originalMatrix[];//return the transposed matrix
            }
        }
    
    
}//end of transpose method    
    
    
}//end of class
