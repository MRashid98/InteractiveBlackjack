package com.qa.interactiveblackjack;
import java.util.Random;

public class Deck {

	private int[] deck = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

	public int drawCard() {
		int rnd = new Random().nextInt(deck.length);
		return deck[rnd];
	}
}
