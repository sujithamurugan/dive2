package model;

import java.util.logging.Logger;

public class BookInventory {
	private static final Logger LOGGER = Logger.getLogger( BookInventory.class.getName() );

	int bookid;
	int quantity;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BookInventory [bookid=" + bookid + ", quantity=" + quantity + ", getBookid()=" + getBookid()
				+ ", getQuantity()=" + getQuantity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
