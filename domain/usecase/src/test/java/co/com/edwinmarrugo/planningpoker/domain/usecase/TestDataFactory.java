package co.com.edwinmarrugo.planningpoker.domain.usecase;

import co.com.edwinmarrugo.planningpoker.domain.model.Card;
import co.com.edwinmarrugo.planningpoker.domain.model.GameRoom;
import co.com.edwinmarrugo.planningpoker.domain.model.Round;
import co.com.edwinmarrugo.planningpoker.domain.model.User;
import co.com.edwinmarrugo.planningpoker.domain.model.enums.UserRole;
import co.com.edwinmarrugo.planningpoker.domain.model.enums.UserType;
import co.com.edwinmarrugo.planningpoker.domain.model.votingsystem.Fibonacci;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class TestDataFactory {
    public static GameRoom createGameRoom() {
        return GameRoom.builder()
                .id(UUID.randomUUID().toString())
                .name("Planning Poker Game")
                .round(createRound())
                .votingSystem(new Fibonacci()) // Supongamos que tienes esta enumeración
                .build();
    }

    public static Round createRound() {
        return Round.builder()
                .cards(createCards())
                .result(8.0f)
                .votesPerCard(Arrays.asList(1, 2, 3)) // Ejemplo de distribución de votos
                .build();
    }

    public static List<Card> createCards() {
        return Collections.singletonList(
                Card.builder()
                        .user(createUser("user1", "Alice", UserRole.ADMIN, UserType.PLAYER))
                        .value(5.0f)
                        .build()
        );
    }

    public static User createUser(String id, String name, UserRole role, UserType type) {
        return User.builder()
                .id(id)
                .name(name)
                .userRole(role)
                .userType(type)
                .build();
    }
}
