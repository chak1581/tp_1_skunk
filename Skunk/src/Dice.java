
public class Dice {

	private int lastRoll;
	private Die die1;
	private Die die2;
<<<<<<< HEAD

	public Dice() {
		this.roll();
=======
    static Player player;
	public Dice()
	{

		this.die1 = new Die();
		this.die2 = new Die();
		this.roll(player);
>>>>>>> branch 'master' of https://github.com/chak1581/tp_1_skunk.git
	}

	public Dice(Die die1, Die die2) {
		this.die1 = die1;
		this.die2 = die2;
	}

	public int getLastRoll() {
		return this.lastRoll;
	}

<<<<<<< HEAD
	public void roll() {
		die1.roll();
		die2.roll();
		this.lastRoll = die1.getLastRoll() + die2.getLastRoll();
		totalPerRoll = this.lastRoll;
=======
	public void roll(Player player)
	{
		
	
		die1.roll(trial);
		die2.roll(trial);
		
		if( (die1.getLastRoll() == 1 && die2.getLastRoll() == 2)||(die1.getLastRoll()==2 && die2.getLastRoll()==1)){
			
			this.lastRoll = 0;
			totalPerRoll = this.lastRoll;
			if(player.getChip()>1){
			player.setChip(player.getChip()-2);
			}
			return;
		}
		
		 if( die1.getLastRoll()==1 && die2.getLastRoll()==1){
				
				this.lastRoll = 0;
				totalPerRoll = this.lastRoll;
				player.setScore(0);
				if(player.getChip()>1){
				player.setChip(player.getChip()-4);
				}
				System.out.println("Score of "+player.getName()+":" +player.getScore());
				return;
				//player.setScore(0);
			}
		 
		if( die1.getLastRoll() == 1 || die2.getLastRoll() ==1){
			
			this.lastRoll = 0;
			totalPerRoll = this.lastRoll;
			if(player.getChip()>1){
			player.setChip(player.getChip()-1);
			}
			return;
		}
        
       
		
		else{
			
			this.lastRoll = die1.getLastRoll() + die2.getLastRoll();
			totalPerRoll = this.lastRoll;
		}
		

>>>>>>> branch 'master' of https://github.com/chak1581/tp_1_skunk.git
	}

	public String toString() {
		return "Roll of " + getLastRoll() + ": " + die1.getLastRoll() + " + " + die2.getLastRoll();

	}

	public static final int NUM_TRIALS = 4;
	static int trial = 0;
	static int totalPerRoll = 0;
	static int total = 0;

	public static void main(String[] args) {
		Dice dice1 = new Dice();

		for (int i = 0; i < NUM_TRIALS; i++) {

			dice1.roll(player);
			StdOut.println(dice1);
			trial++;

			total = total + totalPerRoll;
		}

		StdOut.println("Total Score: " + total);

	}
}
