package com.chat.gpt.api.integration.service;

import com.chat.gpt.api.integration.response.dto.ChatGPTResponse;

public interface ChatGPTService {

	public ChatGPTResponse getChatCPTResponse(String prompt);
}
