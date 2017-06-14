package dao;


import model.Book;
import util.ConnectionUtil;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
public class BookDAO {
	private static final Logger LOGGER = Logger.getLogger( BookDAO.class.getName() );

	private JdbcTemplate jdbcTemplate= ConnectionUtil.getJdbcTemplate();
	
	
	public List<Book> findAll(){

		String sql = "SELECT * FROM BOOK";

		List<Book> book  = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper(Book.class));

		return book ;
	}
	
	public int findTotalBook(){

		String sql = "SELECT COUNT(*) FROM BOOK";

		int total = jdbcTemplate.queryForInt(sql);

		return total;
	}
	
	public void saveOrUpdate(Book book) {
	    if (book.getIsbn() < 0) {
	        // update
	        String sql = "UPDATE BOOK SET author=?, content=?, title=?, "
	                    + " WHERE isbn=?";
	        jdbcTemplate.update(sql, book.getAuthor(), book.getContent(),
	                book.getTitle(),book.getIsbn());
	    } else {
	        // insert
	        String sql = "INSERT INTO BOOK (isbn,author,content,price,title,publishdate,status)"
	                    + " VALUES (?, ?, ?, ?, ?, ?, ? )";
	        jdbcTemplate.update(sql, book.getIsbn(), book.getAuthor(),book.getContent(),
	        		book.getPrice(),book.getTitle(),book.getPublishdate(),
	                book.getStatus());
	    }
	 
	}
	
	public void delete(int isbn) {
	    String sql = "DELETE FROM BOOK WHERE isbn=?";
	    jdbcTemplate.update(sql, isbn);
	    
	    LOGGER.info("Successfully deleted");
	}
	



}
