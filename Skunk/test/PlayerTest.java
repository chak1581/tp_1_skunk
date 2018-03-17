import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {
	Player player;
	String name;
	int score;
	int chip;

	@Test
	public void testPlayer() {
		// Player(name, score, chip)
		player = new Player("Evan", 10, 5);
		assertEquals("Evan", player.getName());
		assertEquals(10, player.getScore());
		assertEquals(5, player.getChip());
	}

}
