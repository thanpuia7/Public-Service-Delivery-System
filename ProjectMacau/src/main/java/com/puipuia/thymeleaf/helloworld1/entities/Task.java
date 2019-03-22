package com.puipuia.thymeleaf.helloworld1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;





@Entity
public class Task {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@NotEmpty
	@Column(name="date")
	private String date;
	
	@NotEmpty(message="Name field should not be empty")
	@Column(name="startTime")
	private String startTime;
	
	@NotEmpty(message="Name field should not be empty")
	@Column(name="stopTime")
	private String stopTime;
	
	@NotEmpty(message="Name field should not be empty")
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="USER_EMAIL")
	private User user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStopTime() {
		return stopTime;
	}
	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Task(String date, String startTime, String stopTime, String description, User user) {
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.description = description;
		this.user = user;
	}
	public Task(String date, String startTime, String stopTime, String description) {
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.description = description;
	}
	public Task() {
	}
	
	

}
