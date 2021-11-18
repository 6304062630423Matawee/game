import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Dmonster {
    private int x,y;
    private int speedx = 15;
    Image redmonster = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("redmonster.png"));


    public Dmonster(int x,int y)
    {
        this.x = x;
        this.y = y;

    }
    public Image getImage() {
        return this.redmonster;
    }
    public void moveDmonster()
    {
       x-=speedx;
       if(x<100)
       {
           speedx=-15;
       }
       if(x>500)
       {
           speedx=15;
       }


    }
    public Rectangle2D getbound() {
        return new Rectangle2D.Double((double)this.x, (double)this.y, 70.0D, 70.0D);
    }
    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }
}
