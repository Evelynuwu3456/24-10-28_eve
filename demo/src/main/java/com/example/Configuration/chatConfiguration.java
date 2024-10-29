package com.example.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class chatConfiguration implements WebSocketConfigurer {
@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
	registry.addHandler(null,"websocket");
}
 
}
