package com.chat.gpt.api.integration.response.dto;

import java.util.List;

public class ChatGPTResponse {
	public String id;
	public String object;
	public int created;
	public List<Choice> choices;
	public Usage usage;

	public ChatGPTResponse() {
		this.id = "";
		this.object = "";
		this.created = 0;
		this.choices = null;
		this.usage = new Usage();
	}

	public ChatGPTResponse(String id, String object, int created, List<Choice> choices, Usage usage) {
		this.id = id;
		this.object = object;
		this.created = created;
		this.choices = choices;
		this.usage = usage;
	}

	public String getId() {
		return id;
	}

	public String getObject() {
		return object;
	}

	public int getCreated() {
		return created;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public Usage getUsage() {
		return usage;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public void setCreated(int created) {
		this.created = created;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}
}
