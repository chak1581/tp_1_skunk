import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {

	//Dice dice = new Dice();

	@Test
	public void testGetLastRoll() {
		// fail("Not yet implemented");
		Die die = new Die(new int[] {1,2,3});
		die.roll();
		die.roll();
		assertEquals(2, die.getLastRoll());
	}

	@Test
	public void testRoll() {
		// fail("Not yet implemented");
		Die die = new Die(new int[] {1,2,3});
		die.roll();
		assertEquals(1, die.getLastRoll());

	}

}
