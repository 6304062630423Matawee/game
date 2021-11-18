import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainplay extends JFrame implements ActionListener {
    Home homestart = new Home();
    play play1 = new play();
    play2 play2 = new play2();
    map map = new map();
    Howto Howto = new Howto();
    public Mainplay()
    {
        this.setSize(1000,800);
        this.add(homestart);
        homestart.BStart.addActionListener(this);
        map.Bback.addActionListener(this);
        map.bmap1.addActionListener(this);
        map.bmap2.addActionListener(this);
        homestart.BHowto.addActionListener(this);
        Howto.Bback.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==homestart.BStart)
        {
            this.setLocationRelativeTo(null);
            this.remove(homestart);
            this.setSize(1000,800);
            this.add(map);
        }
        else if(e.getSource()==homestart.BHowto)
        {
            this.setLocationRelativeTo(null);
            this.remove(homestart);
            this.setSize(1000,800);
            this.add(Howto);
        }

        else if(e.getSource()==map.bmap1)
        {
            this.setLocationRelativeTo(null);
            this.remove(homestart);
            this.setSize(1000,800);
            remove(map);
            this.add(play1);
            play1.times=60;
            play1.timestart=false;
            play1.requestFocusInWindow();

        }
        else if(e.getSource()==map.bmap2)
        {
            this.setLocationRelativeTo(null);
            this.remove(homestart);
            this.setSize(1000,800);
            this.add(play2);
            remove(map);
            play2.times=60;
            play2.timestart=false;
            play2.requestFocusInWindow();
            play2.fall=false;

        }
        else if(e.getSource() == map.Bback)
        {
            this.setLocationRelativeTo(null);
            this.remove(map);
            this.setSize(1000,800);
            this.add(homestart);
            homestart.requestFocusInWindow();
        }
        else if(e.getSource() == Howto.Bback)
        {
            this.setLocationRelativeTo(null);
            this.remove(Howto);
            this.setSize(1000,800);
            this.add(homestart);
            homestart.requestFocusInWindow();
        }
        this.validate();
        repaint();

    }
    public static void main(String[] args)
    {
        JFrame home = new Mainplay();
        home.setTitle(" SLIME HOME <3");
        home.setSize(1000,800);
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }
}
