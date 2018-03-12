
public class Dice {

	private int lastRoll;
	private Die die1;
	private Die die2;
	boolean singleSkunk;
	boolean skunkAndDeuce;
	boolean doubleSkunk;
	    
	public Dice()
	{

		die1 = new Die();
		die2 = new Die();
		//player = new Player();
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
		die1.roll();
		die2.roll();
		lastRoll = die1.getLastRoll() + die2.getLastRoll();
		System.out.println("Dice Roll " + getLastRoll());

		if ((die1.getLastRoll() == 1 && die2.getLastRoll() == 2)
				|| (die1.getLastRoll() == 2 && die2.getLastRoll() == 1)) {

			skunkAndDeuce = true;
			lastRoll = 0;
			return;
		}

		if (die1.getLastRoll() == 1 && die2.getLastRoll() == 1) {

			doubleSkunk = true;
			lastRoll = 0;
			return;

		}

		if (die1.getLastRoll() == 1 || die2.getLastRoll() == 1) {

			singleSkunk = true;
			lastRoll = 0;
			return;
		}

		else {

		}
	}
		
	public void roll(int turn)
	{
		die1.roll(turn);
		die2.roll(turn);
		lastRoll = die1.getLastRoll() + die2.getLastRoll();
		System.out.println("Dice Roll " + getLastRoll());

		if ((die1.getLastRoll() == 1 && die2.getLastRoll() == 2)
				|| (die1.getLastRoll() == 2 && die2.getLastRoll() == 1)) {

			skunkAndDeuce = true;
			lastRoll = 0;
			return;
		}

		if (die1.getLastRoll() == 1 && die2.getLastRoll() == 1) {

			doubleSkunk = true;
			lastRoll = 0;
			return;

		}

		if (die1.getLastRoll() == 1 || die2.getLastRoll() == 1) {

			singleSkunk = true;
			lastRoll = 0;
			return;
		}

		else {

		}
	}
		
	

	public String toString()
	{
		return "Roll of " + getLastRoll() + ": " + die1.getLastRoll() + " + " + die2.getLastRoll();

	}


	
}
