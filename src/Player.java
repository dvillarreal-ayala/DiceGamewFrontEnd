import javax.swing.*;
import java.awt.*;

public class Player
{
    //variables
    //Dice used for player's moves.
    private int playerNumber;
    private String name;
    private int totalSum;
    private Die Die1;
    private Die Die2;


    public Player(String handle, int num)
    {
        name = handle;
        playerNumber = num;
        totalSum = 0;
        if(num == 1)
        {
            Die1 = new Die(1);
            Die2 = new Die(2);
        }
        else
        {
            Die1 = new Die(3);
            Die2 = new Die(4);
        }
    }
    public String getName()
    {
        return name;
    }
    public int getSum()
    {
        return totalSum;
    }
    public Die getDie1()
    {
        return Die1;
    }
    public Die getDie2()
    {
        return Die2;
    }
    public void setName(String handle)
    {
        name = handle;
    }
    public void updateSum(int num)
    {
        totalSum+=num;
    }
    public void resetSum()
    {
        totalSum = 0;
    }

    public int roll()
    {
        int num = Die1.roll();
        //insert draw method
        num += Die2.roll();
        return num;
    }

    public String toString()
    {
        return name + ": " + totalSum + " points";
    }
}