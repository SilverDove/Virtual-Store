package Business;

import java.util.UUID;

public abstract class Product {
	
	protected String name;
	protected double price;
	protected int stock;
	protected UUID identifier;
	protected String image;
	
	public String getName() {//returns product's name
		return name;
	}
	
	public double getPrice() {//returns product's price
		return price;
	}
	
	public int getStock() {//returns product's stock
		return stock;
	}
	
	public String getImage() {//returns product's image link
		return image;
	}
	
	public UUID getIdentifier() {//returns product's ID
		return identifier;
	}
	
	public String toString() {//returns product's information
		return "ID: "+identifier +"\n Product's name: "+ name +"\n Price: "+ price +"\n Available stock: "+ stock;
	}
	
	public void updateStock(int newStock) {//update the stock of the product
		this.stock = newStock;
	}

}
