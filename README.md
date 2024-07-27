# ChatBotSpringBootOpenaiApi
# Chatbot Spring Boot avec OpenAI API


## Description
Ce projet est un chatbot développé en utilisant Spring Boot et l'API OpenAI. Il permet aux utilisateurs d'interagir avec un chatbot intelligent capable de comprendre et de répondre à des questions sur une variété de sujets. L'application utilise le modèle de langage GPT-3.5-turbo d'OpenAI pour générer des réponses pertinentes et contextuelles.

## Fonctionnalités
- Intégration avec l'API OpenAI pour générer des réponses.
- Gestion des requêtes et des réponses via des contrôleurs Spring Boot.
- Modèles de données pour structurer les messages et les réponses.
- Gestion des erreurs pour les requêtes excessives à l'API OpenAI.

## Structure du Projet
Le projet est organisé comme suit :

# Controller
MainController : Gère les requêtes HTTP entrantes et interagit avec le service pour traiter les demandes du chatbot.

# Models
- ChatCompletionRequest : Représente la structure de la requête envoyée à l'API OpenAI pour générer des réponses.
- ChatCompletionResponse : Représente la structure de la réponse reçue de l'API OpenAI.
- ChatMessage : Encapsule les messages de chat individuels échangés entre l'utilisateur et le chatbot.
- ChatbotSpringApplication : Le point d'entrée principal de l'application Spring Boot.

## Installation

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/votre-utilisateur/ChatBotSpringBootOpenaiApi.git
   cd ChatBotSpringBootOpenaiApi

2. Configurer la clé API OpenAI :
    Ouvrez application.properties situé dans src/main/resources.
    Ajoutez votre clé API OpenAI :
    * openai.api.key=your_openai_api_key

## Utilisation 
    1. URL : POST http://localhost:8080/chatbot
    2. request JSON : 
     {
       "prompt":"Question"
     }

