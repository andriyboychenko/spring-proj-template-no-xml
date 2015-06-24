package org.andriy.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "I18NMESSAGE")
public class I18NMessage {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "message_code")
	private String messageCode; 
	@Column(name = "message_RU")
	private String messageRU;
	@Column(name = "message_PT")
	private String messagePT;
	@Column(name = "message_EN")
	private String messageEN;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public String getMessageRU() {
		return messageRU;
	}
	public void setMessageRU(String messageRU) {
		this.messageRU = messageRU;
	}
	public String getMessagePT() {
		return messagePT;
	}
	public void setMessagePT(String messagePT) {
		this.messagePT = messagePT;
	}
	public String getMessageEN() {
		return messageEN;
	}
	public void setMessageEN(String messageEN) {
		this.messageEN = messageEN;
	}
	
}
