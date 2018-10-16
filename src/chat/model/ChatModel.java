package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ChatModel
{
	ArrayList<String> responseList = new ArrayList();
	ArrayList<String> spookyList = new ArrayList();
	private String joke;
	private String currentUser;
	private String content;
	
	
	
	public Chatbot()
	{
		this.joke = "Ligma";
		this.currentUser = new String("default user -- which is boring");
		this.content = new String("empty, but not null");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	
	private void buildTheLists()
	{
		responseList.add("Ayy gurl, wassup.");
		responseList.add("Peace out, I'll catch you on the flipside.");
		responseList.add("Quit ignoring me.");
		responseList.add("Are you a boy or a girl?");
		responseList.add("What do you think created the universe?");
		responseList.add("I don't think so.");
		responseList.add("Do you want to be my friend?");
		responseList.add("Well you are a robot, so it doesn't matter what you say, because everything you say is put into a list, then randomly selected to be outputted.");
		responseList.add("Why do you keep talking about random things?");
		
	}
	
	private String currentUser()
	{
		
	}
	
	private String jokeList()
	{
		String response = JOptionPane.showInputDialog(null, "ligma");
		response = JOptionPane.showInputDialog(null, "The polar bears are dying. The ice caps are melting");
		response = JOptionPane.showInputDialog(null, "your face");
		response = JOptionPane.showInputDialog(null, "                ");
		response = JOptionPane.showInputDialog(null, "The fitness gram pacer test is a multi-staged aerobic exercise.");
		response = JOptionPane.showInputDialog(null, "Your MOMMMM");
		
		
		
	}
	
	//setters
	
	//getters
	
	
	public String toString()
	{
		
	}
}
