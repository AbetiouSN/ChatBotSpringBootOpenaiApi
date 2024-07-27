package com.test.chatbotspring.Controller;

import com.test.chatbotspring.Models.ChatCompletionRequest;
import com.test.chatbotspring.Models.ChatCompletionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@RestController

public class MainController {

    @Autowired
    RestTemplate restTemplate;


    @PostMapping("/chatbot")
    public String getOpenaiResponse(@RequestBody String prompt) {
        try {
            ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest("gpt-3.5-turbo", prompt);
            ChatCompletionResponse response = restTemplate.postForObject(
                    "https://api.openai.com/v1/chat/completions",
                    chatCompletionRequest,
                    ChatCompletionResponse.class
            );
            return response.getChoices().get(0).getMessage().getContent();
        } catch (HttpClientErrorException.TooManyRequests e) {
            // Log the error and return an appropriate message to the user
            System.err.println("Error: Too many requests - " + e.getMessage());
            return "Désolé, le quota de requêtes a été dépassé. Veuillez réessayer plus tard.";
        }


    }
}
