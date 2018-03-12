import java.util.Arrays;

public class SkunkRules {

	public SkunkRules() {}
	
	public void displayRules() {
		//System.out.println("Google it ;)");
		
		System.out.println("Skunk - Game Rules\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"•	This game could be played by 2 to 8 players.\r\n" + 
				"\r\n" + 
				"•	The objective of the game is to accumulate a score of 100 points or more by rolling two die.\r\n" + 
				"\r\n" + 
				"•	Each player is assigned 50 chips from the kitty to start the game.\r\n" + 
				"\r\n" + 
				"•	A score is made by rolling the dice and combining the points on the two dice. \r\n" + 
				"\r\n" + 
				"•	The player has the privilege of continuing to shake to increase his score or of passing the dice to wait for the next series, thus preventing the possibility of rolling a Skunk and losing his score.\r\n" + 
				"\r\n" + 
				"•	If any player scores 100 or more, and decides to pass, becomes the target score for the other players. All other players gets 1 more turn to better their scores.\r\n" + 
				"\r\n" + 
				"•	The player with the highest score wins the game and gets all the remaining chips from the kitty, as well as 5 chips from the losing player and 10 chips from player with the score of 0.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Penalties\r\n" + 
				"\r\n" + 
				"•	A skunk in any series voids the score for that series only and draws a penalty of 1 chip placed in the \"kitty,\" and loss of dice.\r\n" + 
				"\r\n" + 
				"•	A skunk and a deuce voids the score for that series only and draws a penalty of 2 chips placed in the \"kitty,\" and loss of dice.\r\n" + 
				"\r\n" + 
				"•	TWO skunks void the ENTIRE accumulated score and draws a penalty of 4 chips placed in the \"kitty,\" and loss of dice. Player must again start to score from scratch.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"");
	}
	
	public void setPlayersRank(Player[] player,int noOfPlayers) {
		
		Arrays.sort(player);
		for(int i=0;i<noOfPlayers;i++)
		{
				player[i].setRank(i);;
				
			
		}
	}
}
