package model;

import java.util.logging.Logger;

public class Book {
	private static final Logger LOGGER = Logger.getLogger(Book.class.getName() );

	int isbn;
	String author;
	String content;
	Float price;
	String title;
	String publishdate;
	String Status;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", content=" + content + ", price=" + price + ", title="
				+ title + ", publishdate=" + publishdate + ", Status=" + Status + ", getIsbn()=" + getIsbn()
				+ ", getAuthor()=" + getAuthor() + ", getContent()=" + getContent() + ", getPrice()=" + getPrice()
				+ ", getTitle()=" + getTitle() + ", getPublishdate()=" + getPublishdate() + ", getStatus()="
				+ getStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
