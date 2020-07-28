package com.rps.l1;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static int winStreak = 0,loseCount = 0,winCount = 0,tieCount = 0;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Rock");
        Thread.sleep(1000);
        System.out.println("Paper");
        Thread.sleep(1000);
        System.out.println("Scissors!");
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you choose?\nRock?\nPaper?\nScissors?");
        String input = scanner.nextLine();
        Mode mode;
        switch (input.toLowerCase()) {
            case "paper": mode = Mode.PAPER;
                break;
            case "scissors": mode = Mode.SCISSORS;
                break;
            case "rock": mode = Mode.ROCK;
                break;
            default:
                System.out.println("An error has occurred.");
                return;
        }
        Random random = new Random();
        int bot = random.nextInt(3);
        Mode modeBot = null;
        switch (bot) {
            case 0: modeBot = Mode.PAPER;
                break;
            case 1: modeBot = Mode.SCISSORS;
                break;
            case 2: modeBot = Mode.ROCK;
                break;
        }
        int endGame = mode.compare(modeBot);
        if(endGame == 1) {
            System.out.println("You win!");
            winStreak++;
            winCount++;
        }
        else if(endGame == 2) {
            System.out.println("You lose!");
            winStreak = 0;
            loseCount++;
        }
        else {
            System.out.println("Tie!");
            tieCount++;
        }
        reverse();
    }
    public static void reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Your win streak is: %s. You have won %s times and lost %s times. There has been %s ties.\n",winStreak,winCount,loseCount,tieCount);
        System.out.println("Would you like to start again?\nYes\nNo");
        String input = scanner.nextLine();
        if(input.toLowerCase().equals("yes")) {
            start();
        }
    }
}
