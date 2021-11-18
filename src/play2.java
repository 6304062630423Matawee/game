import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;

public  class play2 extends JPanel implements ActionListener{
    play play1 = new play();
    gameover over = new gameover();
    private final ImageIcon bg = new ImageIcon(this.getClass().getResource("space.jpg"));
    private final ImageIcon dead = new ImageIcon(this.getClass().getResource("DEAD.png"));
    private final ImageIcon happy = new ImageIcon(this.getClass().getResource("HAPPY.jpg"));
    Timer loop;
    slime2 s = new slime2();
    private earth earth = new earth();

    private Star star = new Star();
    private coin2 c2 = new coin2(320,200);
    private coin2 c3 = new coin2(400,300);
    private coin2 c4 = new coin2(600,300);
    private coin2 c5 = new coin2(100,300);
    private coin2 c6 = new coin2(600,500);
    private coin2 c7 = new coin2(250,200);
    private coin2 c8 = new coin2(700,600);
    private coin2 c9 = new coin2(500,200);
    private ground gr = new ground();
    private parent p = new parent();
    boolean lock1;
    boolean lock2;
    boolean lock3;
    boolean lock4;
    boolean lock5;
    boolean lock6;
    boolean lock7;
    boolean lock8;
    boolean lock9;
    boolean fall = false;
    cutemon cutemon;
    cutemon cutemon1;
    cutemon cutemon2;
    public ArrayList<meteo> mt = new ArrayList<meteo>();
    public ArrayList<meteo> mt2 = new ArrayList<meteo>();
    public ArrayList<meteo> mt3 = new ArrayList<meteo>();
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
    Thread meteo = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(fall == false){
                        Thread.sleep((long)(Math.random()*10000)+200);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                if(fall == false){
                    mt.add(new meteo(400));
                }
            }
        }
    });
    Thread meteo1 = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(fall == false){
                        Thread.sleep((long)(Math.random()*10000)+200);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                if(fall == false){
                    mt2.add(new meteo(200));
                }
            }
        }
    });
    Thread meteo3 = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(fall == false){
                        Thread.sleep((long)(Math.random()*10000)+200);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                if(fall == false){
                    mt3.add(new meteo(700));
                }
            }
        }
    });

    public  play2()
    {
        loop = new Timer(100,this);
        timer.start();
        loop.start();
        cutemon = new cutemon(200,200);
        cutemon1 = new cutemon(300,600);
        cutemon2 = new cutemon(500,100);
        lock1 = false;
        lock2 = false;
        addKeyListener(new keyInput(s));
        setFocusable(true);
        t.start();
        meteo.start();
        meteo1.start();
        meteo3.start();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        if (times>0)
        {
            g.drawImage(bg.getImage(),0,0,this.getWidth(),this.getHeight(),this);
            g.drawImage(this.s.getImage(), this.s.getx(), this.s.gety(), 90, 90, this);
            g.drawImage(this.cutemon.getImage(), this.cutemon.getx(), this.cutemon.gety(), 90, 90, this);
            g.drawImage(this.cutemon1.getImage(), this.cutemon1.getx(), this.cutemon1.gety(), 90, 90, this);
            g.drawImage(this.cutemon2.getImage(), this.cutemon2.getx(), this.cutemon2.gety(), 90, 90, this);
            if (Intersect(cutemon.getbound(),s.getbound())||Intersect(cutemon1.getbound(),s.getbound())||Intersect(cutemon2.getbound(),s.getbound()))
            {
                g.drawImage(dead.getImage(),0,0,this.getWidth(),this.getHeight(),this);
                times=0;
            }
            if (!this.lock1) {
                g.drawImage(this.star.getImage(),this.star.getx(),this.star.y,70,70,this);
                g.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
                g.setColor(Color.white);
                if (this.Intersect(this.s.getbound(), this.star.getbound())) {
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
            if (!this.lock3) {
                g.drawImage(this.c3.getImage(),this.c3.getx(),this.c3.y,50,50,this);
                if (this.Intersect(this.s.getbound(), this.c3.getbound())) {
                    this.lock3 = true;
                    score+=2;
                }

            }
            if (!this.lock4) {
                g.drawImage(this.c4.getImage(),this.c4.getx(),this.c4.y,50,50,this);
                if (this.Intersect(this.s.getbound(), this.c4.getbound())) {
                    this.lock4 = true;
                    score+=2;
                }

            }
            if (!this.lock5) {
                g.drawImage(this.c5.getImage(),this.c5.getx(),this.c5.y,50,50,this);
                if (this.Intersect(this.s.getbound(), this.c5.getbound())) {
                    this.lock5 = true;
                    score+=2;
                }

            }
            if (!this.lock6) {
                g.drawImage(this.c6.getImage(),this.c6.getx(),this.c6.y,50,50,this);
                if (this.Intersect(this.s.getbound(), this.c6.getbound())) {
                    this.lock6 = true;
                    score+=2;
                }

            }
            if (!this.lock7) {
                g.drawImage(this.c7.getImage(),this.c7.getx(),this.c7.y,50,50,this);
                if (this.Intersect(this.s.getbound(), this.c7.getbound())) {
                    this.lock7 = true;
                    score+=2;
                }

            }
            if (!this.lock8) {
                g.drawImage(this.c8.getImage(),this.c8.getx(),this.c8.y,50,50,this);
                if (this.Intersect(this.s.getbound(), this.c8.getbound())) {
                    this.lock8 = true;
                    score+=2;
                }

            }
            if (!this.lock9) {
                g.drawImage(this.c9.getImage(),this.c9.getx(),this.c9.y,50,50,this);
                if (this.Intersect(this.s.getbound(), this.c9.getbound())) {
                    this.lock9 = true;
                    score+=2;
                }

            }
            g.drawImage(this.earth.getImage(), this.earth.getx(), this.earth.gety(), 200, 200, this);
            g.setFont(new Font("", 1, 20));
            g.setFont(new Font("", 1, 20));
            g.setColor(Color.PINK);
            g.drawString("COIN : " + score, 50, 90);
            g.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
            g.drawString("Time :" + times, 50, 60);
            for(int i=0 ; i<mt.size();i++){
                g.drawImage( mt.get(i).getImage() ,mt.get(i).getX(),mt.get(i).getY(),100,100,this);
                if (Intersect(mt.get(i).getbound(),s.getbound())){
                    mt.remove(i);
                    g.drawImage(dead.getImage(),0,0,this.getWidth(),this.getHeight(),this);
                    times=0;
                }
            }
            for(int i=0 ; i<mt2.size();i++){
                g.drawImage( mt2.get(i).getImage() ,mt2.get(i).getX(),mt2.get(i).getY(),100,100,this);
                if (Intersect(mt2.get(i).getbound(),s.getbound())){
                    mt2.remove(i);
                    g.drawImage(dead.getImage(),0,0,this.getWidth(),this.getHeight(),this);
                    times=0;

                }
            }
            for(int i=0 ; i<mt3.size();i++){
                g.drawImage( mt3.get(i).getImage() ,mt3.get(i).getX(),mt3.get(i).getY(),100,100,this);
                if (Intersect(mt3.get(i).getbound(),s.getbound())){
                    mt3.remove(i);
                    g.drawImage(dead.getImage(),0,0,this.getWidth(),this.getHeight(),this);
                    times=0;

                }
            }
            if (this.Intersect(this.s.getbound(), this.earth.getbound()))
            {
                g.drawImage(happy.getImage(),0,0,this.getWidth(),this.getHeight(),this);
                g.setFont(new Font("Agency FB", Font.CENTER_BASELINE, 30));
                g.setColor(Color.BLACK);
                g.drawString("You Got   " + score +"  Coin  for your parents", 50, 450);
                t.stop();
                this.loop.stop();
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
        cutemon.movecutemon();
        cutemon1.movecutemon();
        cutemon2.movecutemon();
        s.slimemove();
        repaint();


    }
    class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            repaint();
        }
    }
}

