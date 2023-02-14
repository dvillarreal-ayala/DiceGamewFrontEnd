/**
 * Created by Damian Villarreal-Ayala @ Menlo School AP CS2 on Feb 8, 2023.
 *
 * Contributors: Elijah Chandler & Ozymandias, King of Cats.
 */

import javax.swing.*;
import java.awt.*;

import java.util.Scanner;
// Create methods within DieTester
public class Game
{
    // Instance Variables 
    //Use die for both players
    private Player player1;
    private Player player2;
    private GameViewer gameViewer;
    private boolean gameWon;

    //Constructor
    public Game(String name1, String name2)
    {
        player1 = new Player(name1, 1);
        player2 = new Player(name2, 2);
        gameViewer = new GameViewer(this);
        gameWon = false;
    }

    public Player getPlayer1()
    {
        return player1;
    }
    public Player getPlayer2()
    {
        return player2;
    }
    public boolean getGameWon()
    {
        return gameWon;
    }
    //method used to calculate and print winner of game.
    public String printWinner(int sum1, int sum2)
    {
        // Prints the winner based off of the sum of both players.
        if (sum1 > sum2)
        {
            return player1.getName() + " won by " + (sum1 - sum2) + " points! Good game!";
        }
        else if (sum1 < sum2)
        {
            return player2.getName() + " won by " + (sum2 - sum1) + " points! Good game!";
        }
        return "It's a tie! Good game!";
    }
    //Print Intro and rules.
    public static void printIntro()
    {
        System.out.println("The goal of each round is to get higher than the opponents roll. After 5 rounds, the points"
        + " tallied up and the winner is printed.");
        System.out.println("The player also has the option to reroll one per round.");
    }

    private void run()
    {
        Scanner scanner = new Scanner(System.in);
        //Repaints screen every round.
        gameViewer.repaint();
        for(int i = 0; i < 5; i++)
        {
            gameViewer.repaint();
            //insert round code
            int play1roll = player1.roll();
            System.out.println(player1.getName() + " rolled " + play1roll + "!");
            gameViewer.repaint();
            System.out.print("Would you like to roll again?(y)(n): ");
            String response = scanner.nextLine();
            if(response.equals("y") == true)
            {
                play1roll = player1.roll();
                System.out.println(player1.getName() + " rolled " + play1roll + "!");
                gameViewer.repaint();
            }
            player1.updateSum(play1roll);
            int play2roll = player2.roll();
            System.out.println(player2.getName() + " rolled " + play2roll + "!");
            gameViewer.repaint();
            System.out.print("Would you like to roll again?(y)(n): ");
            response = scanner.nextLine();
            if(response.equals("y") == true)
            {
                play2roll = player2.roll();
                System.out.println(player2.getName() + " rolled " + play2roll + "!");
                gameViewer.repaint();
            }
            player2.updateSum(play2roll);
            System.out.println();
        }
        gameWon = true;
        gameViewer.repaint();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's player1's name? ");
        String name1 = scanner.nextLine();
        System.out.println("What's player2's name? ");
        String name2 = scanner.nextLine();
        Game.printIntro();
        Game game = new Game(name1, name2);
        game.run();
        System.out.println(game.printWinner(game.player1.getSum(), game.player2.getSum()));
    }
}