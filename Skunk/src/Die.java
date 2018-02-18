
public class Die {
	
	private int lastRoll;
	private int [] dieValues = new int[] {3,4,6,2,5,1};
	private int nextPos;
	
	public Die(int[] values)
	{
		dieValues = values;
	}

	public int getLastRoll() 
	{

		return this.lastRoll;
	}

	
	protected void setLastRoll(int lastRoll) 
	{
		this.lastRoll = lastRoll;
	}

	public void roll() 
	{
		//setLastRoll((int) (Math.random() * 6 + 1));
		
		int rollValue = dieValues[nextPos];
		setLastRoll(rollValue);
		nextPos++;
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
