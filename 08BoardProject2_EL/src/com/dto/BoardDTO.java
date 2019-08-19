package com.dto;

public class BoardDTO {
	
	private int num;
	private String title;
	private String author;
	private String content;
	private String writeday;
	private int readCnt; // 
	
	public BoardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public String getWriteday() {
		return writeday;
	}
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
	public int getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}
	public BoardDTO(int num, String title, String author, String content, String writeday, int readCnt) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.content = content;
		this.writeday = writeday;
		this.readCnt = readCnt;
	}
	@Override
	public String toString() {
		return "BoardDTO [num=" + num + ", title=" + title + ", author=" + author + ", content=" + content
				+ ", writeday=" + writeday + ", readCnt=" + readCnt + "]";
	}
	
	

}
