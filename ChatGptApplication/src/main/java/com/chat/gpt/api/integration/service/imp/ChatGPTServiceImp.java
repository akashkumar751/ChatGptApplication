package com.chat.gpt.api.integration.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chat.gpt.api.integration.request.dto.ChatGPTRequest;
import com.chat.gpt.api.integration.request.dto.Message;
import com.chat.gpt.api.integration.response.dto.ChatGPTResponse;
import com.chat.gpt.api.integration.service.ChatGPTService;

@Service
public class ChatGPTServiceImp implements ChatGPTService {

	@Value("${openai.api.key}")
	private String apiKey;

	private static final String OPEN_AI_CHAT_ENDPOINT = "https://api.openai.com/v1/chat/completions";

	@Override
	public ChatGPTResponse getChatCPTResponse(String prompt) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + apiKey);

		ChatGPTRequest chatGPTRequest = new ChatGPTRequest();
		chatGPTRequest.setModel("gpt-3.5-turbo"); // Most capable GPT-3.5 model and optimized for chat.
		chatGPTRequest.setMessages(List.of(new Message("user", prompt))); // Input prompt for ChatGPT
		chatGPTRequest.setMax_tokens(1000); // The maximum number of tokens to generate in the chat completion.

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<ChatGPTRequest> request = new HttpEntity<>(chatGPTRequest, headers);

		return restTemplate.postForObject(OPEN_AI_CHAT_ENDPOINT, request, ChatGPTResponse.class);
	}

}
