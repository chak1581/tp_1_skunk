
public class Turn {

	boolean lostTurn;
	boolean denyTurn;
	Player player;
	int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isLostTurn() {
		return lostTurn;
	}

	public void setLostTurn(boolean lostTurn) {
		this.lostTurn = lostTurn;
	}

	public boolean isDenyTurn() {
		return denyTurn;
	}

	public void setDenyTurn(boolean denyTurn) {
		this.denyTurn = denyTurn;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Turn() {
	}

	public Turn(boolean lostTurn, boolean denyTurn, Player player) {
		super();
		this.lostTurn = lostTurn;
		this.denyTurn = denyTurn;
		this.player = player;
	}

	public void play(Player player, Game game) {

		Dice dice = new Dice();
		dice.roll();
		if (dice.singleSkunk) {
			setLostTurn(true);
			score = 0;
			player.chip = player.getChip() - 1;
			game.chipsInKitty = game.getChipsInKitty() + 1;
		} else if (dice.skunkAndDeuce) {
			setLostTurn(true);
			score = 0;
			player.chip = player.getChip() - 2;
			game.chipsInKitty = game.getChipsInKitty() + 2;
		} else if (dice.doubleSkunk) {
			setLostTurn(true);
			score = 0;
			player.setScore(0);
			player.chip = player.getChip() - 4;
			game.chipsInKitty = game.getChipsInKitty() + 4;
		} else {
			score += dice.getLastRoll();
		}
		
		System.out.println("Total Chips in Kitty:  "+game.getChipsInKitty());
	}

	public void play(Player player, Game game, int turn) {
		int[] values1 = new int[] { 5, 2, 3, 4, 1, 1 };
		int[] values2 = new int[] { 6, 5, 1, 3, 2, 1 };
		Die die1 = new Die(values1);
		Die die2 = new Die(values2);
		Dice dice = new Dice(die1, die2);
		dice.roll(turn);
		if (dice.singleSkunk) {
			setLostTurn(true);
			score = 0;
			player.chip = player.getChip() - 1;
			game.chipsInKitty = game.getChipsInKitty() + 1;
		} else if (dice.skunkAndDeuce) {
			setLostTurn(true);
			score = 0;
			player.chip = player.getChip() - 2;
			game.chipsInKitty = game.getChipsInKitty() + 2;
		} else if (dice.doubleSkunk) {
			setLostTurn(true);
			score = 0;
			player.setScore(0);
			player.chip = player.getChip() - 4;
			game.chipsInKitty = game.getChipsInKitty() + 4;
		} else {
			score += dice.getLastRoll();
		}
	}

}
