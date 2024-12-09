package co.com.edwinmarrugo.planningpoker.domain.usecase.ports;

import co.com.edwinmarrugo.planningpoker.domain.model.GameRoom;

import java.util.Optional;

public interface GameRoomSessionRepository {
    Optional<GameRoom> createGameRoom(GameRoom gameRoom);
    Optional<GameRoom> findGameRoom(String id);
    void deleteGameRoom(String id);

}
