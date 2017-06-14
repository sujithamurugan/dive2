package dao;

import dao.RoleDAO;

public class TestRoleDAO {
	public static void main(String[]args)
	{
	
RoleDAO role = new RoleDAO();
		
		System.out.println(role.findAll());
		
		System.out.println(role.findTotalRole());
	
		
	    role.delete(25);
}

}



