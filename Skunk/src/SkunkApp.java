import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkunkApp {

	public static void main(String[] args) {
		
		System.out.println("!!!!!!!!!!!!Welcome to Skunk Game!!!!!!!!!!!!!!");
		System.out.println("\nEnter number of players(Max of 8 players allowed) :");
		Scanner reader = new Scanner(System.in);
		SkunkRules skunkRules = new SkunkRules();
		int noOfPlayers = reader.nextInt();
		Player players[] = new Player[noOfPlayers];
		for(int i =0;i<noOfPlayers;i++)
		{
			System.out.println("\nEnter the name of player# "+(i+1)+":");
			players[i] = new Player(reader.next(),0,50);
		}
		System.out.println("\nDo you want to see the rules of Skunk? Y/N :");
		if("Y".equalsIgnoreCase(reader.next()))
			skunkRules.displayRules();
		else
			System.out.println("All right!!! Let's begin");
		System.out.println("Initializng...");
		System.out.println("\nTotal chips in Kitty : 400");
		System.out.println("\nChips left in the Kitty : "+(400-(50*noOfPlayers)));
		Game game = new Game((400-(50*noOfPlayers)),400,noOfPlayers);
		int noOfRound=0;
		String choice;
		List<Round> rounds = new ArrayList();
		boolean anyoneScoredHundred = false;
		int numberOfChances=0;
		while(noOfRound>=0 && numberOfChances<=noOfPlayers) {
			System.out.println("Round# "+(noOfRound+1));
			Turn turn = null;
			Round round = new Round();
			for(int i=0;i<noOfPlayers;i++)
			{
				turn = new Turn(false,false,players[i]);
				if(anyoneScoredHundred)
					numberOfChances++;
				while(!players[i].isDonePlaying() && !turn.isDenyTurn() && !turn.isLostTurn()) {
					
					System.out.println("Player "+players[i].getName()+" pick your choice: 1) R - Roll 2) P - Pass 3) S - Stop");
					choice = reader.next();
					if("R".equalsIgnoreCase(choice))
					{
						turn.play(players[i],game);
						System.out.println("Player# "+(i+1)+" "+players[i].name+" Score :"+(players[i].getScore()+turn.score)+" Chips :"+players[i].getChip());
					
					}else if("P".equalsIgnoreCase(choice))
					{
						turn.setDenyTurn(true);
						System.out.println("Player# "+(i+1)+" "+players[i].name+" Score :"+(players[i].getScore()+turn.score)+" Chips :"+players[i].getChip());
						
					}else if("S".equalsIgnoreCase(choice))
					{
						players[i].setDonePlaying(true);
						System.out.println("Player# "+(i+1)+" "+players[i].name+" Score :"+(players[i].getScore()+turn.score)+" Chips :"+players[i].getChip());
						
					}
				}
				players[i].setScore(players[i].getScore()+turn.getScore());
				System.out.println("Score of Player# "+(i+1)+" after Round"+ (noOfRound+1)+"Info: "+players[i].toString());
				if(players[i].getScore() >=100 && !anyoneScoredHundred) {
					anyoneScoredHundred = true;
					System.out.println("Congratualtions "+players[i].getName()+"!!! You're the 1st one to reach 100+");
					System.out.println("Rest of the players have only 1 attempt to match the highest score");
				    numberOfChances++;
				    players[i].setDonePlaying(true);
				}
				if(numberOfChances !=0) {
					numberOfChances++;
					 players[i].setDonePlaying(true);
				}
			}
			round.setTurn(turn);
			rounds.add(round);
			noOfRound++;
		}
		skunkRules.setPlayersRank(players,noOfPlayers);
		game.settleChips(players, noOfPlayers);
		System.out.println("Results");
		System.out.println("Chips left in the kitty"+game.getChipsInKitty());
		for(int i=0;i<noOfPlayers;i++)
		{
			System.out.println(players[i].toString());
		}
		System.out.println("!!!!!!! End of Game !!!!!!!!");
	}
}
