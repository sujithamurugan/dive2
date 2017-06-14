package dao;

import dao.BookInventoryDAO;

public class TestBookInventoryDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BookInventoryDAO books = new BookInventoryDAO();
		
		System.out.println(books.findAll());
		
		System.out.println(books.findTotalBookInventory());
		
		
		
		
		
		
	    books.delete(25);
	}
	

	}


