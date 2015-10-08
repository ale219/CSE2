/* Alex Ehrlich
Checks for valid ISBNs
October 6, 2015*/


import java.util.Scanner;//import scanner for input

    public class CheckDigit{//state class and main method
        
        public static void main(String []args){
            
            Scanner myScanner = new Scanner (System.in);//define scanner
            
            System.out.println("Please enter a ten digit barcode: ")//prompt for barcode
            /*int tenRedo = 10//intialize redo value as int equal to 10, to avoid complications after possible nonpositive values//*/
            String code = myScanner.next();//receive input as a string
            int ten = code.length();//assign length to variable ten as an int
                if(ten!=10/*||tenRedo!=10*/)//check that ten is equal to 10
                    System.out.println("This barcode is not 10 digits, please reenter: ")//if not, ask for resubmission
                    String codeRedo = myScanner.next();//obtain length for redo value
                    int tenRedo = codeRedo.length();
                else{
    
            
            double large = 1e10;//assign value too large to variable "large" using sci not
            
            int codeDigTen = (int) (code % 10);//separate each digit using remainder calculations
            int codeDigNine = (int) (((code % 100)-codeDigTen)/10);
            int codeDigEight = (int) (((code % 1000)-(code % 100))/100);
            int codeDigSeven = (int) (((code % 10000)-(code % 1000))/1000);
            int codeDigSix = (int) (((code % 100000)-(code % 10000))/10000);
            int codeDigFive = (int) (((code % 1000000)-(code % 100000))/100000);
            int codeDigFour = (int) (((code % 10000000)-(code % 1000000))/1000000);
            int codeDigThree = (int) (((code % 100000000)-(code % 10000000))/10000000);
            int codeDigTwo = (int) (((code % 1000000000)-(code % 100000000))/100000000);
            
            
            System.out.print(codeDigOne);//print each digit on same line
            System.out.print(codeDigTwo);//order is reversed again as the calculations about reversed originally
            System.out.print(codeDigThree);
            System.out.print(codeDigFour);
            System.out.print(codeDigFive);
            System.out.print(codeDigSix);
            System.out.print(codeDigSeven);
            System.out.print(codeDigEight);
            System.out.print(codeDigNine);
            
            if (checkDig.string = "X"){//check final digit is equal to X or numerical value
            rem = 10
            }
            else
            rem = checkDig
            }
            
        }
        
    }