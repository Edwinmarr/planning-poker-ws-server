package co.com.edwinmarrugo.planningpoker.entrypoints.rest.controllers;

import co.com.edwinmarrugo.planningpoker.domain.model.GameRoom;
import co.com.edwinmarrugo.planningpoker.domain.usecase.CreateRoomUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rooms")
@RequiredArgsConstructor
public class GameRoomController {

    private final CreateRoomUseCase createRoomUseCase;

    @PostMapping("/create")
    public GameRoom createRoom(@RequestBody GameRoom gameRoom) {
        return createRoomUseCase.execute(gameRoom);
    }
}
