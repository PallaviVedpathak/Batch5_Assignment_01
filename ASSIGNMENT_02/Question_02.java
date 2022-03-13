package com.company;

	class Book{
		private String bookTitle;
		private String Author;
		private String ISBN;
		private int quantity;
		public String getBookTitle() {
			return bookTitle;
		}
		
		public String getAuthor() {
			return Author;
		}
		
		public String getISBN() {
			return ISBN;
		}
		
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public Book(String bookTitle, String auther, String iSBN, int quantity) {
			this.bookTitle = bookTitle;
			this.Author = auther;
			this.ISBN = iSBN;
			this.quantity = quantity;
		}
		public void display() {
			System.out.println("BOOK DETAILS: ");
			System.out.println("BookTitle: " + bookTitle);
			System.out.println("Author: " + Author);
			System.out.println("ISBN: " + ISBN);
			System.out.println("NumOfCopies: " + quantity);

		}
		
	}

public class Question_02 {
		public static void main(String[] args) {
			Book Book=new Book("The Magic of Thinking Big","David J.Schwartz","AEF65",5);
			Book.display();
		}

	}

