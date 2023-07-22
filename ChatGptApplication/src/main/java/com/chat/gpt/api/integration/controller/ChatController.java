package com.chat.gpt.api.integration.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chat.gpt.api.integration.request.dto.ChatBotInputRequest;
import com.chat.gpt.api.integration.response.dto.ChatGPTResponse;
import com.chat.gpt.api.integration.service.ChatGPTService;
import com.chat.gpt.api.integration.service.imp.ChatGPTServiceImp;

@RestController
//@ResponseBody
//@RequestMapping("/chat")
public class ChatController {

	private ChatGPTService chatGPTService;

	public ChatController(ChatGPTServiceImp chatGPTService) {
		this.chatGPTService = chatGPTService;
	}

	@PostMapping("/chat")
	public ResponseEntity<ChatGPTResponse> processInputRequest(@RequestBody ChatBotInputRequest chatbotInputRequest) {
		ChatGPTResponse chatCPTResponse = chatGPTService.getChatCPTResponse(chatbotInputRequest.getMessage());
		return new ResponseEntity<>(chatCPTResponse, HttpStatus.OK);
	}

}
