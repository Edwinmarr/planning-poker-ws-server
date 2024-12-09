package co.com.edwinmarrugo.planningpoker.domain.usecase.ports;

import co.com.edwinmarrugo.planningpoker.domain.model.GameRoom;

public interface WebSocket {
    void connect(GameRoom gameRoom);
}
