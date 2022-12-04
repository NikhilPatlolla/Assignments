package com.nikhil.main;

import java.util.*;

class Guesser {
	int guessNumMinLim;
	int guessNumMaxLim;
	int guessNo;

	int guessNum() {
		boolean valid = true;
		while (valid) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Guesser kindly give the min and max limit");
			System.out.println("min limit: ");
			guessNumMinLim = scan.nextInt();
			System.out.println("max limit");
			guessNumMaxLim = scan.nextInt();
			if (guessNumMaxLim >= guessNumMinLim) {
				valid = false;

				// randomly selects the no, between your lower and the upper limit
				guessNo = (int) (Math.random() * (guessNumMaxLim - guessNumMinLim + 1) + guessNumMinLim);
				System.out.println(guessNo);
				return guessNo;

			} else {
				System.out.println("Please make use the max limit is more than min");
			}
		}
		return guessNo;
	}

}

class Player {
	int guessNum;
	String playername;

	int guessNum() {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your name");
		playername = scan.nextLine();
		System.out.println(playername + ", kindly guess the number");
		guessNum = scan.nextInt();

		return guessNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	Player p1, p2, p3;
	// static Guesser g;

	static int gameCount;
	static int wonCount;

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}

	void collectNumFromPlayers() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();

	}

	void compare() {
		// String p1name, p2name, p3name;
		// p1name = "";
		if (gameCount == 0)
			gameCount++;
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All players won the game");
				wonCount++;
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println(p1.playername + " & " + p2.playername + " won");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println(p1.playername + "  & " + p3.playername + " won");
			} else {
				System.out.println(p1.playername + " won the game");
			}
			System.out.println("play again y or n");

			// playAgain();

		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println(p2.playername + " & " + p3.playername + "won");
			} else {
				System.out.println(p2.playername + " won the game");
			}

			System.out.println("play again y or n");
			// playAgain();

		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println(p3.playername + " won the game");

			System.out.println("play again y or n");
			// playAgain();
		} else {
			System.out.println("Game lost, try again y or n");

			// playAgain();
		}
	}

	static void playAgain(Umpire u) {

		boolean playing = true;
		while (playing) {
			Scanner scan = new Scanner(System.in);
			if (scan.nextLine().equals("y")) {
				gameCount++;
				// Umpire u=new Umpire();
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.compare();

			} else {
				playing = false;
				String gameTimes = (gameCount == 1) ? "time" : "times";
				String wonTimes = (wonCount == 1) ? "time" : "times";
				System.out.println("you have played the game for " + gameCount + " " + gameTimes + " and all won "
						+ wonCount + " " + wonTimes);
				System.out.println("Thank you for playing the game for " + gameCount + " " + gameTimes);
			}
		}
	}

}

public class LaunchGame {

	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		Umpire.playAgain(u);
	}

}
