
public class Die {
	
	private int lastRoll;
	int [] dieValues = new int[6];
	
	public int[] getDieValues() {
		return dieValues;
	}

	public void setDieValues(int[] dieValues) {
		this.dieValues = dieValues;
	}

	public Die()
	{
		
	}

	public Die(int[] values) 
	{
		setDieValues(values);
	}

	public int getLastRoll() 
	{

		return this.lastRoll;
	}

	
	protected void setLastRoll(int lastRoll) 
	{
		this.lastRoll = lastRoll;
	}

	public  void roll() 
	{
		setLastRoll((int) (Math.random() * 6 + 1));
		System.out.println("***********");
		System.out.println("Die Roll "+getLastRoll());
	}
	
	public  void roll(int turn) 
	{		
		if(turn >6)
		{
			int divisor = turn/6;
			turn = turn-(divisor*6);
		}
			
		setLastRoll(dieValues[turn-1]);
		
	}

}
