package com.sample;

public class User {

	private Integer id;
	private String name;
	private String tel;
	
	public void setTelephone(String tel) {
		this.tel= tel;
	}
	
	public String getTelephone() {
		return tel;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
