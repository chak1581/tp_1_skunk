import static org.junit.Assert.*;

import java.util.Arrays;

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
	
	@Test
	public void testSettleChips() {
		game = new Game(10, 0, 3);
		Player player[] = new Player[3];
		player[0] = new Player("abc", 55, 40);
		player[1] = new Player("def", 50, 38);
		player[2] = new Player("abc", 46, 40);
	
		game.settleChips(player, 3);
		
		assertEquals(60,player[0].getChip());
		assertEquals(33,player[1].getChip());
		assertEquals(35,player[2].getChip());
		assertEquals(0,game.getChipsInKitty());
	}
	
	
	@Test
	public void testSettleChipsWhenPlayerScoredZero() {
		game = new Game(10, 0, 3);
		Player player[] = new Player[3];
		player[0] = new Player("abc", 55, 40);
		player[1] = new Player("def", 0, 38);
		player[2] = new Player("abc", 46, 40);
	
		game.settleChips(player, 3);
		
		assertEquals(65,player[0].getChip());
		assertEquals(28,player[1].getChip());
		assertEquals(35,player[2].getChip());
		assertEquals(0,game.getChipsInKitty());
	}

}
