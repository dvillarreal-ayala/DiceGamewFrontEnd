/**
 * Created by Damian Villarreal-Ayala @ Menlo School AP CS2 on Feb 8, 2023.
 *
 * Contributors: Elijah Chandler & Ozymandias, King of Cats.
 */

import java.util.Scanner;
// Create methods within DieTester
public class Game
{
    // Instance Variables 
    //Use die for both players
    private Die Die1;
    private Die Die2;


    //Constructor
    public Game()
    {
        Die1 = new Die();
        Die2 = new Die();
    }
    //method used to calculate and print winner of game.
    public static String printWinner(int sum1, int sum2)
    {
        // Prints the winner based off of the sum of both players.
        if (sum1 > sum2)
        {
            return "You won by " + (sum1 - sum2) + " points! Good game!";
        }
        else if (sum1 < sum2)
        {
            return "The computer won by " + (sum2 - sum1) + " points! Good game!";
        }
        return "It's a tie! Good game!";
    }
    //Print Intro and rules.
    public static void printIntro()
    {
        System.out.println("The goal of each round is to get the target number, and each time you get the target number you get one point.");
    }

    public static void main(String[] args)
    {
        Game.printIntro();
    }
}