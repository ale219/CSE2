/*lab07 encrypted x*/

import java.util.Scanner;

public class encrypted_x{
    
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
       
        
            boolean acceptableValue = false;
            boolean positiveValue = false;
            
        
        System.out.println("Please enter an integer between 0-100, inclusive: ");
            
            while(!acceptableValue){
            
                if (input.hasNextInt() ){
                
                int input = myscanner.nextInt();
                acceptableValue=true;
                    
                    while (!positiveValue){
                        
                        
                        
                        for(int i = 0; i < input; i++){
                        
                            for(int j = 0; j < input; j++){
                                
                                if(i=j || i=input-j)
                                
                                System.out.println(" ");
                                
                                else if(i!=j || i!=input-j)
                                
                                System.out.println("*");
                                
                                
                                
                                
                                
                            }
                        
                        
                        
                        
                        System.out.println();
                        
                        }
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                    }
                    else{
                        
                        System.out.println("Please enter a positive value: ")
                        input.next();
                        
                        
                    }
                }
                    
                }
        }
        
        else{
            
            System.out.println("ERROR: need an integer");
            System.out.print("Input an integer: ")
            input.next();
        }
        
            }