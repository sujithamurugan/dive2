package dao;


import java.util.List;
import java.util.logging.Logger;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import model.BookRatings;
import util.ConnectionUtil;

public class BookRatingsDAO {
	private static final Logger LOGGER = Logger.getLogger( BookRatingsDAO.class.getName() );

	private JdbcTemplate jdbcTemplate= ConnectionUtil.getJdbcTemplate();
	
	public List<BookRatings> findAll(){

		String sql = "SELECT * FROM BOOKRATINGS";

		List<BookRatings> bookrate  = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper(BookRatings.class));

		return bookrate;
	}
	
	public int findTotalBookRatings(){

		String sql = "SELECT COUNT(*) FROM BOOKRATINGS";

		int total = jdbcTemplate.queryForInt(sql);

		return total;
	}
	
	public void saveOrUpdate(BookRatings bookrate) {
	    if (bookrate.getBookid() < 0) {
	        // update
	        String sql = "UPDATE BOOKRATINGS SET  userid=?,rating=? "
	                    + " WHERE bookid=?";
	        jdbcTemplate.update(sql, bookrate.getUserid(), bookrate.getRating());
	    } else {
	        // insert
	        String sql = "INSERT INTO BOOKRATINGS(bookid,quantity)"
	                    + " VALUES (?, ?)";
	        jdbcTemplate.update(sql, bookrate.getBookid(),bookrate.getUserid(),bookrate.getRating());
	    }
	 
	}
	
	public void delete(int bookid) {
	    String sql = "DELETE FROM BOOKRATINGS WHERE bookid=?";
	    jdbcTemplate.update(sql, bookid);
	    
	    LOGGER.info("Successfully deleted");
	}
}
