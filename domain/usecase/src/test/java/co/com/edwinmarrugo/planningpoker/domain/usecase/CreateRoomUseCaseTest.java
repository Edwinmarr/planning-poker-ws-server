package co.com.edwinmarrugo.planningpoker.domain.usecase;

import co.com.edwinmarrugo.planningpoker.domain.model.GameRoom;
import co.com.edwinmarrugo.planningpoker.domain.usecase.ports.GameRoomSessionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CreateRoomUseCaseTest {
    @InjectMocks
    private CreateRoomUseCase createRoomUseCase;
    @Mock
    private GameRoomSessionRepository gameRoomSessionRepository;

    @Test
    void itShouldCreateAGameRoomCorrectly() {
        //GIVEN
        GameRoom gameRoom = TestDataFactory.createGameRoom();
        given(gameRoomSessionRepository.createGameRoom(gameRoom)).willReturn(Optional.of(gameRoom));
        //WHEN
        GameRoom createdRoom = createRoomUseCase.execute(gameRoom);
        //THEN
        assertNotNull(createdRoom);
        assertEquals(gameRoom.getId(),createdRoom.getId());
        assertEquals(gameRoom.getName(),createdRoom.getName());
        assertEquals(gameRoom.getRound().getCards().getFirst().getUser().getId(),createdRoom.getRound().getCards().getFirst().getUser().getId());
        assertEquals(gameRoom.getVotingSystem(),createdRoom.getVotingSystem());
    }
}