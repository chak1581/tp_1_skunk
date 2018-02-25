
public class Player {
	String name;
	int score;
	int chip;

	public Player(String name, int score, int chip) {
		this.name = name;
		this.score = score;
		this.chip = chip;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public int getChip() {
		return chip;
	}

	public boolean isTwoPlayers(Player secondPlayer) {
		if (!name.equals(secondPlayer.name)) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "Name: " + this.name + " , Score: " + this.score + " , Chip: " + this.chip;
	}
}
