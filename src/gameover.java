import javax.swing.*;
import java.awt.*;

public class gameover extends JPanel {
    private  ImageIcon over = new ImageIcon(this.getClass().getResource("DEAD.png"));
    gameover()
    {
        setLayout(null);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(over.getImage(),0,0,getWidth(),getHeight(),this);

    }
}
