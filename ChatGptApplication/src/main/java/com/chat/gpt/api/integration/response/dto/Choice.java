package com.chat.gpt.api.integration.response.dto;

import com.chat.gpt.api.integration.request.dto.Message;

public class Choice {

	private int index;
	private Message message;
	private String finishReason;

	public Choice() {

	}

	public Choice(int index, Message message, String finishReason) {
		super();
		this.index = index;
		this.message = message;
		this.finishReason = finishReason;
	}

	public int getIndex() {
		return index;
	}

	public Message getMessage() {
		return message;
	}

	public String getFinishReason() {
		return finishReason;
	}

	public void setFinishReason(String finishReason) {
		this.finishReason = finishReason;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

}