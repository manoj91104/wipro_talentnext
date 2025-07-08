package oops;
import java.util.*;
public class Book {

	    private String name;
	    private Authour author; // Author is a class
	    private double price;
	    private int qtyInStock;

	  
	    public Book(String name, Authour author, double price, int qtyInStock) {
	        this.name = name;
	        this.author = author;
	        this.price = price;
	        this.qtyInStock = qtyInStock;
	    }

	 
	    public String getName() {
	        return name;
	    }

	    public Authour getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQtyInStock() {
	        return qtyInStock;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAuthor(Authour author) {
	        this.author = author;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public void setQtyInStock(int qtyInStock) {
	        this.qtyInStock = qtyInStock;
	    }
	    public String toString() {
	        return "Book Name: " + name +
	               "\nPrice: " + price +
	               "\nQuantity in Stock: " + qtyInStock +
	               "\nAuthor Details:\n" + author.toString();
	    }
	}



