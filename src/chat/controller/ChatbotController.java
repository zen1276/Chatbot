package chat.controller;

import javax.swing.JOptionPane;

import chat.model.ChatModel;

public class ChatbotController
{
	
	public void start()
	{
		String userText = "...";
		while (!userText.equalsIgnoreCase("quit"))
		{
			userText = JOptionPane.showInputDialog(null, "Type \"quit\" to exit.");
		}
	}
	
	ChatModel simplebot = new ChatModel();
	
	//getters
	public String getSimpleBot
	{
		return simpleBot;
	}
	
	
	
	//setters
	
	private Chatbot simpleBot;
	
	public ChatbotController()
	{
		simpleBot = new Chatbot();
	}
	
	public String interactWithChatbot(String text)
	{
		
	}
	
	public String useChatbotCheckers(String text)
	{
		
	}
}
