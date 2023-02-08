public class Die {
    /** Instance Variables **/
    private int sides;

    /** Constructors **/
    public Die() {
        sides = 6;
    }

    public Die(int numSides) {
        sides = numSides;
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
        int num = (int)(Math.random()*sides) + 1;
        return num;
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
