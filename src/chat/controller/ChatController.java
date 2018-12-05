package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Chatbot;
import chat.view.ChatFrame;

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
		String output = "";
		output += simpleBot.processText(text);
		return output;
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
