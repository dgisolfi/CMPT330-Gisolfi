
public class gameFilter {
	private String games;
	private boolean gameSort;
	public void gameType() {
		//default query
		games = "defualt";
		gameSort = false;
	}
	public String getGames() {
		return games;
		
	}
	public void setGames(String n) {
		games = n;
	}
	public boolean getSort() {
		return gameSort;
		
	}
	public void setSort(boolean n) {
		gameSort = n;
	}
}
