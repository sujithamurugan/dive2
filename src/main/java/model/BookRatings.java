package model;

import java.util.logging.Logger;

public class BookRatings {
	private static final Logger LOGGER = Logger.getLogger( BookRatings.class.getName() );

	int userid;
	int bookid;
	int rating;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "BookRatings [userid=" + userid + ", bookid=" + bookid + ", rating=" + rating + ", getUserid()="
				+ getUserid() + ", getBookid()=" + getBookid() + ", getRating()=" + getRating() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
