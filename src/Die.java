import javax.swing.*;
import java.awt.*;
public class Die {
    /** Instance Variables **/
    private int sides;
    private int placement;
    private int value;
    private Image D1, D2, D3, D4, D5, D6;
    private final int SQUARE_SIZE = 125;

    /** Constructors **/
    public Die() {
        sides = 6;
        value = 0;
    }

    public Die(int value) {
        sides = 6;
        //Placement is used to decide where the dice will be drawn.
        placement = value;
        //value is the value of the die
        this.value = 0;
        //Images of each die side
        this.D1 = new ImageIcon("Resources/D1.png").getImage();
        this.D2 = new ImageIcon("Resources/D2.png").getImage();
        this.D3 = new ImageIcon("Resources/D3.png").getImage();
        this.D4 = new ImageIcon("Resources/D4.png").getImage();
        this.D5 = new ImageIcon("Resources/D5.png").getImage();
        this.D6 = new ImageIcon("Resources/D6.png").getImage();
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
        value = (int)(Math.random()*sides) + 1;
        return value;
    }

    /**
     * Draw function for Die
     * Draws based off of the value of the die, which player's die it is, and which die it is(Die 1 or 2)
     */
    public void draw(Graphics g, GameViewer gameViewer)
    {
        if(value == 1)
        {
            if(placement == 1)
            {
                g.drawImage(D1,250,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 2)
            {
                g.drawImage(D1,575,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 3)
            {
                g.drawImage(D1,250,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else
            {
                g.drawImage(D1,575,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
        }
        else if(value == 2)
        {
            if(placement == 1)
            {
                g.drawImage(D2,250,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 2)
            {
                g.drawImage(D2,575,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 3)
            {
                g.drawImage(D2,250,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else
            {
                g.drawImage(D2,575,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
        }
        else if(value == 3)
        {
            if(placement == 1)
            {
                g.drawImage(D3,250,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 2)
            {
                g.drawImage(D3,575,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 3)
            {
                g.drawImage(D3,250,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else
            {
                g.drawImage(D3,575,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
        }
        else if(value == 4)
        {
            if(placement == 1)
            {
                g.drawImage(D4,250,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 2)
            {
                g.drawImage(D4,575,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 3)
            {
                g.drawImage(D4,250,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else
            {
                g.drawImage(D4,575,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
        }
        else if(value == 5)
        {
            if(placement == 1)
            {
                g.drawImage(D5,250,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 2)
            {
                g.drawImage(D5,575,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 3)
            {
                g.drawImage(D5,250,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else
            {
                g.drawImage(D5,575,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
        }
        else
        {
            if(placement == 1)
            {
                g.drawImage(D6,250,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
            }
            else if(placement == 2)
        {
            g.drawImage(D6,575,100, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
        }
        else if(placement == 3)
        {
            g.drawImage(D6,250,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
        }
        else
        {
            g.drawImage(D6,575,400, SQUARE_SIZE, SQUARE_SIZE, gameViewer);
        }
        }
    }

    /**
     * Rolls the dice the valueRolls times
     * and returns the max value of the rolls
     */
    public int getMaxRoll(int valueRolls) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<valueRolls; i++) {
            int value = roll();
            max = Math.max(max, value);
        }

        return max;
    }

    /**
     * Rolls to get a value between 3 and 12 for the round goal
     * returns an int
     */
    public static int roundGoal() {
        int value = (int)(Math.random() * 10) + 3;
        return value;
    }

    /**
     */
    public String toString() {
        return "This is a " + sides + " sided die.";
    }
}
