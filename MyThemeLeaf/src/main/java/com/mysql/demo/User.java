package com.mysql.demo;

public class User {

	private String content;
	private String type;
	public User(String content, String type) {
		this.content = content;
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [content=" + content + ", type=" + type + "]";
	}
	
	
}
