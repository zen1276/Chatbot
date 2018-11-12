package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Chatbot
{
	ArrayList<String> responseList = new ArrayList();
	ArrayList<String> spookyList = new ArrayList();
	private String joke;
	private String currentUser;
	private String content;
	private String getContent;
	private String contentChecker;
	private String chatbotString;
	
	
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
		responseList.add("Hello! Ayy gurl, wassup.");
		responseList.add("Peace out, I'll catch you on the flipside.");
		responseList.add("Quit ignoring me.");
		responseList.add("Are you a boy or a girl?");
		responseList.add("What do you think created the universe?");
		responseList.add("I don't think so.");
		responseList.add("Do you want to be my friend?");
		responseList.add("Well you are a robot, so it doesn't matter what you say, because everything you say is put into a list, then randomly selected to be outputted.");
		responseList.add("Why do you keep talking about random things?");
		responseList.add("Why do you keep talking about random things?");
		responseList.add("Why do you keep talking about random things?");
		responseList.add("Why do you keep talking about random things?");
		responseList.add("Why do you keep talking about random things?");
		responseList.add("Why do you keep talking about random things?");
		responseList.add("Why do you keep talking about random things?");
		responseList.add("Why do you keep talking about random things?");
		
		
		spookyList.add("Halloween");
		spookyList.add("Trick or Treat all up in this bizzness.");
		spookyList.add("Childhood obesity.");
		spookyList.add("The teen suicide rates are rising at an alarmingly rate.");
		spookyList.add("The polar bears are dying. The ice caps are melting.");
		spookyList.add("Many children will be dressing up as Fortnite characters for Halloween.");
		spookyList.add("When filming the \"heroic\" scene in a dog's purpose, they forced the scared dog into the raging water.");
		spookyList.add("There are actually people in the world who believe the Earth is flat.");
		spookyList.add("Some people don't get their children vaccined out of fear of it being harmful to the child.");
	}
	
	public boolean spookyChecker(String input)
	{
		boolean isSpooky = false;
		
		if (input.contains("Halloween"))
		{
			isSpooky = true;
		}
		
		for (String phrase: spookyList)
		{
			if (input.contains(phrase))
			{
				isSpooky = true;
			}
		}
			
		return isSpooky;
	}
	
	public String processText(String userText)
	{
		String answer = "";
		
		answer += "You said: " + userText;
		if (contentChecker(userText))
		{
			answer = "";
			answer += "Chatbot says: You said the special words.\n";
		}
		else if(answer == null)
		{
			answer += "Chatbot says: It appears we have received a null you dimwit...";
		}
		else
		{
			int randomIndex = (int) (Math.random() * responseList.size());
			answer += "Chatbot says: " + responseList.get(randomIndex);
		}
		
		return answer;
	}
	
	
	
	private String currentUser()
	{
		
		return null;
	}
	
	private String jokeList()
	{
		String response = JOptionPane.showInputDialog(null, "ligma");
		response = JOptionPane.showInputDialog(null, "The polar bears are dying. The ice caps are melting");
		response = JOptionPane.showInputDialog(null, "your face");
		response = JOptionPane.showInputDialog(null, "                ");
		response = JOptionPane.showInputDialog(null, "The fitness gram pacer test is a multi-staged aerobic exercise.");
		response = JOptionPane.showInputDialog(null, "Your MOMMMM");
	
		return null;
	}
	
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		if (input == null)
		{
			isValid = false;
		}
		else if (input.length() <2)
		{
			isValid = false;
		}
		else if (input.contains("dfg") || input.contains("kl;") || input.contains("cvb"))
		{
			isValid = false;
		}
		
		return isValid;
	}
	
	public boolean contentChecker(String text)
	{
		boolean hasContent = false;
		
		if(text == null)
		{
			hasContent = false;
		}
		else if(text.equals(content))
		{
			hasContent = true;
		}
		else if(text.contains(" "+content+" "))
		{
			hasContent = true;
		}
		else if(text.contains(" "+content))
		{
			hasContent = true;
		}
		else if(text.contains(content+" "))
		{
			hasContent = true;
		}
		else
		{
			hasContent = false;
		}
		
		return hasContent;
	}
	
	
	//---------------------getters
	
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	
//	public ArrayList<String> getNeutralSentiments()
//	{
//		return neutralSentiments;
//	}
	
	
	//----------end getters
	
	//-------------------------setters
	
	public void setResponseList(ArrayList<String> responses)
	{
		this.responseList = responses;
	}
	
	public void setSpookyList(ArrayList<String> spookyStuff)
	{
		this.spookyList = spookyStuff;
	}
	
	public void setContent(String contentStuff)
	{
		this.content = contentStuff;
	}
	
	public void setCurrentUser(String currentUserDude)
	{
		this.currentUser = currentUserDude;
	}
	
	//------------end setters
	public String toString()
	{
		
		return null;
	}
}
