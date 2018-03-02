
import java.util.Random;
import java.util.Scanner;
<<<<<<< HEAD
=======

public class SkunkApp {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int chip = 50;
		int score = 0;
		Dice dice = new Dice();
		//String player2Input = "Y";

		System.out.println("************Welcome to Skunk Game*************");
		System.out.print("Player 1 - Enter your Name: ");
		Player playerOne = new Player(reader.next(), score, chip);
		System.out.print("Player 2 - Enter your Name: ");
		Player playerTwo = new Player(reader.next(), score, chip);		
		
		System.out.println("Initializng...");
		System.out.println(playerOne.toString());
		System.out.println(playerTwo.toString());
		
		while(playerOne.score<100 && playerTwo.score<100) {
		System.out.println("Player 1, Would you like to roll? Enter Y for Yes or N for No:");
		if(reader.next().toString().equalsIgnoreCase("N")){
			
			System.out.println("Player 2, Would you like to roll? Enter Y for Yes or N for No:");
			
			if(reader.next().toString().equalsIgnoreCase("N")){
				
				//System.out.println(playerOne.toString());
				//System.out.println(playerTwo.toString());
				//System.out.println("Game Over");
				break;
			}
			
			else {
					do {
				//while(player2Input.equalsIgnoreCase("Y") && playerTwo.score<100){
				dice.roll(playerTwo);
			    System.out.println(dice.toString());
			    playerTwo.score = playerTwo.score+dice.totalPerRoll;
				System.out.println(playerTwo.score);
				if(playerTwo.score < 100) {
				System.out.println("Player 2, Would you like to roll? Enter Y for Yes or N for No:");
				//player2Input = reader.next().toString();
				}else {
					break;
				}
					}while(reader.next().toString().equalsIgnoreCase("Y") && playerTwo.score<100);
			}
		}
			
		else {
			
			dice.roll(playerOne);
			//checkForSkunk();
			playerOne.score = playerOne.score+dice.totalPerRoll;			
			System.out.println(playerOne.score);
		    System.out.println(dice.toString());
		}
		
        
		}
		System.out.println(playerOne.toString());
		System.out.println(playerTwo.toString());
		System.out.println("Game Over");
		
	}
	
>>>>>>> branch 'master' of https://github.com/chak1581/tp_1_skunk.git

<<<<<<< HEAD
public class SkunkApp {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int chip = 50;
		int score = 0;

		System.out.println("************Welcome to Skunk Game*************");
		System.out.print("Please enter how many players: ");
		int player = reader.nextInt();
		int[] diceArr1 = { 1, 2, 3, 4, 5, 6 };// 1 represent skunk
		int[] diceArr2 = { 1, 2, 3, 4, 5, 6 };// 1 represent skunk
		while (player >= 2) {
			Random r = new Random();
			int r1 = (diceArr1[new Random().nextInt(diceArr1.length)]);
			int r2 = (diceArr2[new Random().nextInt(diceArr2.length)]);
			if (r1 > 1 && r2 > 1) {
				System.out.println("You got from Dice1: " + r1);
				System.out.println("You got from Dice2: " + r2);
			} else if (r1 > 1 && r2 == 1) {
				System.out.println("You got 0 point from this round.");
			} else if (r1 == 1 && r2 > 1) {
				System.out.println("You got 0 point from this round.");
			} else {
				System.out.println("Sorry! You need to start over.");
			}

		}
	}
=======
	
>>>>>>> branch 'master' of https://github.com/chak1581/tp_1_skunk.git
}
