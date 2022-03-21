package practice.company;

public class BookMain {
	public static void main(String gg[])
	{
	BookCollection bc=new BookCollection("Pallavi Vedpathak");
	Book b=new Book(55, "The secret", "Rhonda Byrne");
	System.out.println("Book already exist :"+bc.hasBook(b));
	bc.toString();
	System.out.println("\n");
	
	bc.sort1();
	System.out.println("\n");
	bc.sort2();
	}
}
