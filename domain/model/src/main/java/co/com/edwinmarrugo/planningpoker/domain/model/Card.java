package co.com.edwinmarrugo.planningpoker.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Card {
    private User user;
    private float value;
}
