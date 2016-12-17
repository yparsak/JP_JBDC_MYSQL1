package com.sample;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sample.UserJDBCtemplate;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		UserJDBCtemplate userJDBCTemplate = (UserJDBCtemplate) context.getBean("UserJDBCtemplate");

		System.out.println("------Records Creation--------" );
		
		userJDBCTemplate.create("Adam","123-1234567");
		userJDBCTemplate.create("Sam" ,"555-5555555");
		
		System.out.println("------User Listing--------" );
		List<User> users = userJDBCTemplate.listUsers();
	    for (User record : users) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Telephone : " + record.getTelephone());
	    }
	      
	    System.out.println("------Updating--------" );
	    userJDBCTemplate.update(1,"444-444 4444");
	    
	    User user = userJDBCTemplate.getUser(1);
	    
	    System.out.println("ID "+user.getId());
	    System.out.println("Name "+user.getName());
	    System.out.println("Telephone "+user.getTelephone());

	}

}
