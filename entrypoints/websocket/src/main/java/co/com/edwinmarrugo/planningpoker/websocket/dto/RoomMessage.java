package co.com.edwinmarrugo.planningpoker.websocket.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomMessage {
    private String message;
    private String sender;
    private MessageType type;
}
