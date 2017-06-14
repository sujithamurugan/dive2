package dao;

import dao.UserDAO;

public class TestUserDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO user = new UserDAO();
		
		System.out.println(user.findAll());
		
		System.out.println(user.findTotalUser());
		
		
	    user.delete(25);
	}

	}


