package com.qa.interactiveblackjack;

import java.util.ArrayList;
import java.util.List;

public class Member {

	protected List<Integer> cards = new ArrayList<>();
	protected String playerDesc = "Generic test";

	public Member() {

	}

	public void displayCards() {
		System.out.println(playerDesc + "'s cards:");
		for (int i : cards) {
			System.out.println(i);
		}
	}

	public void drawCard() {
		Deck deck = new Deck();
		cards.add(deck.drawCard());
	}

	public int calculateSum() {
		int sum = 0;

		for (int i : cards) {
			sum += i;
		}

		return sum;
	}

}
