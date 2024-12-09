package co.com.edwinmarrugo.planningpoker.persistence;

import co.com.edwinmarrugo.planningpoker.domain.model.GameRoom;
import co.com.edwinmarrugo.planningpoker.domain.usecase.ports.GameRoomSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
public class RedisGameRoomSessionRepository implements GameRoomSessionRepository {
    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public Optional<GameRoom> createGameRoom(GameRoom gameRoom) {
        String key = gameRoom.getId();
        if (Boolean.TRUE.equals(redisTemplate.hasKey(key))) {
            return Optional.empty();
        }
        redisTemplate.opsForValue().set(key, gameRoom);
        return Optional.of(gameRoom);
    }

    @Override
    public Optional<GameRoom> findGameRoom(String id) {
        GameRoom gameRoom = (GameRoom) redisTemplate.opsForValue().get(id);
        return Optional.ofNullable(gameRoom);
    }

    @Override
    public void deleteGameRoom(String id) {
        redisTemplate.delete(id);
    }
}
