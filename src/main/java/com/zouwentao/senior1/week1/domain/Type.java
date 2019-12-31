package com.zouwentao.senior1.week1.domain;

public class Type {
	private Integer id;
	private String name;
	
	public Type() {
		super();
	}
	public Type(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
		return "Brand [id=" + id + ", name=" + name + "]";
	}
}
