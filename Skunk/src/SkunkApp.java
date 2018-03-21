import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Ipshita & Shanqi
 * Skunk Game 
 * Please see SkunkRules.docx for game rules
 * and penalties
 * 
 */
public class SkunkApp {
	/**
	 * 
	 * This is the main presentation logic for the game. It displays the necessary
	 * components on the console.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("************************************************************\n"
				+ "************************************************************\n"
				+ "********************Welcome to Skunk Game*******************\n"
				+ "************************************************************\n"
				+ "************************************************************");
		int option;
		a: while (true) {
			System.out.println("1.Start Game");
			System.out.println("2.Exit");
			System.out.print("[Please enter your choice]: ");
			option = input.nextInt();
			if (option == 1) {
				System.out.print("\n[Enter number of players]:");
				Scanner reader = new Scanner(System.in);
				int gameNo = 0;
				int noOfPlayers = 0;

				SkunkRules skunkRules = new SkunkRules();
				List<Match> matches = new ArrayList();
				noOfPlayers = reader.nextInt();

				b: while (true) {

					if (noOfPlayers >= 2 && noOfPlayers <= 8) {

						/*
						 * if (noOfPlayers < 2 || noOfPlayers > 8) { System.out.
						 * println("You need atleast 2 and atmost 8 players to play this game.");
						 * return; }
						 */
						Player players[] = new Player[noOfPlayers];
						for (int i = 0; i < noOfPlayers; i++) {
							System.out.print("\n[Enter the name of player# " + (i + 1) + "]:");
							players[i] = new Player(reader.next(), 0, 50);
						}
						skunkDisplayRules(reader, skunkRules);

						System.out.println("\nChips left in the Kitty : " + 0);
						Game game = new Game(0, 400, noOfPlayers);

						List<Round> rounds = new ArrayList();

