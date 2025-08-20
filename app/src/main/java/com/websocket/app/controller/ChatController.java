package com.websocket.app.controller;

import com.websocket.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/send") // maps to /app/send
    @SendTo("/topic/messages") // published to subscribers of /topic/messages
    public ChatMessage handleMessage(@Payload ChatMessage message) {
        return message; // broadcast it back
    }
}
