import javax.swing.*;
import java.awt.*;
public class Die {
    /** Instance Variables **/
    private int sides;
    private int placement;
    private int num;
//    private Image D1, D2, D3, D4, D5, D6;
//    private final int SQUARE_SIZE = 200;

    /** Constructors **/
    public Die() {
        sides = 6;
        num = 0;
//        this.D1 = new ImageIcon("Resources/D1.png").getImage();
//        this.D2 = new ImageIcon("Resources/D2.png").getImage();
//        this.D3 = new ImageIcon("Resources/D3.png").getImage();
//        this.D4 = new ImageIcon("Resources/D4.png").getImage();
//        this.D5 = new ImageIcon("Resources/D5.png").getImage();
//        this.D6 = new ImageIcon("Resources/D6.png").getImage();
    }

    public Die(int num) {
//        sides = numSides;
        placement = num;
        this.num = 0;
//        this.D1 = new ImageIcon("Resources/D1.png").getImage();
//        this.D2 = new ImageIcon("Resources/D2.png").getImage();
//        this.D3 = new ImageIcon("Resources/D3.png").getImage();
//        this.D4 = new ImageIcon("Resources/D4.png").getImage();
//        this.D5 = new ImageIcon("Resources/D5.png").getImage();
//        this.D6 = new ImageIcon("Resources/D6.png").getImage();
    }

    /** Methods **/
    public int getSides() {
        return sides;
    }

    /**
     * Returns a random int between 1 and
     * the number of sides on the Die
     */
    public int roll() {
        num = (int)(Math.random()*sides) + 1;
        return num;
    }

    /**
     * Draw function for Die
     */
    public void draw(Graphics g, GameViewer gameViewer)
    {
        if(sides == 1)
        {
            //
        }
        else if(sides == 2)
        {
         //
        }
        else if(sides == 3)
        {
            //
        }
        else if(sides == 4)
        {
            //
        }
        else if(sides == 5)
        {
         //
        }
        else
        {
            //
        }
    }

    /**
     * Rolls the dice the numRolls times
     * and returns the max value of the rolls
     */
    public int getMaxRoll(int numRolls) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numRolls; i++) {
            int num = roll();
            max = Math.max(max, num);
        }

        return max;
    }

    /**
     * Rolls to get a number between 3 and 12 for the round goal
     * returns an int
     */
    public static int roundGoal() {
        int num = (int)(Math.random() * 10) + 3;
        return num;
    }

    /**
     */
    public String toString() {
        return "This is a " + sides + " sided die.";
    }
}
