package Business;

public enum GameGenre {
	
	ARCADE("Arcade"), ADVENTURE("Adventure"), ROLE("Role"), MULTIPLAYER("Multiplayer"), EDUCATIONAL("Educational"), STRATEGY("Strategy"), ACTION("Action"), SPORTS("Sports");
	
	private String gameGenre;
	
	GameGenre(String name){//Constructor
		gameGenre = name;
	}
	
	public String toString() {//returns the Game's genre information
		return gameGenre;
	}
	
	public String getGameGenre() {//returns the Game's genre as a String
		return gameGenre;
	}
	
	public GameGenre GetGameGenreFromString(String s) {//returns the Game's genre according to a string
		for (GameGenre g : GameGenre.values()) {//Get contents of Genre.values()
			if (s.toUpperCase().compareTo(g.getGameGenre().toUpperCase()) == 0) {//If the two genres are the same
				return g;
			}
		}
		return null;
	}
	
}
