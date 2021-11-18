

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class map extends JPanel {
    private final ImageIcon bg = new ImageIcon(this.getClass().getResource("bgmap.png"));
    private final ImageIcon  map1 = new ImageIcon(this.getClass().getResource("grass.png"));
    private final ImageIcon  map2 = new ImageIcon(this.getClass().getResource("space.jpg"));
    public JButton bmap1 = new JButton(map1);
    public JButton bmap2 = new JButton(map2);
    public JButton Bback = new JButton("back");

    map(){

        setLayout(null);
        bmap1.setBounds(100,260,300,300);
        add(bmap1);
        bmap1.setBackground ( Color.BLACK );
        add(bmap1);
        bmap1.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
        add(bmap1);
        Bback.setBounds(850,700,100,50);
        add(Bback);
        Bback.setFont(new Font("ZF#2ndPixelus",Font.CENTER_BASELINE,25));
        Bback.setBackground ( Color.white );
        add(Bback);
        Bback.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
        add(Bback);
        setLayout(null);
        bmap2.setBounds(600,260,300,300);
        add(bmap2);
        add(bmap2);
        bmap2.setBorder ( BorderFactory.createLineBorder ( Color.BLACK, 1 ) );
        add(bmap2);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(bg.getImage(),0,0,getWidth(),getHeight(),this);
        g.setColor(Color.BLACK);
        g.setFont(new Font("ZF#2ndPixelus",Font.CENTER_BASELINE,36));
        g.drawString("EARTH",190,600);
        g.setColor(Color.BLACK);
        g.setFont(new Font("ZF#2ndPixelus",Font.CENTER_BASELINE,36));
        g.drawString("SPACE",700,600);


    }
}
