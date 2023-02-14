import javax.swing.*;
import java.awt.*;
public class GameViewer extends JFrame{
    private Game game;
    private Player player1, player2;
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private Image background, casino;
    public GameViewer(Game game)
    {
        this.game = game;
        player1 = game.getPlayer1();
        player2 = game.getPlayer2();
        this.background = new ImageIcon("Resources/Background.png").getImage();
        this.casino = new ImageIcon("Resources/casino.jpeg").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Game Screen");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // setVisible calls on paint()
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        //Reset Canvas
        g.drawImage(background,0,20,WINDOW_WIDTH, WINDOW_HEIGHT, this);
        //Prints text
        g.setColor(Color.red);
        g.setFont(new Font("Serif", Font.ITALIC, 40));
        g.drawString("Player1", 400, 150);
        g.drawString("Player2", 400, 450);
        //Draws dice
        player1.getDie1().draw(g, this);
        player1.getDie2().draw(g, this);
        player2.getDie1().draw(g, this);
        player2.getDie2().draw(g, this);


        //If game is over print winning message.
        if(game.getGameWon() == true)
        {
            g.drawImage(background,0,20,WINDOW_WIDTH, WINDOW_HEIGHT, this);
            g.setFont(new Font("Serif", Font.ITALIC, 50));
            g.drawString(game.printWinner(player1.getSum(), player2.getSum()), 50, 450);
        }
        g.drawString(player1.getSum() + "", 85, 132);
        g.drawString(player2.getSum() + "", 85, 200);
    }
}
