
public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;
	private char gender;

	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int newQty) {
		qty = newQty;
	}

	public String getAuthorName() {
		return author.getName();
	}
	
	public String getAuthorEmail() {
		return author.getEmail();
	}
	
	public char getGender() {
		return gender;
	}
	
	public char getAuthorGender() {
		return author.getGender();
	}

	public String toString() {
		return "Book[name=" + name + ",Author=" + author + ",price=" + price + ",qty=" + qty + "]";
	}

}
