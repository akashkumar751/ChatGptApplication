package com.chat.gpt.api.integration.response.dto;

public class Usage {

	public int prompt_tokens;
	public int completion_tokens;
	public int total_tokens;

	public Usage() {
		this.prompt_tokens = 0;
		this.completion_tokens = 0;
		this.total_tokens = 0;
	}

	public Usage(int promptTokens, int completionTokens) {
		this.prompt_tokens = promptTokens;
		this.completion_tokens = completionTokens;
		this.total_tokens = promptTokens + completionTokens;
	}

	public int getPromptTokens() {
		return prompt_tokens;
	}

	public int getCompletionTokens() {
		return completion_tokens;
	}

	public int getTotalTokens() {
		return total_tokens;
	}

	public void setPromptTokens(int promptTokens) {
		this.prompt_tokens = promptTokens;
		this.total_tokens = promptTokens + this.completion_tokens;
	}

	public void setCompletionTokens(int completionTokens) {
		this.completion_tokens = completionTokens;
		this.total_tokens = this.prompt_tokens + completionTokens;
	}

}
