package com.libmgtapp;

public class Main {

	public static void main(String[] args) {
		Library library=new Library("Sheshadri Iyer Memorial Hall", "Cubbon park, banglore");
		Book book1=new Book(1, "thinking in java", 450, 10);
		Book book2=new Book(12, "rich dad poor dad", 150, 1);
		//
		library.addBook(book1);	
		library.addBook(book2);	
	
		
		library.printLibDetails();
		
		library.printBooksDetails();
		
		
		library.procurementBook(12, 100);
		
		System.out.println("-------------");
		
		library.printBooksDetails();
		
		
	}
}
