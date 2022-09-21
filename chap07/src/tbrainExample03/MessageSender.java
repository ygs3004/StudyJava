package tbrainExample03;

public abstract class MessageSender {
	
	String title;
	String senderName;
	
	MessageSender(String title, String senderName){
		this.title=title;
		this.senderName=senderName;
	}
	
	abstract void sendMessage(String recipient);
	
}