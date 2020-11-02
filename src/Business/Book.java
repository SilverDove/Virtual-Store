package Business;

import java.util.UUID;
import java.util.Vector;


public class Book extends Product{
	private Vector <String> author = new Vector<String>(10,2);
	private Language language;
	private int page;
	
	public Book(String name, double price, UUID identifier, int stock, String image,Vector <String> author, Language language, int page){//Constructor
		this.name = name;
		this.price = price;
		this.identifier = identifier;
		this.stock = stock;
		this.image = image;
		
		for (int i=0 ;i<author.size(); i++) {
			this.author.add(author.get(i));
		}
		
		this.language = language;
		this.page = page;
	}
	
	public int getPage(){//returns book's page
		return page;
	}
	
	public Vector<String> getAuthor() {//returns book's authors as a Vector
		return author;
	}
	
	public Language getLanguage() {//returns book's language
		return language;
	}
	
	public String AuthorToString() {//returns book's authors as a String
		StringBuilder sb = new StringBuilder();//create our string
		
		for (int i=0; i<(author.size()-1); i++) {//add each element of the list into our string
			sb.append(author.get(i) + ",");
		}
		sb.append(author.get(author.size()-1));//add the last element of the list
			
		return sb.toString();//returns the string we build
	}

	public String toString() {//returns book's information as a String
		return "ID: "+identifier+"\n Book's name: "+name +"\n Price: "+ price +"€\n Author(s): "+ AuthorToString() +"\n Language: "+ language +"\n Stock available: "+ stock;
	}
}
