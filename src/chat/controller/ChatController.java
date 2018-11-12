package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Chatbot;

public class ChatController
{
	
	public void start()
	{
		String userText = "...";
		while (!userText.equalsIgnoreCase("quit"))
		{
			userText = interactWithChatbot(userText);
		}
		
		
	}
	
	Chatbot simplebot = new Chatbot();
	
	private Chatbot simpleBot;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
	}
	
	public String interactWithChatbot(String text)
	{
		String userSays = JOptionPane.showInputDialog(null, "Wassup bro, whacha wanna talk about?");
		userSays = simpleBot.processText(userSays);
		return userSays;
	}
	

	
	public String useChatbotCheckers(String text)
	{
		
		return null;
	}

	public Object getChatbot()
	{
		return null;
	}
}
