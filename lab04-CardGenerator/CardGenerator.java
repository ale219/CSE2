//Alex Ehrlich
//lab04-CardGenerator
//Brian Chen
//Print card details based off card number generated
//D, C, H, S
//1, 14, 27, 40, 53
public class CardGenerator{
    
    public static void main(String [] args) {
        
    int card = (int)(Math.random()*(upperBound+1))+baseNum;
    int card = (int)(Math.random()*13)+2;
        String suit;
        String royal;
        int number;
        if (card >= 1 && card <= 13){
        
        String suit = "Diamonds";
    }
        else if (card >= 14 && card <= 26){
        
        String suit = "Clubs";
    }
        else if (card >= 27 && card <= 39){
        
        String suit = "Hearts";
    }
     
        else if (card >= 40 && card <= 52){
        
        String suit = "Spades";
         
    }
        
        if (card == 11){
            
            String royal = "Jack";
        }
        else if (card == 12){
            
            String royal = "Queen";
        }
        else if (card == 13){
            
            String royal = "King";
        }
        else if (card == 1){
            
            String royal = "Ace";
        }
        else if (card >= 2 && card <= 10)
        
             int number = int card
        System.out.println("You picked the  )
        
    }
}