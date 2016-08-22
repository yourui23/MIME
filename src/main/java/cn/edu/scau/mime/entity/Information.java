package cn.edu.scau.mime.entity;

public class Information {
	private int informationId;
	private String title;
	private String author;
	private String content;
	private int type;
	private long timestamp;
	private boolean state;
	public int getInformationId() {
		return informationId;
	}
	public void setInformationId(int informationId) {
		this.informationId = informationId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Information [informationId=" + informationId + ", title=" + title + ", author=" + author + ", content="
				+ content + ", type=" + type + ", timestamp=" + timestamp + ", state=" + state + "]";
	}
	
	
}
