package model;

import model.BookSales;

public class TestBookSales {
public static void main(String[]args)
{
	BookSales cc= new BookSales();
	
	cc.setSalesid(1);
	cc.setUserid(1);
	cc.setBookid(1);
	cc.setQuantity(2);
	cc.setTotalamount(450);
	cc.setOrderdate("14 june 2017");
	cc.setStatus("booked");


}
}
