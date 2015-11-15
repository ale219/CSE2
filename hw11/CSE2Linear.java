/*Alex Ehrlich
Brian Chen
November 10, 2015
Search for a key within an array of inputted numbers*/

import java.util.Scanner;//introduce scanner for input
import java.util.Random;//introduce random for scrambling

public class CSE2Linear {//class start
    
    
    
    public static void main(String[] args){//start of main method
        
        Scanner scanner = new Scanner(System.in);//intialize scanner for input
        int[] grades = new int[15];//array of length 15
        
            for(i=1;i<16;i++){    //loop from 1 to 16 for checking values
                boolean yesInt = false;
                System.out.println("Please enter grade number "+ i + " as an integer(ascending order): ");       
                
                while(!yesInt){
                    
                    if (scanner.hasNextInt()){
                        
                        if (scanner.nextInt()<=100&&scanner.nextInt()>=0){
                        
                        grades[i]= scanner.nextInt();
                        yesInt = true;
                        System.out.println("Enter a value to search for in the array: ")
                        searchValue = scanner.nextInt();
                            binarySearch(grades[], searchValue);
                            linearSearch(grades[], searchValue);
                           
                            scrambleArray(grades[]);
                        
                        }
                        else{
                            System.out.println("Enter a value between 0-100, inclusive: ");
                            scanner.next();
                        }
                        
                    }
                    else{
                        System.out.println("ERROR: Integer required");
                        System.out.println("Enter an integer: ");
                        scanner.next();
                    }
                }
  

    }      
        




        
    }//end of main method
    

public static int binarySearch(int[] grades, int searchValue) {//binary search more efficient
 int low = 0;//start value
 int high = grades.length - 1;//1 less than length
 
 while (high >= low) {//high must be greater than or equal to low
 int mid = (low + high) / 2;//average of high and low
    if (searchValue < grades[mid])//search less than mid
        high = mid - 1;//if less than mid keep halving search
    else if (searchValue == grades[mid])
        return mid;//if equal to mid print mid
    else
        low = mid + 1;//return 1 more than the mid if not equal to
        count++
 }
System.out.println("This search required " +count+ " iterations.")
return -low - 1; //if high is less than low, key isnt found
 }
 }


public static int linearSearch(int[] grades, int searchValue){//linear search less efficient
    for (int i = 0; i < grades.length-1; i++) {//check all positions in array
        if (searchValue == grades[i]){
        
        return i;//return the value if found
            }
        return -1;//null value if not found 
        }
         System.out.println(i+" iterations were required.")
}//end of method
    
    
    
    
    
  
public static int[] scrambleArray(int [] grades){  //method for scrambling array  
for (int i=0; i<grades.length-1; i++) {//for loop including all of the positions
	
	int second = (int) (intArray.length * 
		Math.random() );//intialize random integer variable for array position


	
	int temp = grades[second];//intialize temporary storage variable
	grades[second] = grades[i];//swap array variable with other array variable
	grades[i] = temp;//make temp the current variable in the array
	
}
return grades[];
}//end of method
    

}//class end