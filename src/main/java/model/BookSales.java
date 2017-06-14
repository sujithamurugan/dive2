package model;

import java.util.logging.Logger;

public class BookSales {
	private static final Logger LOGGER = Logger.getLogger( BookSales.class.getName() );

	int salesid;
	int userid;
	int bookid;
	int quantity;
	float totalamount;
	String orderdate;
	String status;
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
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
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BookSales [salesid=" + salesid + ", userid=" + userid + ", bookid=" + bookid + ", quantity=" + quantity
				+ ", totalamount=" + totalamount + ", orderdate=" + orderdate + ", status=" + status + ", getSalesid()="
				+ getSalesid() + ", getUserid()=" + getUserid() + ", getBookid()=" + getBookid() + ", getQuantity()="
				+ getQuantity() + ", getTotalamount()=" + getTotalamount() + ", getOrderdate()=" + getOrderdate()
				+ ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
