package models;

public class Message {

	private int type;
	private String json;


	public Message() {
	
	}

	public void setType(int messageType) {
		type = messageType;
	}

	public int getType() {
		return type;
	}
	



	public String getJson() {
		return json;
	}
	



	public void setJson(String json) {
		this.json = json;
	}

	
	
	
}
