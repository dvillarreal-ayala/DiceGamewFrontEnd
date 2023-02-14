import javax.swing.*;
import java.awt.*;
public class GameViewer extends JFrame{
    private Game game;
    private Player player1, player2;
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private Image background;
    public GameViewer(Game game)
    {
        this.game = game;
        player1 = game.getPlayer1();
        player2 = game.getPlayer2();
        this.background = new ImageIcon("Resources/Background.png").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Game Screen");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // setVisible calls on paint()
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        // TODO: Write the paint method.
        //Reset Canvas
//        g.setColor(Color.white);
        g.drawImage(background,0,20,WINDOW_WIDTH, WINDOW_HEIGHT, this);
        //Print text/borders


    }
}
