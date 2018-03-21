import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class SkunkRules {

	public SkunkRules() {
	}

	public void displayRules() {
		// System.out.println("Google it ;)");

		System.out.println("=========================Skunk - Game Rules=========================" + "\r\n" + "\r\n"
				+ "•	This game could be played by 2 to 8 players.\r\n" + "\r\n"
				+ "•	The objective of the game is to accumulate a score of 100 points or more by rolling two die.\r\n"
				+ "\r\n" + "•	Each player is assigned 50 chips from the kitty to start the game.\r\n" + "\r\n"
				+ "•	A score is made by rolling the dice and combining the points on the two dice. \r\n" + "\r\n"
				+ "•	The player has the privilege of continuing to shake to increase his score or of passing the dice to wait for the next series, thus preventing the possibility of rolling a Skunk and losing his score.\r\n"
				+ "\r\n"
				+ "•	If any player scores 100 or more, and decides to pass, becomes the target score for the other players. All other players gets 1 more turn to better their scores.\r\n"
				+ "\r\n"
				+ "•	The player with the highest score wins the game and gets all the remaining chips from the kitty, as well as 5 chips from the losing player and 10 chips from player with the score of 0.\r\n"
				+ "\r\n" + "\r\n" + "==============================Penalties==============================" + "\r\n"
				+ "•	A skunk in any series voids the score for that series only and draws a penalty of 1 chip placed in the \"kitty,\" and loss of dice.\r\n"
				+ "\r\n"
				+ "•	A skunk and a deuce voids the score for that series only and draws a penalty of 2 chips placed in the \"kitty,\" and loss of dice.\r\n"
				+ "\r\n"
				+ "•	TWO skunks void the ENTIRE accumulated score and draws a penalty of 4 chips placed in the \"kitty,\" and loss of dice. Player must again start to score from scratch.\r\n"
				+ "\r\n" + "\r\n" + "\r\n" + "");
	}

	public void setPlayersRank(Player[] player, int noOfPlayers) {

		Arrays.sort(player);
		for (int i = 0; i < noOfPlayers; i++) {
			player[i].setRank(i);
			

		}
	}

	public boolean allPlayersScoreZero(Player[] player, int noOfPlayers) {
		int count = 0;
		for (int i = 0; i < noOfPlayers; i++) {
			if (player[i].getScore() == 0)
				count += 1;

		}

		if (count == noOfPlayers)
			return true;
		else
			return false;
	}

	public void displaySummary(List matches, Game game) {

		for (int i = 0; i < matches.size(); i++) {
			System.out.println("**********************");
			Match match = (Match) matches.get(i);
			System.out.println("<<<<<<Match # " + match.matchNo + ">>>>>>");
			System.out.println("**********************");
			System.out.println("Chips in Kitty :" + game.getChipsInKitty());
			// Player[] players = match.getPlayer();
			List<Player> playerList = match.getPlayerList();
			/*
			 * for(int j=0;j<players.length;j++) {
			 * 
			 * System.out.println(players[j].toString()); }
			 */

			for (int j = 0; j < playerList.size(); j++) {
				System.out.println(playerList.get(j).toString());
			}
		}
	}

	public void resetFlags(Player[] player, int noOfPlayers) {

		for (int i = 0; i < noOfPlayers; i++) {
			player[i].setRank(0);
			player[i].setDonePlaying(false);
			player[i].setScore(0);

		}
	}
	
	
	public   void displayScoreBoard(int noOfPlayers, Player[] player, Game game){
		
		StdDraw.setCanvasSize(600, 600);
		int x = 0;
		int y = noOfPlayers+4;
		StdDraw.setScale(x, y);
		StdDraw.setPenRadius(0.008);
		StdDraw.setPenColor(Color.RED);
		StdDraw.text(x+2, y-0.5, "Round Score Board");
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.text(x+2, y-1.0, "Chips in Kitty:   " +game.chipsInKitty);
		StdDraw.setPenColor(Color.BLACK);
		 
		 for (int c = 0; c <= 3; c++) {
			 
			
	            StdDraw.line(c*2, 0, 2*c, noOfPlayers);
	        }
		 
	        for (int c = 0; c < noOfPlayers; c++) {
	        	 
	        	  StdDraw.line(0, c+0.1, 6, c+0.1);
	        		 
	        		 StdDraw.text(1, (noOfPlayers+1)-0.5, "Player Name");
	        		 StdDraw.text(3, (noOfPlayers+1)-0.5, "Score");
	        		 StdDraw.text(5, (noOfPlayers+1)-0.5, "Chips"); 
	        		 StdDraw.text(1, c+0.5, player[c].getName());
		        	 StdDraw.text(3, c+0.5, ""+player[c].getScore());
		        	 StdDraw.text(5, c+0.5, ""+player[c].getChip());
 
	        }
        StdDraw.show();
		
		
	}
	

}
