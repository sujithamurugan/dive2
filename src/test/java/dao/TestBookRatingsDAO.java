package dao;

import dao.BookRatingsDAO;

public class TestBookRatingsDAO {
public static void main(String[]args)
{
	BookRatingsDAO books = new BookRatingsDAO();
	
	System.out.println(books.findAll());
	
	System.out.println(books.findTotalBookRatings());
	
	  
	    books.delete(25);
	
	
   




}
}
