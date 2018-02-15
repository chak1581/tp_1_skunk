import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {

	Dice dice = new Dice();
	Die die1 = new Die();
	Die die2 = new Die();

	@Test
	public void testGetLastRoll() {
		// fail("Not yet implemented");
		die1.roll(2);
		die2.roll(3);
		assertEquals(6, die1.getLastRoll());
		assertEquals(2, die2.getLastRoll());
	}

	@Test
	public void testRoll() {
		// fail("Not yet implemented");
		die1.roll(2);
		die2.roll(3);

		assertEquals(6, die1.getLastRoll());
		assertEquals(2, die2.getLastRoll());
		assertEquals(8, die1.getLastRoll() + die2.getLastRoll());

	}

}
