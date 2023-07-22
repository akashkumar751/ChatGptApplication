package com.chat.gpt.api.integration.request.dto;

import java.util.List;

public class ChatGPTRequest {

	private String model;
	private List<Message> messages;
	private Integer max_tokens;

	public ChatGPTRequest() {
		super();
	}

	public ChatGPTRequest(String model, List<Message> messages, Integer max_tokens) {
		super();
		this.model = model;
		this.messages = messages;
		this.max_tokens = max_tokens;
	}

	public String getModel() {
		return model;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public Integer getMax_tokens() {
		return max_tokens;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public void setMax_tokens(Integer max_tokens) {
		this.max_tokens = max_tokens;
	}

}
