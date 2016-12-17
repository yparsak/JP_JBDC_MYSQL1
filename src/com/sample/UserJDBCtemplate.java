package com.sample;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserJDBCtemplate implements UserDataAccessObject {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	    this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
	}

	public void create(String name, String telephone) {
		String SQL = "insert into User (name, telephone) values (?, ?)";	      
	      jdbcTemplateObject.update( SQL, name, telephone);
	      System.out.println("Created Record Name = " + name + " telephone = " + telephone);
	      return;
	}

	public User getUser(Integer id) {
		String SQL = "select * from User where id = ?";
	      User user = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new UserMapper());
	      return user;
	}

	public List<User> listUsers() {
		String SQL = "select * from User";
	    List <User> users = jdbcTemplateObject.query(SQL, new UserMapper());
	      return users;
	}


	public void delete(Integer id) {
		String SQL = "delete from User where id = ?";
	    jdbcTemplateObject.update(SQL, id);
	    System.out.println("Deleted Record with ID = " + id );
	    return;
	}

	public void update(Integer id, String telephone) {
		String SQL = "update User set telephone = ? where id = ?";
	    jdbcTemplateObject.update(SQL, telephone, id);
	    System.out.println("Updated Record with ID = " + id );
	    return;		
	}
}
