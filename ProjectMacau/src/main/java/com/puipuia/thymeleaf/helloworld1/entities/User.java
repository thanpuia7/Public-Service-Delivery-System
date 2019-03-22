package com.puipuia.thymeleaf.helloworld1.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



 

@Entity
public class User {
	
	@Id
	@Email
	@NotEmpty(message="Name field should not be empty")
	@Column(name="email")
	private String email;
	
	@NotEmpty(message="Name field should not be empty")
	@Column(name="name")
	private String name;
	
	@Size(min=2,max=20,message="Length should be in between 2 to 10")
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private List<Task> tasks  ;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "USER_ROLES", joinColumns={
			@JoinColumn(name = "USER_EMAIL", referencedColumnName = "email") }, inverseJoinColumns = {
					@JoinColumn(name = "ROLE_NAME", referencedColumnName = "name") })
	
	private List<Role> roles;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Task> getTask() {
		return tasks;
	}
	public void setTask(List<Task> tasks) {
		this.tasks = tasks;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
	public User(String email, String name, String password) {
		
		this.email = email;
		this.name = name;
		this.password = password;
	}
	
	public User(){
		
	}
	
	
	
}
