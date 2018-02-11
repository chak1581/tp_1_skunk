import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest {

	Die die = new Die();
	@Test
	public void testGetLastRoll() {
		
		die.setLastRoll(5);
		assertEquals(5, die.getLastRoll());
		
	}

	@Test
	public void testSetLastRoll() {
		
	    die.setLastRoll(5);
		assertEquals(5, die.getLastRoll());
		}
	

	@Test
	public void testRoll() {

    int playNum = 2;
    die.roll(playNum);
    
    assertEquals(6, die.getLastRoll());
    
		
	}

}
