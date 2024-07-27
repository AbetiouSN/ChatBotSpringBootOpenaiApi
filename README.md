# ChatBotSpringBootOpenaiApi

## Description
This project is a chatbot developed using Spring Boot and the OpenAI API. It allows users to interact with an intelligent chatbot capable of understanding and responding to questions on a variety of topics. The application uses OpenAI's GPT-3.5-turbo language model to generate relevant and contextual responses.

## Features
- Integration with the OpenAI API to generate responses.
- Management of requests and responses via Spring Boot controllers.
- Data models to structure messages and responses.
- Error handling for excessive requests to the OpenAI API.

## Project Structure
The project is organized as follows:

### Controller
- `MainController`: Handles incoming HTTP requests and interacts with the service to process chatbot requests.

### Models
- `ChatCompletionRequest`: Represents the structure of the request sent to the OpenAI API to generate responses.
- `ChatCompletionResponse`: Represents the structure of the response received from the OpenAI API.
- `ChatMessage`: Encapsulates individual chat messages exchanged between the user and the chatbot.
- `ChatbotSpringApplication`: The main entry point of the Spring Boot application.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ChatBotSpringBootOpenaiApi.git
   cd ChatBotSpringBootOpenaiApi
2. Configure the OpenAI API key:
   Open application.properties located in src/main/resources. Add your OpenAI API key:
   openai.api.key=your_openai_api_key
## Usage
   - URL: POST http://localhost:8080/chatbot
   - Request JSON:
    {
       "prompt": "Question"
    }
