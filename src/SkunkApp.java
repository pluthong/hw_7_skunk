import java.util.ArrayList;

public class SkunkApp {

	private ArrayList<Player> players;
	
    public SkunkApp() {
    	this.players = new ArrayList<>();
    }
    
    // method returns true if player added to game
 	// otherwise false 
 	public boolean addPlayer(Player p)
 	{
 		// if player is already registered
 		if(this.players.contains(p))
 			return false;
 		// otherwise add player to game 
 		this.players.add(p);
 		return true;
 	}
 	
 	
    // method returns true if player successfully removed
  	// false otherwise 
	public boolean removePlayer(Player p)
	{
		// if player is not in the game
		if(!(this.players.contains(p)))
			return false;
		// otherwise remove player from the game
		this.players.remove(p);
		return true;
	}
	
	
		// get Name
		public int getNumberOfPlayer() {
			return this.players.size();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
