package com.qa.interactiveblackjack;

import java.util.Scanner;

public class Player extends Member {

	private boolean drawAgain = true;
	
	public Player() {
		this.playerDesc = "Player";
	}

	public Player(String name) {
		this.playerDesc = name;
	}

	@SuppressWarnings("resource")
	@Override
	public void drawCard() {
		Deck deck = new Deck();
		Scanner in = new Scanner(System.in);
		String s;
		
		while (drawAgain == true) {
			cards.add(deck.drawCard());
			displayCards();
			System.out.print("Want to draw another card? y/n: ");
			s = in.next();
			if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes")) {
				drawAgain = true;
			} else if (s.equalsIgnoreCase("n") || s.equalsIgnoreCase("no")) {
				drawAgain = false;
			}
		}
	}
}
