import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest {

	Die die;
	int turn;
	int[] values;
	
	@Test
	public void testGetLastRoll() {
		
		die = new Die();
		die.setLastRoll(5);
		assertEquals(5, die.getLastRoll());
		
	}

	@Test
	public void testSetLastRoll() {
		
		die = new Die();
	    die.setLastRoll(5);
		assertEquals(5, die.getLastRoll());
		}
	

	@Test
	public void testRoll_1() {

	values = new int[]{1,2,3,4,5,6};
	die = new Die(values);
    turn = 1;
    die.roll(turn);
    
    assertEquals(1, die.getLastRoll());
    
		
	}
	
	@Test
	public void testRoll_2() {

	values = new int[]{1,2,3,4,5,6};
	die = new Die(values);
    turn = 6;
    die.roll(turn);
    
    assertEquals(6, die.getLastRoll());
    
		
	}
	
	@Test
	public void testRoll_3() {

	values = new int[]{1,2,3,4,5,6};
	die = new Die(values);
    turn = 9;
    die.roll(turn);
    
    assertEquals(3, die.getLastRoll());
    
		
	}

	@Test
	public void testRoll_4() {

	values = new int[]{1,2,3,4,5,6};
	die = new Die(values);
    turn = 22;
    die.roll(turn);
    
    assertEquals(4, die.getLastRoll());
    
		
	}


	@ Test(expected=RuntimeException.class)
	public void testRoll_5() {
		values = new int[] {1,2,3,4,5,6};
		die = new Die(values);
		turn = 0;
		die.roll(turn);
		assertEquals(0,die.getLastRoll());
}

}