						boolean wantToPlay = true;
						while (wantToPlay) {
							int noOfRound = 0;
							String choice;
							boolean anyoneScoredHundred = false;
							int numberOfChances = 0;
							int numberOfPasses = 0;
							int numberOfStops = 0;
							gameNo += 1;
							while (noOfRound >= 0 && numberOfChances <= noOfPlayers && numberOfStops < noOfPlayers
									&& numberOfPasses <= noOfPlayers) {
								System.out.println("***********Round# " + (noOfRound + 1) + "***********");
								Turn turn = null;
								Round round = new Round();
								numberOfPasses = 0;
								// numberOfStops = 0;
								for (int i = 0; i < noOfPlayers; i++) {

									players[i].setGameNo(gameNo);
									turn = new Turn(false, false, players[i]);
									if (anyoneScoredHundred)
										numberOfChances++;
									while (!players[i].isDonePlaying() && !turn.isDenyTurn() && !turn.isLostTurn()) {

										/*
										 * System.out.println("Player " + players[i].getName() +
										 * " pick your choice: 1) R - Roll 2) P - Pass 3) S - Stop");
										 */
										System.out.println("Player " + players[i].getName()
												+ " pick your choice: R)- Roll P)- Pass S)- Stop");
										choice = reader.next();
										if ("R".equalsIgnoreCase(choice)) {
											turn.play(players[i], game);
											System.out.println("Player# " + (i + 1) + " " + players[i].name + " Score :"
													+ (players[i].getScore() + turn.score) + " Chips :"
													+ players[i].getChip());

										} else if ("P".equalsIgnoreCase(choice)) {
											turn.setDenyTurn(true);
											numberOfPasses += 1;
											System.out.println("Player# " + (i + 1) + " " + players[i].name + " Score :"
													+ (players[i].getScore() + turn.score) + " Chips :"
													+ players[i].getChip());

										} else if ("S".equalsIgnoreCase(choice)) {
											players[i].setDonePlaying(true);
											numberOfStops += 1;
											System.out.println("Player# " + (i + 1) + " " + players[i].name + " Score :"
													+ (players[i].getScore() + turn.score) + " Chips :"
													+ players[i].getChip());

										}
									}
									players[i].setScore(players[i].getScore() + turn.getScore());
									/*
									 * System.out.println("Round "+(noOfRound + 1) + " Summary - Player# " + (i + 1)
									 * + " :" + players[i].displayRoundScore());
									 */
									if (players[i].getScore() >= 100 && !anyoneScoredHundred) {
										anyoneScoredHundred = true;
										System.out.println(
												"*^O^*===*^O^*====*^O^*====*^O^*====*^O^*====*^O^*====*^O^*====*^O^*");
										System.out.println("    Congratulations " + players[i].getName()
												+ "!!! You're the 1st one to reach 100+");
										System.out.println(
												"Rest of the players have only 1 attempt to match the highest score");
										System.out.println(
												"*^O^*===*^O^*====*^O^*====*^O^*====*^O^*====*^O^*====*^O^*====*^O^*");
										numberOfChances++;
										players[i].setDonePlaying(true);
									}
									if (numberOfChances != 0) {
										numberOfChances++;
										players[i].setDonePlaying(true);
									}
								}
								round.setTurn(turn);
								rounds.add(round);
								noOfRound++;
								skunkRules.displayScoreBoard(noOfPlayers, players, game);
							}
							if (!skunkRules.allPlayersScoreZero(players, noOfPlayers)) {
								skunkRules.setPlayersRank(players, noOfPlayers);
								game.settleChips(players, noOfPlayers);
							}
							System.out.println("**********************");
							System.out.println("<<<<<Game Results>>>>>");
							System.out.println("**********************");
							System.out.println("Chips left in the kitty: " + game.getChipsInKitty());
							for (int i = 0; i < noOfPlayers; i++) {
								System.out.println(players[i].toString());
							}
							skunkRules.displaySummary(matches, game);

							List<Player> newPlayersList = saveSummary(noOfPlayers, players);
							Match match = new Match(gameNo, newPlayersList);
							matches.add(match);
							wantToPlay = playMultipleGame(reader, noOfPlayers, skunkRules, players, wantToPlay);

						}
						System.out.println("\n****Match Summary*****\n");
						skunkRules.displaySummary(matches, game);
						skunkRules.displayScoreBoard(noOfPlayers, players, game);
						System.out.println("******************************End of Game******************************");
						System.out.println("****************Thank you for playing Skunk Game***********************\n"
								+ "********************************************Ipshita & Shanqi***********");
						break a;
					} else {
						System.out.println("<<Minimum 2 players and Maximum 8 players.Please start over.>>\n");
						break b;
					}
				}
			} else if (option == 2) {
				System.out.println("****************Thank you for playing Skunk Game***********************\n"
						+ "********************************************Ipshita & Shanqi***********");
				break a;
			} else {
				System.out.println("*********Please enter either 1 or 2 for your choice*********\n");
			}
		}
	}

	private static boolean playMultipleGame(Scanner reader, int noOfPlayers, SkunkRules skunkRules, Player[] players,
			boolean wantToPlay) {
		System.out.print("\n\n\n[Want to play again? Y/N]: ");
		if (!("Y".equalsIgnoreCase(reader.next()))) {
			wantToPlay = false;
		} else {
			skunkRules.resetFlags(players, noOfPlayers);
		}
		return wantToPlay;
	}

	private static void skunkDisplayRules(Scanner reader, SkunkRules skunkRules) {
		System.out.print("\n[Do you want to see the rules of Skunk? Y/N]:");
		if ("Y".equalsIgnoreCase(reader.next()))
			skunkRules.displayRules();
		else
			System.out.println("\nAll right!!! Let's begin");
		System.out.println("Initializng...");
		//System.out.println("\nTotal chips in Kitty : 400");
	}

	private static List<Player> saveSummary(int noOfPlayers, Player[] players) {
		List<Player> newPlayersList = new ArrayList<Player>();
		for (int i = 0; i < noOfPlayers; i++) {
			Player tempPlayer = new Player();
			tempPlayer.chip = players[i].chip;
			tempPlayer.name = players[i].name;
			tempPlayer.gameNo = players[i].gameNo;
			tempPlayer.isDonePlaying = players[i].isDonePlaying;
			tempPlayer.rank = players[i].rank;
			tempPlayer.score = players[i].score;
			newPlayersList.add(tempPlayer);
		}
		return newPlayersList;
	}

}
