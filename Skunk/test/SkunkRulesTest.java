import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SkunkRulesTest {
	
	
	
	
	@Test
	public void testResetFlags(){
		
		SkunkRules skunkRules = new SkunkRules();
		Player player[] = new Player[3];
		player[0] = new Player("abc", 55, 40);
		player[1] = new Player("def", 50, 38);
		player[2] = new Player("abc", 46, 40);
		
		skunkRules.resetFlags(player, 3);
		
		assertEquals(0,player[0].getScore());
		assertEquals(0,player[1].getScore());
		assertEquals(0,player[2].getScore());	
	}
	
	
	@Test
	public void testPlayerRanks(){
		
		SkunkRules skunkRules = new SkunkRules();
		
		Player player[] = new Player[3];
		player[0] = new Player("abc", 55, 40);
		player[1] = new Player("abc", 50, 40);
		player[2] = new Player("def", 50, 38);
		
		skunkRules.setPlayersRank(player, 3);
		
		assertEquals(0,player[0].getRank());
		assertEquals(1,player[1].getRank());
		assertEquals(2,player[2].getRank());
		
	}
	

	@Test
	public void TestAllPlayersScoreZeroFalse(){
		
		SkunkRules skunkRules = new SkunkRules();
		Player player[] = new Player[3];
		player[0] = new Player("abc", 55, 40);
		player[1] = new Player("def", 50, 38);
		player[2] = new Player("abc", 46, 40);
		
		
		boolean value = skunkRules.allPlayersScoreZero(player,3);
		assertEquals(false,value);
		
	}
	
	@Test
	public void TestAllPlayersScoreZeroTrue(){
		
		SkunkRules skunkRules = new SkunkRules();
		Player player[] = new Player[3];
		player[0] = new Player("abc", 0, 40);
		player[1] = new Player("def", 0, 38);
		player[2] = new Player("abc", 0, 40);
		
		
		boolean value = skunkRules.allPlayersScoreZero(player,3);
		assertEquals(true,value);
		
	}
}
