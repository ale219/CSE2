/* hw08 Area 
Calculate area based on inputted numbers and shape type
Alex Ehrlich
Brian Chen
Oct 20, 2015
*/
import java.util.Scanner;//introduce scanner

    public class Area
    
    public static void main(String[] args){ //main method begins
    
    Scanner myScanner = new Scanner (System.in);//intialize scanner
    String triangle = new String("triangle");//initialize shapes
    String circle = new String("circle");
    String rectangle = new String("rectangle");
    
    System.out.println("Please enter the desired shape(all lowercase): ")//prompt user for shape type
    String shape = myScanner.next();//use shape entered
    
    if (shape.equals(triangle)||shape.equals(rectangle)||shape.equals(circle)){//if shape string equals an acceptable shape
        
        boolean ok = true//set boolean for continuing process and loop
        
        
    }
    else{
        System.out.println("Please enter an appropriate shape: ")
        String shape = myScanner.next();//reprompt for shape
        
        
        
    }
    
    public double rectArea(String shape) {
        
        width = 0
        height = 0//area calcuation and prompting user for doubles
        System.out.println("Please enter a height for the rectangle: ")
        double height = myScanner.nextInt();
        System.out.println("Please enter a width for the rectangle: ")
        double width = myScanner.nextInt();
        
        double area = height * width
        System.out.println("The area of your rectangle is "+area+" units squared.")
    }
    
    public double triArea(String shape) {
        
        width = 0
        height = 0// respective area calculations for triangle
        System.out.println("Please enter a height for the triangle: ")
        double height = myScanner.nextInt();
        System.out.println("Please enter a base length for the triangle: ")
        double width = myScanner.nextInt();
        
        double area = height * width * .5
        System.out.println("The area of your triangle is "+area+" units squared.")//prints area
    }
    
    public double circArea(String shape) {
        
        radius = 0
      
        System.out.println("Please enter a radius for the circle: ")
        double radius = myScanner.nextInt();
        
        
        double area = radius * radius * 3.14159
        System.out.println("The area of your circle is "+area+" units squared.")
    }
    
    }//end of method
    }//end of class