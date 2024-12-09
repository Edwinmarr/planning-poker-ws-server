package co.com.edwinmarrugo.planningpoker.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Card {
    private User user;
    private float value;
}
