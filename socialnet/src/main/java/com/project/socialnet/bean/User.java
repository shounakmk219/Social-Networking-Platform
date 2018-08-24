package com.project.socialnet.bean;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {
	@Id
	private String uid;
	private String firstName;
	private String lastName;
	private String password;
	private Date dob;
	//private String ProPic;
	
	public String getFirstName() {
		return firstName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uid, String firstName, String lastName, String password, Date dOB) {
		super();
		this.uid = uid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dob = dOB;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDOB() {
		return dob;
	}
	public void setDOB(Date dOB) {
		this.dob = dOB;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid=uid;
	}
	
	@Override
    public String toString() {
        return String.format(
                "User[Uid=%s, FirstName='%s', LastName='%s', Password='%s', DOB='%s']",
                uid, firstName, lastName,password,dob);
    }	

}
