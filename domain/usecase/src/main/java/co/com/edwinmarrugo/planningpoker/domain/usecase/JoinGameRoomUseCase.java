package co.com.edwinmarrugo.planningpoker.domain.usecase;

import co.com.edwinmarrugo.planningpoker.domain.usecase.ports.GameRoomSessionRepository;
import co.com.edwinmarrugo.planningpoker.domain.usecase.ports.WebSocket;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JoinGameRoomUseCase {
    private final GameRoomSessionRepository gameRoomSessionRepository;
    private final WebSocket webSocket;

    public void execute(String sessionId, String playerId, String playerName) {

    }
}
