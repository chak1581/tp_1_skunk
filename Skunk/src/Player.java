
public class Player {
<<<<<<< HEAD
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
=======
	

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



	public void setName(String name) {
		this.name = name;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public int getChip() {
		return chip;
	}



	public void setChip(int chip) {
		this.chip = chip;
>>>>>>> branch 'master' of https://github.com/chak1581/tp_1_skunk.git
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
