package mx.com.htpj9;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Card {

    public static enum Face{Ace, Deuce, Tgree, Four, Five, Six, Seven, Eigth, Nine, Ten, Jack, Queen, King};
    public static enum Suit{Clubs, Diamonds, Hears, Spades};
    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "face=" + face +
                ", suit=" + suit +
                '}';
    }

}
