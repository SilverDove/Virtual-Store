package Business;

public enum Language {
	
	ENGLISH("English"), FRENCH("French"), GERMAN("German"), SPANISH("Spanish"), CHINESE("Chinese");
	
	private String language;
	
	Language(String l){//Constructor
		language = l;
	}
	
	public String toString() {//returns the Language's information
		return language;
	}
	
	public String getLanguageName() {//returns the Language's name as a String
		return language;
	}
	
	public Language GetLanguageFromString(String s) {//returns the Language according to a String
		for (Language l : Language.values()) {//Get contents of Genre.values()
			if (s.toUpperCase().compareTo(l.getLanguageName().toUpperCase()) == 0) {//If the two language are the same
				return l;
			}
		}
		return null;
	}

}
