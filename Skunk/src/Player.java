
public class Player implements Comparable<Player>{
	

	String name;
	int score;
	int chip;
	boolean isDonePlaying;
	int rank;
	int gameNo;

	public int getGameNo() {
		return gameNo;
	}


	public void setGameNo(int gameNo) {
		this.gameNo = gameNo;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public boolean isDonePlaying() {
		return isDonePlaying;
	}


	public void setDonePlaying(boolean isDonePlaying) {
		this.isDonePlaying = isDonePlaying;
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
	

	public String toString() {
		return "Name: " + this.name + " , Score: " + this.score + " , Chip: " + this.chip + " , Rank: "+(this.rank+1);
	}
	
	public String displayRoundScore() {
		return "Name: " + this.name + " , Score: " + this.score + " , Chip: " + this.chip;
	}
	
	@Override
	public int compareTo(Player comparePlayer) {
		
		if(this.gameNo == 1) {
			int compareScore = ((Player) comparePlayer).getScore();
			return  compareScore - this.score;
		}else {
			int compareChips = ((Player) comparePlayer).getChip();
			return  compareChips - this.chip;
		}
	}
}
