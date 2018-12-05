package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{

	private ChatController app;
	private ChatPanel appPanel;
	
	public ChatFrame(ChatController app)
	{
		super();
		this.app = app;
		this.appPanel = new ChatPanel(app);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 600);
		this.setTitle("Chatbot 2.0");
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
