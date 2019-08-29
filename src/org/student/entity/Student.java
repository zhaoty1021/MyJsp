package org.student.entity;

public class Student {
	private String username;
	private String pwd;
	private String name;
	private int id;
	private int age;
	private String address;
	public Student(int id,String username,String pwd) {
		this.id=id;
		this.username=username;
		this.pwd=pwd;
		this.name="null";
		this.age=0;
		this.address="null";	
	}
	public Student(String username, String pwd, String name, int id, int age, String address) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
	}
	public Student() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
