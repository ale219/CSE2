/*Alex Ehrlich
Professor Brian Chen
CSE2
Twisty hw07
Print out a double helix design of inputted length and width using loops
10/14/15
*/



import java.util.Scanner;//import scanner to receive input for width and length

public class Twisty{//declare public class
    
    public static void main(String [] args) {//declare main method, composed of strings
        
        Scanner myScanner = new Scanner(System.in);//intialize scanner variable to incorporate input into code
        
       
            int widthShape;//declare width variable
            int lengthShape=0;//declare and initialize length, unnecessary intialization
            boolean acceptableValue = false;//declare and intialize boolean to allow for infinite loops
            
            
        
        System.out.println("Input your desired length: ");//request length input
       
        
        while (!acceptableValue){//intialize loop when acceptable is true
            if (myScanner.hasNextInt()){//is input an integer? if it is...
                lengthShape = myScanner.nextInt();//store it as the length
                
               
                
                                                        
                while (!acceptableValue){//intialize loop when acceptable is true
                    System.out.println("Input your desired width: ");//request length input
                    
                    if (myScanner.hasNextInt()){//is input an integer? if it is...
                        
                        while(!acceptableValue){//intialize loop when acceptable is true
                            
                            widthShape=myScanner.nextInt();//store input for width as width
                            if (widthShape<lengthShape){//if all parameters are met, and width is less than length...
                            
                             
                        
                       /*
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       */ 
                       
                       
                       
                       
                       
                       
                       
                       
                       
                        }//end of third if                                        
                    
                       
                            else{//alternative in loop
                        System.out.println("You have entered an invalid width.");//if width is greater than or equal to length
                        System.out.print("Please enter a width that is less than the height: ");//request input again
                        myScanner.next();//store new value and retest
                    }//end of else
                       
                        
                    }//end of third while
                    }//end of next if
                    else{//alternative in loop
                        System.out.println("You have entered an invalid width.");//if width is not an integer
                        System.out.print("Please enter an acceptable width: ");//request input again
                        myScanner.next();//store new value and retest
                    }//end of else
                
           
                   
            } //end of next while
           
            }   //end of outermost if
                   
            else{//alternative in loop
                System.out.println("You have entered an invalid length.");//if length is not an integer
                System.out.print("Please enter an acceptable length: ");//request input again
                myScanner.next();//store new value and retest
            }//end of else
        
   
       
    }//end of outermost while
}//end of main method
}//end of class

