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
			userText = interactWithChatbot(userText);
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
		String userSays = JOptionPane.showInputDialog(null, "Wassup bro, whacha wanna talk about?");
		userSays = simpleBot.processText(userSays);
		return userSays;
	}
	
	public String processText(String userText)
	{
		String output = "";
		
		output += "You said: " + userText;
		
		return output;
	}
	
	public String useChatbotCheckers(String text)
	{
		
	}
}
