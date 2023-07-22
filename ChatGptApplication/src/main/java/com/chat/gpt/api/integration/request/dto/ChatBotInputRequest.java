package com.chat.gpt.api.integration.request.dto;

public class ChatBotInputRequest {
	private String message;

	public ChatBotInputRequest() {
	}

	public ChatBotInputRequest(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
