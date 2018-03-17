
public class Game {

	Round round;
	Player winner;
	int chipsInKitty;
	final int totalChips;
	int numberOfPlayers;

	public Round getRound() {
		return round;
	}

	public void setRound(Round round) {
		this.round = round;
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public int getChipsInKitty() {
		return chipsInKitty;
	}

	public void setChipsInKitty(int chipsInKitty) {
		this.chipsInKitty = chipsInKitty;
	}

	public int getTotalChips() {
		return totalChips;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public Game(int chipsInKitty, int totalChips, int numberOfPlayers) {
		super();
		this.chipsInKitty = chipsInKitty;
		this.totalChips = totalChips;
		this.numberOfPlayers = numberOfPlayers;
	}

	public void settleChips(Player[] player, int noOfPlayers) {

		for (int i = 1; i < noOfPlayers; i++) {
			if (player[i].getScore() == 0) {
				player[0].chip = player[0].getChip() + 10;
				player[i].chip = player[i].getChip() - 10;
			} else {
				player[0].chip = player[0].getChip() + 5;
				player[i].chip = player[i].getChip() - 5;
			}

		}
		player[0].chip = player[0].getChip() + chipsInKitty;
		this.setChipsInKitty(0);
	}
}
