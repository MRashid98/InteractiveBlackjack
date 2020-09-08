package com.qa.interactiveblackjack;

public class Game {

	private int playerTot = 0;
	private int dealerTot = 0;
	private int winStatus = 0;

	public void startGame() {
		distributeCards();
		printWinner(winStatus);
	}

	private void distributeCards() {
		Player player = new Player();
		Dealer dealer = new Dealer();

		player.drawCard();
		player.displayCards();
		playerTot = player.calculateSum();
		System.out.println("Total: " + playerTot);

		if (playerTot == 21) {
			winStatus = 1;
		} else if (playerTot > 21) {
			winStatus = 2;
		} else {

			while (dealerTot < playerTot) {
				dealer.drawCard();
				dealerTot = dealer.calculateSum();

			}
			dealer.displayCards();
			System.out.println("Total: " + dealerTot);
			checkWinner();
		}

	}

	private void checkWinner() {
		if (playerTot <= 21 && dealerTot > 21) {
			winStatus = 1;
		} else {
			int highest = Math.max(playerTot, dealerTot);

			if (highest == dealerTot && highest == playerTot) {
				winStatus = 3;
			} else if (highest == dealerTot) {
				winStatus = 2;
			} else if (highest == playerTot) {
				winStatus = 1;
			}
		}
	}

	private void printWinner(int winStat) {
		switch (winStat) {

		// If the player wins
		case 1:
			System.out.println("Player wins");
			break;
		// If the dealer wins
		case 2:
			System.out.println("Dealer wins");
			break;
		case 3:
			System.out.println("Draw");
		}
	}
}
