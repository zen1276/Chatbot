package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Chatbot;

public class ChatController
{
	private Chatbot simpleBot;
	private ChatFrame appFrame;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}
	
	public void start()
	{

	}
	
	Chatbot simplebot = new Chatbot();
	
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
