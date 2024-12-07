package co.com.edwinmarrugo.planningpoker.websocket.controller;

import co.com.edwinmarrugo.planningpoker.websocket.dto.RoomMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class RoomController {

    @MessageMapping("/room.sendMessage")
    @SendTo("/topic/public")
    public RoomMessage sendMessage(@Payload RoomMessage roomMessage) {
        return roomMessage;
    }

    @MessageMapping("/room.addParticipant")
    @SendTo("/topic/public")
    public RoomMessage addParticipant(
            @Payload RoomMessage roomMessage,
            SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", roomMessage.getSender());
        return roomMessage;
    }

}
