import javax.swing.*;
import java.awt.*;

public class Player
{
    //variables
    //Dice used for player's moves.
    private String name;
    private int totalSum;
    private Die Die1;
    private Die Die2;
    private Image D1, D2, D3, D4, D5, D6;
    private final int SQUARE_SIZE = 200;


    public Player(String handle)
    {
        name = handle;
        totalSum = 0;
        Die1 = new Die(1);
        Die2 = new Die(2);
        this.D1 = new ImageIcon("Resources/D1.png").getImage();
        this.D2 = new ImageIcon("Resources/D2.png").getImage();
        this.D3 = new ImageIcon("Resources/D3.png").getImage();
        this.D4 = new ImageIcon("Resources/D4.png").getImage();
        this.D5 = new ImageIcon("Resources/D5.png").getImage();
        this.D6 = new ImageIcon("Resources/D6.png").getImage();
    }
    public String getName()
    {
        return name;
    }
    public int getSum()
    {
        return totalSum;
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