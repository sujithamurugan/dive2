package dao;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import model.Role;
import util.ConnectionUtil;

public class RoleDAO {
	private static final Logger LOGGER = Logger.getLogger( RoleDAO.class.getName() );


	private JdbcTemplate jdbcTemplate= ConnectionUtil.getJdbcTemplate();
	
	
	public List<Role> findAll(){

		String sql = "SELECT * FROM ROLE";

		List<Role> role  = jdbcTemplate.query(sql,
				new BeanPropertyRowMapper(Role.class));

		return role;
	}
	
	public int findTotalRole(){

		String sql = "SELECT COUNT(*) FROM ROLE";

		int total = jdbcTemplate.queryForInt(sql);

		return total;
	}
	
	public void saveOrUpdate(Role role) {
	    if (role.getId() < 0) {
	        // update
	        String sql = "UPDATE ROLE SET name=? "
	                    + " WHERE userid=?";
	        jdbcTemplate.update(sql, role.getName(), role.getId());
	    } else {
	        // insert
	        String sql = "INSERT INTO ROLE (userid,name)"
	                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	        jdbcTemplate.update(sql, role.getId(), role.getName());
	    }
	 
	}
	
	public void delete(int userid) {
	    String sql = "DELETE FROM ROLE WHERE userid=?";
	    jdbcTemplate.update(sql, userid);
	    
	    LOGGER.info("Successfully deleted");
	}
	


}
