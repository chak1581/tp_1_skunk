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
	public void testPlay() {
	
		player = new Player("AAA", 1, 50);
		game = new Game(350, 400, 1);
		Turn turn = new Turn();

		turn.play(player, game, 1);
		assertEquals(11,turn.getScore());
		assertEquals(50,player.getChip());
		assertEquals(350,game.getChipsInKitty());
		
	}
	
	
	@Test
	public void testPlayOneSkunk() {
	
		player = new Player("AAA", 0, 50);
		game = new Game(200, 400, 1);
		Turn turn = new Turn();

		turn.play(player, game, 3);
		assertEquals(0,player.getScore());
		assertEquals(49,player.getChip());
		assertEquals(201,game.getChipsInKitty());
		
	}
	
	@Test
	public void testPlayOneSkunkAndDeuce() {
	
		player = new Player("AAA", 0, 50);
		game = new Game(200, 400, 1);
		Turn turn = new Turn();

		turn.play(player, game, 5);
		assertEquals(0,player.getScore());
		assertEquals(48,player.getChip());
		assertEquals(202,game.getChipsInKitty());
		
	}

	@Test
	public void testPlayDoubleSkunk() {
	
		player = new Player("AAA", 0, 50);
		game = new Game(200, 400, 1);
		Turn turn = new Turn();

		turn.play(player, game, 6);
		assertEquals(0,player.getScore());
		assertEquals(46,player.getChip());
		assertEquals(204,game.getChipsInKitty());
		
	}

}
