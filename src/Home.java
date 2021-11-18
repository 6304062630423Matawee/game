import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    private  ImageIcon bghome = new ImageIcon(this.getClass().getResource("Bgstart.JPG"));
    private  ImageIcon start = new ImageIcon(this.getClass().getResource("Startbutton.png"));
    public JButton BStart = new JButton(start);
    public JButton BHowto = new JButton("How to");
    Home()
    {
        setLayout(null);
        BStart.setBounds(290,450,300,130);
        add(BStart);
        BHowto.setBounds(850,700,100,60);
        BHowto.setBackground(Color.PINK);
        BHowto.setFont(new Font("", 1, 20));
        add(BHowto);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bghome.getImage(),0,0,getWidth(),getHeight(),this);

    }
}
