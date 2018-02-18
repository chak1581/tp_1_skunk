
import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest {

	//Die die = new Die();
	@Test
	public void testGetLastRoll() {
		Die die = new Die(new int[] {1,2,3});
		die.roll();
		assertEquals(1, die.getLastRoll());
		
	}

	@Test
	public void testSetLastRoll() {
		Die die = new Die(new int[] {6});
	    die.roll();
		assertEquals(6, die.getLastRoll());
		}
	

	//@Test(expected=NullPointerException.class)
	public void test_nullDie() {
		Die die = new Die(new int[] {6});
		assertEquals(6, die.getLastRoll());
	}
	
	@Test
	public void testRoll_one_value() {
	Die die = new Die(new int[] {6});
    die.roll();
    assertEquals(6, die.getLastRoll());
    
		
	}

}
