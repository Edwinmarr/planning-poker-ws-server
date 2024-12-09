package co.com.edwinmarrugo.planningpoker.domain.model.votingsystem;

import co.com.edwinmarrugo.planningpoker.domain.model.VotingSystem;

import java.util.List;

public class Fibonacci implements VotingSystem {
    private static final List<String> ALLOWED_CARDS = List.of("0", "1", "2", "3", "5", "8", "13", "21","34","55","89","?","☕");

    @Override
    public boolean isValidCard(String cardValue) {
        return ALLOWED_CARDS.contains(cardValue);
    }

    @Override
    public List<String> getAllowedCards() {
        return ALLOWED_CARDS;
    }
}
