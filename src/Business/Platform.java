package Business;

public enum Platform {
	NINTENDO("Nintendo"), PC("PC"), PLAYSTATION("Playstation"), XBOX("Xbox");
	
	private String platformName;
	
	Platform(String name){//Constructor
		platformName = name;
	}
	
	public String toString() {//returns Platform's information
		return platformName;
	}
	
	public String getPlatformName() {//returns Platform's name as a String
		return platformName;
	}
	
	public Platform GetPlatformFromString(String s) {//returns Platform according to a String
		for (Platform p : Platform.values()) {//Get contents of Genre.values()
			if (s.toUpperCase().compareTo(p.getPlatformName().toUpperCase()) == 0) {//if two platforms are the same
				return p;
			}
		}
		return null;
	}
}
