import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.net.URL;
 public  class play extends JPanel implements ActionListener{
     gameover over = new gameover();
     private final ImageIcon bg = new ImageIcon(this.getClass().getResource("bg.png"));
     private final ImageIcon dead = new ImageIcon(this.getClass().getResource("DEAD.png"));
     private final ImageIcon happy = new ImageIcon(this.getClass().getResource("HAPPY.jpg"));
     Timer loop;
     slime s = new slime();
     ghost ghost = new ghost();
     private tree tree = new tree();
     private coin c = new coin();
     private coin2 c2 = new coin2(320,200);
     private ground gr = new ground();
     private parent p = new parent();
     private mon m = new mon(150,650);
     private mon m2 = new mon(80,540);
     boolean lock1;
     boolean lock2;
     Dmonster DM ;
     Dmonster DM4;
     D2monster DM2;
     D3monster DM3;
     public int times;
     boolean timestart = true;
     int score = 0;
     private Timer timer = new Timer(1000, new Listener());
     Thread t = new Thread(new Runnable() {
         public void run() {
             while (true) {
                 if (timestart == false) {
                     times = (times - 1);
                 }
                 try {
                     Thread.sleep(900);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }
     });

    public  play()
    {
        loop = new Timer(100,this);
        timer.start();
        loop.start();
        DM = new Dmonster(400,50);
        DM2 = new D2monster(100,300);
        DM3 = new D3monster(700,550);
        DM4 = new Dmonster(700,700);

        lock1 = false;
        lock2 = false;
        addKeyListener(new keyInput(s));
        setFocusable(true);
        t.start();
    }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            if (times>0&&(!this.Intersect(this.s.getbound(),this.DM.getbound()))  &&   (!this.Intersect(this.s.getbound(), this.DM2.getbound()))  &&  (!this.Intersect(this.s.getbound(), this.DM3.getbound())))
            {
                g.drawImage(bg.getImage(),0,0,this.getWidth(),this.getHeight(),this);
                g.drawImage(this.s.slime[this.s.count].getImage(), this.s.getx(), this.s.gety(), 90, 90, this);
                g.drawImage(this.DM.getImage(), this.DM.getx(), this.DM.gety(), 90, 90, this);
                g.drawImage(this.DM2.getImage(), this.DM2.getx(), this.DM2.gety(), 90, 90, this);
                g.drawImage(this.DM3.getImage(), this.DM3.getx(), this.DM3.gety(), 90, 90, this);
                g.setFont(new Font("", 1, 20));
                g.setFont(new Font("", 1, 20));
                g.drawString("COIN : " + score, 50, 90);
                g.drawImage(this.p.getImage(),this.p.getx(),this.p.y,150,150,this);
                g.drawImage(this.m2.getImage(),this.m2.getx(),this.m2.y,100,100,this);
                g.drawImage(this.m.getImage(),this.m.getx(),this.m.y,100,100,this);
                g.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
                g.drawImage(this.ghost.getImage(),this.ghost.getx(),this.ghost.gety(),160,100,this);
                if (this.Intersect(this.s.getbound(), this.ghost.getbound()))
                {
                    slime move = this.s;
                    move.y -= 30;
                    move.speedx=5;
                    move.speedy=5;
                    times-=5;
                }
                g.drawString("Time :" + times, 50, 60);
                if (!this.lock1) {
                    g.drawImage(this.c.getImage(),this.c.getx(),this.c.y,70,70,this);
                    g.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
                    g.setColor(Color.white);
                    if (this.Intersect(this.s.getbound(), this.c.getbound())) {
                        this.lock1 = true;
                        score+=20;
                    }

                }
                if (!this.lock2) {
                    g.drawImage(this.c2.getImage(),this.c2.getx(),this.c2.y,50,50,this);
                    if (this.Intersect(this.s.getbound(), this.c2.getbound())) {
                        this.lock2 = true;
                        score+=2;
                    }

                }
                if (this.Intersect(this.s.getbound(), this.m.getbound())) {
                    if (!this.lock1) {
                        slime move = this.s;
                        move.x += 30;
                        g.setFont(new Font("", 1, 20));
                        g.drawString("Money!!!!", 150, 600);
                    } else if (this.lock1) {
                        score=0;
                        g.setFont(new Font("", 1, 20));
                        g.drawString("OK PASS", 150, 600);
                    }
                }
                if (this.Intersect(this.s.getbound(), this.m2.getbound())) {
                    if (!this.lock1) {
                        slime move = this.s;
                        move.x += 30;
                        g.setFont(new Font("", 1, 20));
                        g.drawString("Money!!!!", 80, 550);
                    } else if (this.lock1) {
                        score=0;
                        g.setFont(new Font("", 1, 20));
                        g.drawString("OK PASS", 150, 600);
                    }
                }
                if (this.Intersect(this.s.getbound(), this.p.getbound()))
                {
                    g.drawImage(happy.getImage(),0,0,this.getWidth(),this.getHeight(),this);
                    this.loop.stop();

                }
                if(this.Intersect((this.s.getbound()),this.tree.getbound()))
                {
                    slime move = this.s;
                   move.x-=30;
                   move.y-=30;
                }


            }
            else
            {
                g.drawImage(dead.getImage(),0,0,this.getWidth(),this.getHeight(),this);
                this.loop.stop();
            }
        }
     public boolean Intersect(Rectangle2D a, Rectangle2D b) {
         return a.intersects(b);
     }
     public void actionPerformed(ActionEvent e)
     {
         DM.moveDmonster();
         DM2.moveDmonster();
         DM3.moveDmonster();
         s.slimemove();
         repaint();


     }
     class Listener implements ActionListener{
         public void actionPerformed(ActionEvent e){
             repaint();
         }
     }
 }

