package com.libmgtapp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Sheshadri Iyer Memorial Hall
public class Library {
	private String libraryName;
	private String address;
	private Set<Book> books;

	public void addBook(Book book) {
		books.add(book);
	}

	public void issueBook(int bookId) {
		// think about how to do it
	}

	public void procurementBook(int id, int noOfCopies) {
		// think about how to do it
		/*
		 * logic : first look for that book ...if book is found then we add the
		 * noOfCopies to existing values otherwise if book is not found then add new
		 * entry to the lib
		 */
		Book bookToFound = null;
		boolean isFound = false;

		for (Book tempBook : books) {
			if (tempBook.getId()==id) {
				bookToFound = tempBook;
				isFound = true;
				break;
			}
		}
		if (isFound) {
			bookToFound.setNoOfCopies(bookToFound.getNoOfCopies()+noOfCopies);
			books.add(bookToFound);
		} else {
			Scanner scanner= new Scanner(System.in);
			
			//books.add(book);
		}
	}

	public Library(String libraryName, String address) {
		this.libraryName = libraryName;
		this.address = address;
		this.books = new HashSet<Book>();
	}

	public void printLibDetails() {
		System.out.println("-------------------");
		System.out.println("libraryName: " + libraryName);
		System.out.println("library address: " + address);
		System.out.println("library total books: " + books.size());
		System.out.println("-------------------");
	}

	public void printBooksDetails() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("books in lib");
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}

}
