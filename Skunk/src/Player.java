
public class Player implements Comparable<Player>{
	

	String name;
	int score;
	int chip;
	boolean isDonePlaying;
	int rank;

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
	
	@Override
	public int compareTo(Player comparePlayer) {
		int compareScore = ((Player) comparePlayer).getScore();
		return  compareScore - this.score;
	}
}
