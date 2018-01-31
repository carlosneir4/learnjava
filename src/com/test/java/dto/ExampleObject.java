package com.test.java.dto;

import java.util.Date;

public class ExampleObject {

	private long id;
	private String name;
	private Integer edad;
	private Date Birthday;
	private String type;
	
	public ExampleObject(long id, String name, String type, int edad) {
		this.id=id;
		this.name=name;
		this.edad=edad;
		this.type=type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "[ Name : "+this.name+", edad : "+this.edad+", Birthday: "+this.Birthday+", Id:"
				+this.id+" ]";
	}
	
	

}
