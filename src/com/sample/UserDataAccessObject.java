package com.sample;

import java.util.List;
import javax.sql.DataSource;

public interface UserDataAccessObject {

	public void setDataSource(DataSource ds);
	
	public void create(String name, String telephone);
	
	public User getUser(Integer id);
	
	public List<User> listUsers();
	
	public void delete(Integer id);
	
	public void update(Integer id, String telephone);
	
}
