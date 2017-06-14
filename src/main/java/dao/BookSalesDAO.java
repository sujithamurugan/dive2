package dao;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import model.BookSales;
import util.ConnectionUtil;

public class BookSalesDAO {
	private static final Logger LOGGER = Logger.getLogger( BookSalesDAO.class.getName() );


	private JdbcTemplate jdbcTemplate= ConnectionUtil.getJdbcTemplate();
	
	
	public List<BookSales> findAll(){

		String sql = "SELECT * FROM BOOKSALES";

		List<BookSales> books  = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper(BookSales.class));

		return books;
	}
	
	public int findTotalBookSales(){

		String sql = "SELECT COUNT(*) FROM BOOKSALES";

		int total = jdbcTemplate.queryForInt(sql);

		return total;
	}
	
	public void saveOrUpdate(BookSales books) {
	    if (books.getSalesid() < 0) {
	        // update
	        String sql = "UPDATE BOOKSALES SET bookid=?, quantity=?, totalamount=?, "
	                    + " WHERE salesid=?";
	        jdbcTemplate.update(sql, books.getBookid(), books.getQuantity(),
	               books.getTotalamount(),books.getSalesid());
	    } else {
	        // insert
	        String sql = "INSERT INTO BOOKSALES(saleid,bookid,quantity,totalamount,userid,orderdate)"
	                    + " VALUES (?, ?, ?, ?, ?, ?)";
	        jdbcTemplate.update(sql, books.getSalesid(), books.getBookid(),
	                books.getQuantity(),books.getTotalamount(),books.getUserid(),
	                books.getOrderdate());
	    }
	 
	}
	
	public void delete(int salesid) {
	    String sql = "DELETE FROM BOOKSALES WHERE salesid=?";
	    jdbcTemplate.update(sql, salesid);
	    
	   LOGGER.info("Successfully deleted");
	}
	

}
