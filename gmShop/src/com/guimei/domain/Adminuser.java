package com.guimei.domain;

/**
 * Adminuser entity. @author MyEclipse Persistence Tools
 */

public class Adminuser implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public Adminuser() {
	}

	/** full constructor */
	public Adminuser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}