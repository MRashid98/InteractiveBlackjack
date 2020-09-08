package com.qa.interactiveblackjack;

public class Dealer extends Member {

	public Dealer() {
		this.playerDesc = "Dealer";
	}
	

	@Override
	public void drawCard() {
		Deck deck = new Deck();
		cards.add(deck.drawCard());
		calculateSum();
	}
}
