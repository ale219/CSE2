//Alex Ehrlich
//lab04-PokerHandCheck
//Brian Chen
//Print poker hand based off of randomly generated cards
//D, C, H, S
//1, 14, 27, 40, 53
import java.lang.math;
import java.util.Random;

public class PokerHandCheck{
    
    public static void main(String [] args) {
        
   
        int one = (int)(Math.random()*4*12.8)+1;
        int two = (int)(Math.random()*4*12.8)+1;
        int three = (int)(Math.random()*4*12.8)+1;
        int four = (int)(Math.random()*4*12.8)+1;
        int five = (int)(Math.random()*4*12.8)=1;
        String suit;
        String royal;
    
        if (one >= 1 && one <= 13){
        
        String suit = "Diamonds";
        
    }
        else if (one >= 14 && one <= 26){
        
        String suit = "Clubs";
    }
        else if (one >= 27 && one <= 39){
        
        String suit = "Hearts";
    }
     
        else if (one >= 40 && one <= 52){
        
        String suit = "Spades";
        
        }
        
         if (one == 11 || one == 24 || one == 37 || one == 50){
            
            String royal = "Jack";
        }
        else if (one == 12 || one == 25|| one == 38|| one == 51){
            
            String royal = "Queen";
        }
        else if (one == 13|| one == 26|| one == 39|| one == 52){
            
            String royal = "King";
        }
        else if (one == 1 || one == 14||one == 27 || one == 40){
            
            String royal = "Ace";
        }
        else if (one >= 2 && one <= 10||one >= 15 && one <= 23|| one >= 28 && one <= 36|| one >= 41 && one <= 49){
        
             int number = one;
        }
    
             if (two >= 1 && two <= 13){
        
        String suit = "Diamonds";
    }
        else if (two >= 14 && two <= 26){
        
        String suit = "Clubs";
    }
        else if (two >= 27 && two <= 39){
        
        String suit = "Hearts";
    }
     
        else if (two >= 40 && two <= 52){
        
        String suit = "Spades";
        
        }
        
         if (two == 11 || two == 24 || two == 37 || two == 50){
            
            String royal = "Jack";
        }
        else if (two == 12 || two == 25 || two == 38 || two == 51){
            
            String royal = "Queen";
        }
        else if (two == 13 || two == 26 || two == 39 || two == 52){
            
            String royal = "King";
        }
        else if (two == 1 || two == 14 || two == 27 || two == 40){
            
            String royal = "Ace";
        }
        else if (two >= 2 && two <= 10 || two >= 15 && two <= 23 || two>= 28 && two <= 36 || two >= 41 && two <= 49){
        
             int number = two;
        }
         
                if (three >= 1 && three <= 13){
        
        String suit = "Diamonds";
    }
        else if (three >= 14 && three <= 26){
        
        String suit = "Clubs";
    }
        else if (three >= 27 && three <= 39){
        
        String suit = "Hearts";
    }
     
        else if (three >= 40 && three <= 52){
        
        String suit = "Spades";
        
        }
        
         if (three == 11 || three == 24 || three == 37 || three == 50){
            
            String royal = "Jack";
        }
        else if (three == 12 || three == 25 || three == 38 || three == 51){
            
            String royal = "Queen";
        }
        else if (three == 13 || three == 26 || three == 39 || three == 52){
            
            String royal = "King";
        }
        else if (three == 1 || three == 14 || three == 27 || three == 40){
            
            String royal = "Ace";
        }
        else if (three >= 2 && three <= 10 || three >= 15 && three <= 23 || three >= 28 && three <= 36 || three >= 41 && three <= 49){
        
             int number = three;
        }
        
            if (four >= 1 && four <= 13){
        
        String suit = "Diamonds";
    }
        else if (four >= 14 && four <= 26){
        
        String suit = "Clubs";
    }
        else if (four >= 27 && four <= 39){
        
        String suit = "Hearts";
    }
     
        else if (four >= 40 && four <= 52){
        
        String suit = "Spades";
        
        }
        
         if (four == 11 || four == 24 || four == 37 || four == 50){
            
            String royal = "Jack";
        }
        else if (four == 12 || four == 25 || four == 38 || four == 51){
            
            String royal = "Queen";
        }
        else if (four == 13 || four == 26|| four == 39 || four == 52){
            
            String royal = "King";
        }
        else if (four == 1 || four == 14 || four == 27 || four == 40){
            
            String royal = "Ace";
        }
        else if (four >= 2 && four <= 10 || four >= 15 && four <= 23 || four >= 28 && four <= 36 || four >= 41 && four <= 49){
        
             int number = four;
        }
        
            if (five >= 1 && five <= 13){
        
        String suit = "Diamonds";
    }
        else if (five >= 14 && five <= 26){
        
        String suit = "Clubs";
    }
        else if (five >= 27 && five <= 39){
        
        String suit = "Hearts";
    }
     
        else if (five >= 40 && five <= 52){
        
        String suit = "Spades";
        
        }
        
         if (five == 11 || five == 24 || five == 37 || five == 50){
            
            String royal = "Jack";
        }
        else if (five == 12|| five == 25|| five == 38|| five == 51){
            
            String royal = "Queen";
        }
        else if (five == 13 || five == 26|| five == 39|| five == 52){
            
            String royal = "King";
        }
        else if (five == 1|| five == 14|| five == 27|| five == 40){
            
            String royal = "Ace";
        }
        else if (five >= 2 && five <= 10|| five >= 15 && five <= 23|| five >= 28 && five <= 36|| five >= 41 && five <= 49){
        
             int number = five;
        }
         
         
         if (one==two&&one==three||one==two&&one==four||one==two&&one==five||one==three&&one==four||one==three&&one==five||one==four&&one==five||two==one&&two==three||two==one&&two==four||two==one&&two==five||two==three&&two==four||two==three&&two==five||two==four&&two==five||three==one&&three==four||three==one&&three==five||three==two&&three==four||three==two&&three==five||three==four&&three==five)
         
            System.out.println("You have three of a kind");
            
        else if (one==two&&one==three||one==four||one==five||two==three||two==four||two==five||three==four||three==five||four==five)
         System.out.println("You have a two pair");
        else if (one==three&&one==two||one==four||one==five||two==three||two==four||two==five||three==four||three==five||four==five)
         System.out.println("You have a two pair");
        else if (one==four&&one==three||one==two||one==five||two==three||two==four||two==five||three==four||three==five||four==five)
         System.out.println("You have a two pair");
        else if (one==five&&one==three||one==four||one==two||two==three||two==four||two==five||three==four||three==five||four==five)
         System.out.println("You have a two pair");
        else if (two==three||one==three||one==four||one==five||one==two||two==four||two==five||three==four||three==five||four==five)
         System.out.println("You have a two pair");
        else if (two==four||one==three||one==four||one==five||two==three||one==two||two==five||three==four||three==five||four==five)
         System.out.println("You have a two pair");
        else if (two==five||one==three||one==four||one==five||two==three||two==four||two==one||three==four||three==five||four==five)
         System.out.println("You have a two pair");
        else if (three==four||one==three||one==four||one==five||two==three||two==four||two==five||one==two||three==five||four==five)
         System.out.println("You have a two pair");
        else if (three==five||one==three||one==four||one==five||two==three||two==four||two==five||three==four||one==two||four==five)
         System.out.println("You have a two pair");
        else if (four==five||one==three||one==four||one==five||two==three||two==four||two==five||three==four||three==five||one==two)
        
        System.out.println("You have a two pair");
        
            
            
        else if (one==two||one==three||one==four||one==five||two==three||two==four||two==five||three==four||three==five||four==five)
        
        System.out.println("You have a pair");
        
        else;
        System.out.println("You have a high card hand");
        
    }
}