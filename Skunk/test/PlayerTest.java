import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testToString() {
		
		Player	player = new Player("Test1", 0, 50);
		assertEquals("Player Name: " + "Test1" + " , Total Score: " + "0" + " , Total Chip: " + "50", player.toString());
		
	}

}
