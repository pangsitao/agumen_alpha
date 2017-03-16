package com.agumen.alpha.domain;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8010758539661348653L;
	private int user_id;
	private String user_name;
	private String password;
	private String nick_name;
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return user_id;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.user_id = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return user_name;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.user_name = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nick_name;
	}
	public void setNickName(String nick_name) {
		this.nick_name = nick_name;
	}

}