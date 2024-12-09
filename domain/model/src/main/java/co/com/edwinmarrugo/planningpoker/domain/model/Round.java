package co.com.edwinmarrugo.planningpoker.domain.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Round {
    private List<Card> cards;
    private float result;
    private List<Integer> votesPerCard;
}
