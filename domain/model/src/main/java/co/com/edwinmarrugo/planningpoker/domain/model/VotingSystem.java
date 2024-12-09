package co.com.edwinmarrugo.planningpoker.domain.model;

import java.util.List;

public interface VotingSystem {
    boolean isValidCard(String cardValue);

    List<String> getAllowedCards();
}
