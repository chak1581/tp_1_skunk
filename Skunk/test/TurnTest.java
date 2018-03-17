import static org.junit.Assert.*;

import org.junit.Test;

public class TurnTest {

	Player player;
	Game game;
	Dice dice;
	int turn = 0;
	Die die1;
	Die die2;

	@Test
	public void testPlay_Turn() {
		// score=die1+die2, getchip-0, getchipsinkitty+0
		player = new Player("AAA", 1, 50);
		game = new Game(350, 400, 1);
		Turn turn = new Turn();

		turn.play(player, game, 1);
		assertEquals(11, turn.getScore());
		assertEquals(50, player.getChip());
		assertEquals(350, game.getChipsInKitty());

	}

	@Test
	public void testPlayOneSkunk() {
		// score=0, getchip-1, getchipsinkitty+1
		player = new Player("AAA", 0, 50);
		game = new Game(200, 400, 1);
		Turn turn = new Turn();

		turn.play(player, game, 3);
		assertEquals(0, player.getScore());
		assertEquals(49, player.getChip());
		assertEquals(201, game.getChipsInKitty());

	}

	@Test
	public void testPlayOneSkunkAndDeuce() {
		// score=0, getchip-2, getchipsinkitty+2
		player = new Player("AAA", 0, 50);
		game = new Game(200, 400, 1);
		Turn turn = new Turn();

		turn.play(player, game, 5);
		assertEquals(0, player.getScore());
		assertEquals(48, player.getChip());
		assertEquals(202, game.getChipsInKitty());

	}

	@Test
	public void testPlayDoubleSkunk() {
		// score=0, getchip-4, getchipsinkitty+4
		player = new Player("AAA", 0, 50);
		game = new Game(200, 400, 1);
		Turn turn = new Turn();

		turn.play(player, game, 6);
		assertEquals(0, player.getScore());
		assertEquals(46, player.getChip());
		assertEquals(204, game.getChipsInKitty());

	}

	@Test(expected = RuntimeException.class)
	public void testPlayNoTurn() {
		player = new Player("AAA", 0, 50);
		game = new Game(200, 400, 1);
		Turn turn = new Turn();

		turn.play(player, game, 0);
		assertEquals(0, player.getScore());
		assertEquals(50, player.getChip());
		assertEquals(200, game.getChipsInKitty());

	}
}