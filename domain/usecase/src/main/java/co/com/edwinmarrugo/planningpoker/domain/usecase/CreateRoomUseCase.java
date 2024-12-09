package co.com.edwinmarrugo.planningpoker.domain.usecase;

import co.com.edwinmarrugo.planningpoker.domain.model.GameRoom;
import co.com.edwinmarrugo.planningpoker.domain.usecase.ports.GameRoomSessionRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

@RequiredArgsConstructor
public class CreateRoomUseCase {
    private static final Logger log = LogManager.getLogger(CreateRoomUseCase.class);

    private final GameRoomSessionRepository gameRoomSessionRepository;

    public GameRoom execute(GameRoom gameRoom){
        Optional<GameRoom> savedRoom = gameRoomSessionRepository.createGameRoom(gameRoom);
        if (savedRoom.isPresent()){
            return savedRoom.get();
        }else {
            log.info("No se pudo crear la sesion");
            return null;
        }
    }
}
