import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SkunkAppTest {
	
	private SkunkApp app;
	private Player p1;
	private Player p2;

	@Before
	public void create_sample_player() {
		app = new SkunkApp();
		p2 = new Player("Eric");
		p1 = new Player("Paul");
	}
	
	@Test
	public void test_add_player_in_skunk() {
		app.addPlayer(p1);
		app.addPlayer(p2);
		assertEquals("2 players added", 2, app.getNumberOfPlayer());
	}
	
	@Test
	public void test_remove_player_in_skunk() {
		app.addPlayer(p1);
		app.removePlayer(p1);
		assertEquals("1 player removed", 0, app.getNumberOfPlayer());
	}

}
