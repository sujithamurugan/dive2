package dao;

import java.util.logging.Logger;

import dao.BookSalesDAO;

public class TestBookSalesDAO {


	public static void main(String[]args)
	{
	
BookSalesDAO books = new BookSalesDAO();
		
		System.out.println(books.findAll());
		
		System.out.println(books.findTotalBookSales());


books.delete(25);
}
}