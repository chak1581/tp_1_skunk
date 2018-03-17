import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
	Game game;
	int chipsInKitty;
	int totalChips;
	int numberOfPlayer;

	@Test
	public void testGame() {
		// Game(ChipsInKitty, TotalChips, NumberOfPlayers)
		game = new Game(50, 20, 2);
		assertEquals(50, game.getChipsInKitty());
		assertEquals(20, game.getTotalChips());
		assertEquals(2, game.getNumberOfPlayers());
	}

}
