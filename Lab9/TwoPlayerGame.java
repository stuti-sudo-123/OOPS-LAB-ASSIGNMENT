import java.util.Random;
import java.util.Scanner;

class Player extends Thread {
    int userInput;
    int randomNumber;
    String playerName;

    Player(String name, int input) {
        this.playerName = name;
        this.userInput = input;
    }

    public void run() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100); 
        System.out.println(playerName + " generated number: " + randomNumber);
    }
}

public class TwoPlayerGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for Player 1: ");
        int p1Input = sc.nextInt();

        System.out.print("Enter number for Player 2: ");
        int p2Input = sc.nextInt();

        Player p1 = new Player("Player 1", p1Input);
        Player p2 = new Player("Player 2", p2Input);

        p1.start();
        p2.start();

        try {

            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (p1.randomNumber > p2.randomNumber) {
            int points = p1.randomNumber - p2.randomNumber;
            System.out.println("Player 1 wins! Points: " + points);
        } 
        else if (p2.randomNumber > p1.randomNumber) {
            int points = p2.randomNumber - p1.randomNumber;
            System.out.println("Player 2 wins! Points: " + points);
        } 
        else {
            System.out.println("It's a tie!");
        }
        sc.close();
    }
}