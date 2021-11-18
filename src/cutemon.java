import java.awt.*;
import java.awt.geom.Rectangle2D;

public class cutemon {
    private int x,y;
    private int speedx = 15;
    Image cute = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("mon.png"));


    public cutemon(int x,int y)
    {
        this.x = x;
        this.y = y;

    }
    public Image getImage() {
        return this.cute;
    }
    public void movecutemon()
    {
        x-=speedx;
        if(x<300)
        {
            speedx=-15;
        }
        if(x>800)
        {
            speedx=15;
        }


    }
    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }
    public Rectangle2D getbound() {
        return new Rectangle2D.Double((double)this.x, (double)this.y, 70.0D, 70.0D);
    }
}
