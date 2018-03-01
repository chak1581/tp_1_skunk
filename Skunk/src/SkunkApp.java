
import java.util.Random;
import java.util.Scanner;

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
	

	
}
