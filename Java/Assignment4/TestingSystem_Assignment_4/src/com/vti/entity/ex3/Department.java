package com.vti.entity.ex3;

public class Department {
	private int	id;
	private String	name;
	
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public void setName (String name) {
		this.name = name;
	}
}
