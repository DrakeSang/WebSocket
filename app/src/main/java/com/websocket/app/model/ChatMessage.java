package com.websocket.app.model;

public class ChatMessage {
    /*Simple DTO for chat messages*/

    private String sender;
    private String content;

    // Constructors
    public ChatMessage() {}

    public ChatMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    // Getters & setters

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}