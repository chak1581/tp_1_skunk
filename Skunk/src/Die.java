
public class Die {
	
	private int lastRoll;
	
	
	private int [] dieValues = new int[] {3,4,6,2,5,1};

	public Die()
	{
		this.roll(4);
	}

	public Die(int firstValue) 
	{
		setLastRoll(firstValue);
	}

	public int getLastRoll() 
	{

		return this.lastRoll;
	}

	
	protected void setLastRoll(int lastRoll) 
	{
		this.lastRoll = lastRoll;
	}

	public  void roll(int playNum) 
	{
		//setLastRoll((int) (Math.random() * 6 + 1));
		
		int rollValue = dieValues[playNum];
		
		setLastRoll(rollValue);
	}

	/*
	@Override
	public String toString() 
	{
		return "A Die object with roll " + this.getLastRoll();

		
	}*/

	/*public String toString(int msg)
	{
		return msg + this.toString();
	}*/
}
