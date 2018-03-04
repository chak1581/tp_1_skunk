
public class Dice {

	private int lastRoll;
	private Die die1;
	private Die die2;
	private Player player;
    
	public Dice()
	{

		die1 = new Die();
		die2 = new Die();
		player = new Player();
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

	public void roll(Player player)
	{
		
	
		die1.roll();
		die2.roll();
		
		if( (die1.getLastRoll() == 1 && die2.getLastRoll() == 2)||(die1.getLastRoll()==2 && die2.getLastRoll()==1)){
			
			this.lastRoll = 0;
			lastPerRoll = this.lastRoll;
			if(player !=null && player.getChip()>=2){
			player.setChip(player.getChip()-2);
			player.lostChance = true;
			}
						return;
		}
		
		 if( die1.getLastRoll()==1 && die2.getLastRoll()==1){
				
				this.lastRoll = 0;
				lastPerRoll = this.lastRoll;
				player.setScore(0);
				if(player !=null && player.getChip()>=4){
				player.setChip(player.getChip()-4);
				player.lostChance = true;
				
				}
				System.out.println("Score of "+player.getName()+":" +player.getScore());
								return;

			}
		 
		if( die1.getLastRoll() == 1 || die2.getLastRoll() ==1){
			
			this.lastRoll = 0;
			lastPerRoll = this.lastRoll;
			if(player !=null && player.getChip()>=1){
			player.setChip(player.getChip()-1);
			player.lostChance = true;
			}
			
			return;
		}
        
       
		
		else{
			
			this.lastRoll = die1.getLastRoll() + die2.getLastRoll();
			lastPerRoll = this.lastRoll;
			if(player!=null) {
			player.lostChance = false;
			}
		}
		

	}
	
	public void roll(Player player,int turn)
	{
		
	
		die1.roll(turn);
		die2.roll(turn);
		
		if( (die1.getLastRoll() == 1 && die2.getLastRoll() == 2)||(die1.getLastRoll()==2 && die2.getLastRoll()==1)){
			
			this.lastRoll = 0;
			lastPerRoll = this.lastRoll;
			
			if(player !=null && player.getChip()>=2){
			player.setChip(player.getChip()-2);
			player.setScore(lastPerRoll);
			player.lostChance = true;
			}
						return;
		}
		
		 if( die1.getLastRoll()==1 && die2.getLastRoll()==1){
				
				this.lastRoll = 0;
				lastPerRoll = this.lastRoll;
				
				if(player !=null && player.getChip()>=4){
				player.setChip(player.getChip()-4);
				player.setScore(0);
				player.lostChance = true;
				
				}
				//System.out.println("Score of "+player.getName()+":" +player.getScore());
								return;

			}
		 
		if( die1.getLastRoll() == 1 || die2.getLastRoll() ==1){
			
			this.lastRoll = 0;
			lastPerRoll = this.lastRoll;
			
			if(player !=null && player.getChip()>=1){
			player.setChip(player.getChip()-1);
			player.lostChance = true;
			player.setScore(lastPerRoll);
			}
			
			return;
		}
        
       
		
		else{
			
			this.lastRoll = die1.getLastRoll() + die2.getLastRoll();
			lastPerRoll = this.lastRoll;
			if(player!=null) {
			player.lostChance = false;
			}
		}
		

	}


	public String toString()
	{
		return "Roll of " + getLastRoll() + ": " + die1.getLastRoll() + " + " + die2.getLastRoll();

	}


	public static final int NUM_TRIALS = 4;
	//static int trial = 0;
	static int lastPerRoll = 0;
	static int total = 0;

	public static void main(String[] args)
	{
		int[] val = new int[] {2,1,3,5,4,6};
		//Dice dice1 = new Dice();
	    Die die3 = new Die();
		//die1.setTurns(trial);
	    die3.setDieValues(val);
		System.out.println(die3);
		for (int i = 1; i < 6; i++)
		{
			
			//die3.setTurns(i);
			die3.roll(i);
			System.out.println("Roll value "+die3.getLastRoll());
			
			
			total  += die3.getLastRoll();
		}

		StdOut.println("Total Score: "+total);
		
	}
}
