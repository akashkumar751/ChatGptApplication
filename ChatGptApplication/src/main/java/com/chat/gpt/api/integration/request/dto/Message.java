package com.chat.gpt.api.integration.request.dto;

public class Message {

	private String role;
	private String content;

	public Message() {
		super();
	}

	public Message(String role, String content) {
		super();
		this.role = role;
		this.content = content;
	}

	public String getRole() {
		return role;
	}

	public String getContent() {
		return content;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
