import java.util.Scanner;

public class SkunkApp {

	
	static Dice player1dice = new Dice();
	static Dice player2dice = new Dice();
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		boolean player1Deny = false;
		boolean player2Deny = false;
		System.out.println("************Welcome to Skunk Game*************");
		System.out.print("==================Game Start==================\nPlayer 1 - Please Enter your Name: ");
		Player playerOne = new Player(reader.next(), 0, 50);
		System.out.print("Player 2 - Please Enter your Name: ");
		Player playerTwo = new Player(reader.next(), 0, 50);		
		
		System.out.println("Initializng...");
		System.out.println(playerOne.toString());
		System.out.println(playerTwo.toString());
		
		while(playerOne.getChip() >0 && playerOne.getScore() <100 && playerTwo.getChip() >0 && playerTwo.getScore() <100)
		{
			player1Deny = false;
			player2Deny = false;
			if(!playerOne.getLostChance()) {
				// change println to pint
			System.out.print("Player 1, Would you like to roll? \n[Enter Y for Yes or N for No]:");
			if(reader.next().toString().equalsIgnoreCase("N") ){
				playerTwo.setLostChance(false);
				playerOne.setLostChance(true);
				player1Deny = true;
				if(!playerTwo.getLostChance()) {
				//while(!playerTwo.getLostChance() && playerTwo.getChip() >0 && playerTwo.getScore() <100) {
					//player2Deny = false;
					System.out.print("Player 2, Would you like to roll? \n[Enter Y for Yes or N for No]:");
					if(reader.next().toString().equalsIgnoreCase("N") ){
						playerTwo.setLostChance(true);
						playerOne.setLostChance(false);
						player2Deny = true;
						if(player1Deny && player2Deny) {
							// change Game over to Game end
							System.out.println("===================Game End===================\n No WINNER at this Game!!");
						break;
     					}
					}else {
						player2Turn(playerTwo);
						if(playerTwo.getLostChance())
							playerOne.setLostChance(false);
					}
					
				}
				
			}else {
			player1Turn(playerOne);
			if(playerOne.getLostChance())
				playerTwo.setLostChance(false);
			}
		  } else if(!playerTwo.getLostChance()) {
			  System.out.print("Player 2, Would you like to roll? \n[Enter Y for Yes or N for No]:");
				if(reader.next().toString().equalsIgnoreCase("N") ){
					player2Deny = true;
					playerTwo.setLostChance(true);
					playerOne.setLostChance(false);
					if(player1Deny && player2Deny)
					{
						System.out.println("==================Game End===================\n No WINNER at this Game!!");
					break;
					}}else {
					player2Turn(playerTwo);
					if(playerTwo.getLostChance())
						playerOne.setLostChance(false);
				}
		  }
		}		
		if(playerOne.getScore() >=100) {
			System.out.println("====================Game End======================\n WINNER: PLAYER ONE");
		}else if(playerTwo.getScore() >=100)
		{
			System.out.println("====================Game End======================\n WINNER: PLAYER ONE");
		}else {
			
		}
		System.out.println("***************Final Scores************************");
		System.out.println(playerOne.toString());
		System.out.println(playerTwo.toString());
		System.out.println("***************************************************");
	}
	
	private static void player1Turn(Player playerOne)
	{
		player1dice.roll(playerOne);
		playerOne.score = playerOne.score+player1dice.lastPerRoll;			
		System.out.println("Total Score: "+playerOne.score);
	    System.out.println(player1dice.toString());
	}
	
	private static void player2Turn(Player playerTwo)
	{
		player2dice.roll(playerTwo);
		playerTwo.score = playerTwo.score+player2dice.lastPerRoll;			
		System.out.println("Total Score: "+playerTwo.score);
	    System.out.println(player2dice.toString());
	}
}
