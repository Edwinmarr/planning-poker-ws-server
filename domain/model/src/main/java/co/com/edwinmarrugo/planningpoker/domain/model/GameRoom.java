package co.com.edwinmarrugo.planningpoker.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class GameRoom {
    private String id;
    private String name;
    private Round round;
    private VotingSystem votingSystem;

}
