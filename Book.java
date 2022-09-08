package labactivity;

import java.util.*;
import java.util.stream.Collectors;

public class Book {


	String id;
	String name;
	String author;
	String category;
	float price;

	//Parameterized constructor used as a setter
	public Book(String id,String name,String author, String category,float price)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.category=category;
		this.price=price;
	}

	//To display the cont3nt
	void display()
	{
		System.out.println("The book id "+id +" having name "+name+" and wrote by "+author+ " is of category "+category+ " and of price "+price);
	}

	public static void main(String[] args) {
		Book A =new Book("B007", "JAVA", "ABC", "science", 200);
		Book B =new Book("B24","PYTHON", "PQR", "fiction", 180);
		Book C =new Book("B19", "WEB-PROGRAMING", "XYZ", "technology", 230);
		A.display();
		B.display();
		C.display();

		ArrayList<Book> mylist=new ArrayList<Book>();
		mylist.add(A);                            //add a new Book object into the collection
		mylist.add(B);								
		mylist.add(C);								

		//searching a book based on title and if found display the details
		List<String>searchByTitle =mylist.stream().map(p -> p.name).collect(Collectors.toList());
		System.out.println(searchByTitle);


		List<String>searchByAuthor =mylist.stream().map(p1 -> p1.author).collect(Collectors.toList());
		System.out.println(searchByAuthor);


	}

}