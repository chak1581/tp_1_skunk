
public class Player {
	

	String name;
	int score;
	int chip;
	boolean lostChance = false;
	boolean denyTurn = false;

	public boolean isDenyTurn() {
		return denyTurn;
	}


	public void setDenyTurn(boolean denyTurn) {
		this.denyTurn = denyTurn;
	}


	public Player() {
		
		
	}
	

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
	}

	public boolean getLostChance() {
		return lostChance;
	}

	public void setLostChance(boolean lostChance) {
		this.lostChance = lostChance;
	}
	public boolean isTwoPlayers(Player secondPlayer) {
		if (!name.equals(secondPlayer.name)) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "Player Name: " + this.name + " , Total Score: " + this.score + " , Total Chip: " + this.chip;
	}
}
