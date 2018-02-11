
public class Dice {

	private int lastRoll;
	private Die die1;
	private Die die2;



	public Dice()
	{

		this.die1 = new Die();
		this.die2 = new Die();
		this.roll();
	}

	public Dice(Die die1, Die die2) 
	{
		this.die1 = die1;
		this.die2 = die2;
	}


	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public void roll()
	{
		

		die1.roll(trial);
		die2.roll(trial);
		this.lastRoll = die1.getLastRoll() + die2.getLastRoll();
		totalPerRoll = this.lastRoll;
	}


	public String toString()
	{
		return "Roll of " + getLastRoll() + ": " + die1.getLastRoll() + " + " + die2.getLastRoll();

	}


	public static final int NUM_TRIALS = 4;
	static int trial = 0;
	static int totalPerRoll = 0;
	static int total = 0;

	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
	

		for (int i = 0; i < NUM_TRIALS; i++)
		{
			

			dice1.roll();
			StdOut.println(dice1);
			trial++;
			
			
			total = total + totalPerRoll;
		}

		StdOut.println("Total Score: "+total);
		
	}
}
