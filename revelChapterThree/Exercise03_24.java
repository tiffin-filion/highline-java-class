package revelChapterThree;

public class Exercise03_24 {

  public static void main(String[] args) {
    /*
     * Program simulates picking a card from a deck of 52 cards
     * Program displays rank (Ace - King) and suit (Clubs, etc.) of the card
     */
    
    int r = (int)(Math.random() * 13);
    int s = (int)(Math.random() * 4);
    
    String rank = "";
    String suite = "";
    
    switch(r) {
      case 0: rank = "Ace"; break;
      case 1: rank = "Two"; break;
      case 2: rank = "Three"; break;
      case 3: rank = "Four"; break;
      case 4: rank = "Five"; break;
      case 5: rank = "Six"; break;
      case 6: rank = "Seven"; break;
      case 7: rank = "Eight"; break;
      case 8: rank = "Nine"; break;
      case 9: rank = "Ten"; break;
      case 10: rank = "Jack"; break;
      case 11: rank = "Queen"; break;
      case 12: rank = "King"; break;
      default: break;
    }
    
    switch(s) {
      case 0: suite = "Clubs"; break;
      case 1: suite = "Diamonds"; break;
      case 2: suite = "Hearts"; break;
      case 3: suite = "Spades"; break;
      default: break;
    }
    
    System.out.println("The card you picked is the " + rank + " of " + suite);
  }
}
