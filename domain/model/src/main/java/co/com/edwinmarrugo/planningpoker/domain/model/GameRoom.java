package co.com.edwinmarrugo.planningpoker.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GameRoom {
    private String id;
    private String name;
    private Round round;
    private VotingSystem votingSystem;

}
