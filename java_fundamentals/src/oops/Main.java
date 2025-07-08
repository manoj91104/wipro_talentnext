package oops;
import java.util.*;
public class Main {

	    public static void main(String[] args) {
	        Authour author = new Authour("J.K. Rowling", "jkrowling@example.com", 'F');

	        Book book = new Book("Harry Potter", author, 499.99, 150);

	        System.out.println(book.toString());
	    }
	}



