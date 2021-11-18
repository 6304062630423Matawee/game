

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Howto extends JPanel {
    private final ImageIcon bg = new ImageIcon(this.getClass().getResource("howto.jpg"));

    public JButton Bback = new JButton("back");

    Howto(){

        setLayout(null);
        Bback.setBounds(850,700,100,50);
        add(Bback);
        Bback.setFont(new Font("ZF#2ndPixelus",Font.CENTER_BASELINE,25));
        Bback.setBackground ( Color.white );
        add(Bback);
        Bback.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
        add(Bback);
        setLayout(null);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg.getImage(),0,0,getWidth(),getHeight(),this);


    }
}
