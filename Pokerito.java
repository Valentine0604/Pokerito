import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Type anything when you're ready");
        scan.nextLine();

        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("• There are two players, you and the computer.\n" +
                           "• The dealer will give each player one card.\n" +
                           "• Then, the dealer will draw five cards (the river)" +
                           "• The player with the most river matches wins!" +
                           "• If the matches are equal, everyone's a winner!\n" +
                           "\n" +
                           "• Ready? Type anything if you are.");
        scan.nextLine();       
        
        System.out.println("Here's your card:");
        String yourCard = randomCard();
        System.out.println(yourCard);

        System.out.println("Here's the computer's card:");
        String computersCard = randomCard();
        System.out.println(computersCard);
        

        int yourMatches = 0;
        int computerMatches =0;

        System.out.print("Now, the dealer will draw five cards. Press enter to continue.\n" + 
                          "• The dealer will draw a card every time the user presses enter." );
         for(int i=1; i<=5; i++){
            scan.nextLine();
            String draw = randomCard();
            System.out.println("Card " + i + "\n");
            System.out.print(draw);
            System.out.println("\n");
            if(draw.equals(yourCard)){
                yourMatches++;
            }
            else if(draw.equals(computersCard)){
                computerMatches++;
            }
         }

         System.out.println("Your number of matches: " + yourMatches);
         System.out.println("Computer's number of matches: " + computerMatches);

         if(yourMatches > computerMatches){
            System.out.println("You win!");
         }
         else if(yourMatches == computerMatches){
            System.out.println("Everyone wins!");
         }
         else{
            System.out.println("The computer wins!");
         }

         scan.close();
    }

    /** 
     * Function name – randomCard
     * @return (String)
     * 
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).   
     */

     public static String randomCard(){
        double randomNumber = Math.random() * 13;
        randomNumber++;

        int randomInt = (int)randomNumber;

        switch(randomInt){
            case 1:
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
            case 2:
            return "   _____\n"+              
                   "  |2    |\n"+ 
                   "  |  o  |\n"+
                   "  |     |\n"+
                   "  |  o  |\n"+
                   "  |____Z|\n";
            case 3:
            return "   _____\n" +
                   "  |3    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  |  o  |\n"+
                   "  |____E|\n";
            case 4:
            return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
            case 5:
            return "   _____ \n" +
                   "  |5    |\n" +
                   "  | o o |\n" +
                   "  |  o  |\n" +
                   "  | o o |\n" +
                   "  |____S|\n";
            case 6:
            return "   _____ \n" +
                   "  |6    |\n" +
                   "  | o o |\n" +
                   "  | o o |\n" +
                   "  | o o |\n" +
                   "  |____6|\n";
            case 7:
            return "   _____ \n" +
                   "  |7    |\n" +
                   "  | o o |\n" +
                   "  |o o o|\n" +
                   "  | o o |\n" +
                   "  |____7|\n";
            case 8:
            return "   _____ \n" +
                   "  |8    |\n" +
                   "  |o o o|\n" +
                   "  | o o |\n" +
                   "  |o o o|\n" +
                   "  |____8|\n";
            case 9:
            return "   _____ \n" +
                   "  |9    |\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |____9|\n";
            case 10:
            return "   _____ \n" +
                   "  |10  o|\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |___10|\n";
            case 11:
            return "   _____\n" +
                   "  |J  ww|\n"+ 
                   "  | o {)|\n"+ 
                   "  |o o% |\n"+ 
                   "  | | % |\n"+ 
                   "  |__%%[|\n";
            case 12:
            return "   _____\n" +
                   "  |Q  ww|\n"+ 
                   "  | o {(|\n"+ 
                   "  |o o%%|\n"+ 
                   "  | |%%%|\n"+ 
                   "  |_%%%O|\n";
            case 13:
            return "   _____\n" +
                   "  |K  WW|\n"+ 
                   "  | o {)|\n"+ 
                   "  |o o%%|\n"+ 
                   "  | |%%%|\n"+ 
                   "  |_%%%>|\n";

            default:
            return "This shouldn't get called";
        }
     }

}
