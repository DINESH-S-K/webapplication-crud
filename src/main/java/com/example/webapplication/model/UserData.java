package com.example.webapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserData{
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + "]";
	}
	 
	
}
