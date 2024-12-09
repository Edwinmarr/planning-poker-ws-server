package co.com.edwinmarrugo.planningpoker.domain.usecase;

import co.com.edwinmarrugo.planningpoker.domain.usecase.ports.GameRoomSessionRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JoinGameRoomUseCase {
    private final GameRoomSessionRepository gameRoomSessionRepository;

    public void execute(String sessionId, String playerId, String playerName) {

    }
}
