/*
Brian Chen
Alex Ehrlich
Shuffle simulated deck of cards, then draw 5 cards, do this using three separate methods
November 3, 2015
*/
import java.util.Scanner;//import scanner class
public class Shuffling{//declare class with shuffling name
  public static void main(String[] args) {//main method incorporating other methods
     Scanner scan = new Scanner(System.in);//declare scanner
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   //intialize array suit names
String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};//initialize rank names array
String[] cards = new String[52];//set length of array
String[] hand = new String[5];
for (int i=0; i<52; i++){//0 to 52 counter
  cards[i]=rankNames[i%13]+suitNames[i/13];//find quotient and remainder sum
  System.out.print(cards[i]+" ");//print card at that point in the array, lists cards
}
printArray(cards);//declare methods in proper order
shuffle(cards);
printArray(cards);
hand = randomizeHand(cards);
printArray(hand);
  }//end of main method
  
  public static void printArray(String[] cards) {//prints the cards in order
    for (int i = 0; i < cards.length; i++) {//for loop from 0 to length of array
        System.out.print(cards[i] + " ");//print cards in order
        cards[i]=i;
 }
}
  
  public static void shuffle(String[] cards){//shuffles cards
      
      for (int i = cards.length - 1; i>0; i--); {

int j = (int)(Math.random()
 * (i + 1));

double temp = cards[i];//replaces array with shifted array in random order based on generated number
 cards[i] = cards[j];
 cards[j] = temp;//store in temporary variable
}
  }
  
  public static void randomizeHand(String[] cards){//displays random cards from the shuffled deck, from the first 4 cards in the deck
  for (int i = 0; i < 4; i++) {
    String suitNames1 = suitNames[cards[i] / 13];
    String rankNames1 = rankNames[cards[i] % 13];
    System.out.println("Card number " + cards[i] + ": "+ rankNames1 + " of " + suitNames1);
}
}
}//end of class
