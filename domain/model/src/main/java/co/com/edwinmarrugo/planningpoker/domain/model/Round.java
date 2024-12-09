package co.com.edwinmarrugo.planningpoker.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Round {
    private List<Card> cards;
    private float result;
    private List<Integer> votesPerCard;
}
