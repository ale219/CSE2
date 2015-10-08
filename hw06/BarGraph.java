/* Calculate and predict expenses for college student
.

Note: was able to get graph to run properly, but will not compile with the addition of the nested loop for unacceptable values,
additional dysfunctional code is blocked out as a comment*/
import java.util.Scanner;//import scanner

public class BarGraph{//public class
    
    public static void main(String []args){//main method
        
        Scanner myScanner = new Scanner (System.in);//define scanner
        
        System.out.println("Expenses for Monday: ");//accept input for each day
        
            double expenseMonday = myScanner.nextDouble();//store input as a double value
        
        System.out.println("Expenses for Tuesday: ");
        
            double expenseTuesday = myScanner.nextDouble();
        
        System.out.println("Expenses for Wednesday: ");
        
            double expenseWednesday = myScanner.nextDouble();
        
        System.out.println("Expenses for Thursday: ");
        
            double expenseThursday = myScanner.nextDouble();
        
        System.out.println("Expenses for Friday: ");
        
            double expenseFriday = myScanner.nextDouble();
        
        System.out.println("Expenses for Saturday: ");
        
            double expenseSaturday = myScanner.nextDouble();
        
        System.out.println("Expenses for Sunday: ");
        
            double expenseSunday = myScanner.nextDouble();
            //nested loop for values which are not originally appropriate//
           /* if (expenseSunday<0||expenseMonday<0||expenseTuesday<0||expenseWednesday<0||expenseThursday<0||expenseFriday<0||expenseSaturday<0){
                Scanner myScannerRedo = new Scanner (System.in);
                System.out.println("Please enter positive values for your daily expenses: ");
                double expenseSundayRedo = myScannerRedo.nextDouble();
                double expenseMondayRedo = myScannerRedo.nextDouble();
                double expenseTuesdayRedo = myScannerRedo.nextDouble();
                double expenseWednesdayRedo = myScannerRedo.nextDouble();
                double expenseThursdayRedo = myScannerRedo.nextDouble();
                double expenseFridayRedo = myScannerRedo.nextDouble();
                double expenseSaturdayRedo = myScannerRedo.nextDouble();//Check that all value are acceptable, and if not, redo input with appropriate values
                
                
            int expenseRoundMonday = (int) expenseMondayRedo;//Convert values to integers for graph
            int expenseRoundTuesday = (int) expenseTuesdayRedo;//Conversion must be done explicitly as values are originally doubles
            int expenseRoundWednesday = (int) expenseWednesdayRedo;
            int expenseRoundThursday = (int) expenseThursdayRedo;
            int expenseRoundFriday = (int) expenseFridayRedo;
            int expenseRoundSaturday = (int) expenseSaturdayRedo;
            int expenseRoundSunday = (int) expenseSundayRedo;
            
            System.out.print("Mon: ");
            
            while (expenseRoundMondayRedo>0){/*print the day and a number of stars based upon the number iterations of the loop, 
            determined by original value of expense and postdecrement*/
                
                /*System.out.print('*');
            
                expenseRoundMondayRedo--;
            }
            System.out.println(" ");
            System.out.print("Tue: ");
             while (expenseRoundTuesdayRedo>0){
                
               System.out.print('*');
            
                expenseRoundTuesdayRedo--;
            }
            System.out.println(" ");
            System.out.print("Wed: ");
            
             while (expenseRoundWednesdayRedo>0){
                
                System.out.print('*');
            
                expenseRoundWednesdayRedo--;
            }          
            System.out.println(" ");
            System.out.print("Thur: ");
             while (expenseRoundThursdayRedo>0){
                
               System.out.print('*');
            
                expenseRoundThursdayRedo--;             
            }
            System.out.println(" ");
            System.out.print("Fri: ");
             while (expenseRoundFridayRedo>0){
                
                System.out.print('*');
            
                expenseRoundFridayRedo--;
            }
            System.out.println(" ");
            System.out.print("Sat: ");
             while (expenseRoundSaturdayRedo>0){
                
                System.out.print('*');
            
                expenseRoundSaturdayRedo--;
            }
            System.out.println(" ");
            System.out.print("Sun: ");
             while (expenseRoundSundayRedo>0){
                
                System.out.print('*');
            
                expenseRoundSundayRedo--;
            }
                System.out.println(" ");
            
            
            double avgDailyExpenses=(expenseFridayRedo+expenseMondayRedo+expenseTuesdayRedo+expenseWednesdayRedo+expenseThursdayRedo+expenseSaturdayRedo+expenseSundayRedo)/7;
            avgDailyExpenses*=10;//calculate average expenses and convert to dollar value using 
            int avgDailyExpensesRound = (int) avgDailyExpenses;
            avgDailyExpensesRound=avgDailyExpensesRound/10;
            double avgDailyExpensesFinal = avgDailyExpensesRound;
            System.out.print("Your average daily expenses are: $");
            System.out.println(avgDailyExpensesFinal);
            }
            
            else{
                */
            int expenseRoundMonday = (int) expenseMonday;//convert all from double to int for use in the graph
            int expenseRoundTuesday = (int) expenseTuesday;//conversion must be done explicitly due to loss of precision
            int expenseRoundWednesday = (int) expenseWednesday;
            int expenseRoundThursday = (int) expenseThursday;
            int expenseRoundFriday = (int) expenseFriday;
            int expenseRoundSaturday = (int) expenseSaturday;
            int expenseRoundSunday = (int) expenseSunday;
            
            System.out.print("Mon: ");/*print out day followed by a series of stars, the amount corresponding to the number of times the dollar value 
            needs to be decremented by 1*/
            
            while (expenseRoundMonday>0){
                
                System.out.print('*');
            
                expenseRoundMonday--;
            }
            System.out.println(" ");
            System.out.print("Tue: ");
             while (expenseRoundTuesday>0){//conditional
                
               System.out.print('*');//print stars
            
                expenseRoundTuesday--;//postdecrement
            }
            System.out.println(" ");//print space for the purpose of using println to move to next line
            System.out.print("Wed: ");//must be on same line as stars
            
             while (expenseRoundWednesday>0){
                
                System.out.print('*');
            
                expenseRoundWednesday--;
            }          
            System.out.println(" ");
            System.out.print("Thur: ");
             while (expenseRoundThursday>0){
                
               System.out.print('*');
            
                expenseRoundThursday--;             
            }
            System.out.println(" ");
            System.out.print("Fri: ");
             while (expenseRoundFriday>0){
                
                System.out.print('*');
            
                expenseRoundFriday--;
            }
            System.out.println(" ");
            System.out.print("Sat: ");
             while (expenseRoundSaturday>0){
                
                System.out.print('*');
            
                expenseRoundSaturday--;
            }
            System.out.println(" ");
            System.out.print("Sun: ");
             while (expenseRoundSunday>0){
                
                System.out.print('*');
            
                expenseRoundSunday--;
            }
                System.out.println(" ");
            
            
            double avgDailyExpenses=(expenseFriday+expenseMonday+expenseTuesday+expenseWednesday+expenseThursday+expenseSaturday+expenseSunday)/7;
            avgDailyExpenses*=10;//find average expenses per day and multiply by ten to prepare for conversion to double
            //this will cause the value to be displayed as a dollar amount with the appropriate # of dec points
            int avgDailyExpensesRound = (int) avgDailyExpenses;//convert back into integer explicitly
            avgDailyExpensesRound=avgDailyExpensesRound/10;//divide this rounded value by 10 to obtain 2 digits on right side
            double avgDailyExpensesFinal = avgDailyExpensesRound;//convert back to double
            System.out.print("Your average daily expenses are: $");//print average daily expenses with dollar sign
            System.out.println(avgDailyExpensesFinal);
            
            
            
            
    }
}