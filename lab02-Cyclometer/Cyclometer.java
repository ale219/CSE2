//Track a variety of variables regarding bike wheel rotation on 2 separate trips
//number of minutes
//number of counts
//distance in miles
//distance for 2 trips
//Alex Ehrlich
//Due 9/8/15
//Prof. Brian Chen CSE2

public class Cyclometer{
    //main method required for all Java programs
    public static void main(String[] args) {
        
        
        
        
int secsTrip1=670; //time for T1 secs
int secsTrip2=42312; //time for T2 secs
int countsTrip1=1323; //wheel rotations T1
int countsTrip2=593234; //wheel rotations T2

double wheelDiameter=27; //wheel diameter in inches
double PI=3.14159; //truncated value of pi
int feetPerMile=5280; //conversion feet to miles
int inchesPerFoot=12; //conversion inches to feet
int secondsPerMinute=60; //conversion seconds to minutes
double distanceTrip1, distanceTrip2, totalDistance; //Individual distances and combined distance
System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+"minutes and had "+ countsTrip1+
" counts."); //Prints out number of counts and time for trip 1
System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+"minutes and had "+ countsTrip2+
" counts."); //Prints out number of counts and time for trip 2

distanceTrip1=countsTrip1*wheelDiameter*PI;
//Convert from diameter to circumference using pi to determine distance traveled per one revolution
distanceTrip1/=inchesPerFoot*feetPerMile; //inches to miles, additional distance calculation
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance as one line of code
totalDistance=distanceTrip1+distanceTrip2; //assigns sum to variable

System.out.println("Trip 1 was "+distanceTrip1+" miles"); //Prints distance trip 2
System.out.println("Trip 2 was "+distanceTrip2+" miles"); //Prints distance trip 1
System.out.println("The total distance was "+totalDistance+" miles"); //Prints total distance




        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
} //end of method

} //end of class

