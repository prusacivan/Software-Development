// @author Ivan Prusac

import java.util.Scanner;
import java.util.Random;

public class WordGameApp{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
// Here we can find allvariables that we are going to use in app
		   int num;
           String message;
		   int total1,total2;
		   String plOne;
		   String plTwo;
		   int sum1=0;
		   int sum2=0;
// First ouput are the rules of the game
		System.out.println("Wellcome to Computer word game.");
        System.out.println("At the begining choose how many rounds you want to play.");
        System.out.println("Before first round starts you will see random 12 letters that you can use in game.");
		System.out.println("The word has to be formed only from the 12 letters randomly selected for that round.");
		System.out.println("Each player gain points for each double vowel in the word.");
		System.out.println("Winner is player who have more double vowels.");
		System.out.println("--------------------------------------------------------------------------------------");

// Input where players decide how many rounds they wanna play
		System.out.println("Please enter number of rounds:");
		num = input.nextInt();
			  input.nextLine();

		Random rand = new Random();

// Output of randomly selected 12 letters
  			String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    System.out.println("Create computer words from this 12 random letters:");
		    for (int i = 0; i < 12; i++) {
				char randomChar = abc.charAt(rand.nextInt(abc.length()));
		        System.out.println(randomChar);
    	        }
			WordGame myGame = new WordGame();

// FOR loop that contains input from each player and setter and geter methods
				for (int i=0; i<num; i++){
					System.out.println("Player 1 enter your word: ");
					plOne= input.nextLine();

					myGame.setWord(plOne);
					myGame.checkWord();
					message = myGame.getMessage();
					System.out.println(message);
					myGame.setWord(plOne);
					myGame.checkPoints();
					total1 = myGame.getPoints();
					System.out.println("You earned : " + total1 + " points");
					sum1 = sum1 + total1;
					System.out.println("Sum = " + sum1);


					System.out.println("Player 2 enter your word: ");
					plTwo= input.nextLine();
					myGame.setWord(plTwo);
					myGame.checkWord();
					message = myGame.getMessage();
					System.out.println(message);
					myGame.setWord(plTwo);
					myGame.checkPoints();
					total2 = myGame.getPoints();
					System.out.println("You earned : " + total2 + " points");
					sum2 = sum2 + total2;
					System.out.println("Sum = " + sum2);
                    }
// At the end is IF statement which first decides who is the winner and then prints message declaring the winner or draw game
					if (sum1 > sum2){
						System.out.println("Player 1 score: " + sum1 + " | Player 2 score: " + sum2 + " CONGRATULATIONS PLAYER 1, YOU ARE THE WINNER!!!");
					}else if (sum2 > sum1){
						System.out.println("Player 1 score: " + sum1 + " | Player 2 score: " + sum2 + " CONGRATULATIONS PLAYER 2, YOU ARE THE WINNER!!!");
					}else if (sum1 == sum2){
						System.out.println("Player 1 score: " + sum1 + " | Player 2 score: " + sum2 + " Its a draw game");
					}




	}
}











