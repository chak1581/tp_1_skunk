import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {

	Dice dice;
	Player player = new Player();
	int turn;
	Die die1;
	Die die2;
	int[] values1 = new int[]{5,2,3,4,1,1};
	int[] values2 = new int[]{6,5,1,3,2,1};
	
	@Test
	public void testRoll_case1() {
		
		turn = 4;		
		die1 = new Die(values1);
		die2 = new Die(values2);
		dice = new Dice(die1,die2);
		dice.roll(player,turn);	
		assertEquals(7, dice.getLastRoll());
	}
	@Test
	public void testRoll_case2() {
		
		turn = 8;		
		die1 = new Die(values1);
		die2 = new Die(values2);
		dice = new Dice(die1,die2);
		dice.roll(player,turn);	
		assertEquals(7, dice.getLastRoll());
	}

	@Test
	public void testRoll_1skunk() {
		
		turn = 3;		
		die1 = new Die(values1);
		die2 = new Die(values2);
		dice = new Dice(die1,die2);
		dice.roll(player,turn);	
		assertEquals(0, dice.getLastRoll());
	}
	@Test
	public void testRoll_2skunk() {
		
		turn = 6;		
		die1 = new Die(values1);
		die2 = new Die(values2);
		dice = new Dice(die1,die2);
		dice.roll(player,turn);	
		assertEquals(0, dice.getLastRoll());
	}
	@Test
	public void testRoll_skunk_and_deuce() {
		
		turn = 5;		
		die1 = new Die(values1);
		die2 = new Die(values2);
		dice = new Dice(die1,die2);
		dice.roll(player,turn);	
		assertEquals(0, dice.getLastRoll());
	}

	@Test
	public void testRoll_skunk_and_total100() {
		
		
		die1 = new Die(values1);
		die2 = new Die(values2);
		dice = new Dice(die1,die2);
		player.setChip(50);
		int total =0;
		turn = 1;
		while(total <100) {
			if(turn % 6 == 0)
			{
				turn += 1;
			}
			dice.roll(player,turn);
			total += dice.getLastRoll();
			System.out.println(dice.toString());
			System.out.println(total);
			turn++;
		}
		System.out.println("Game Summary: Chips--"+player.getChip()+" Total Score--" +total);
		assertEquals(40,player.getChip());
		assertEquals(100,total);
	}
}
