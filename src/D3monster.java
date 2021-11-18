import java.awt.*;
import java.awt.geom.Rectangle2D;

public class D3monster {
    private int x,y;
    private int speedx = 15;
    Image redmonster = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("redmonster2.png"));


    public D3monster(int x,int y)
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
        if(x<600)
        {
            speedx=-15;
        }
        if(x>870)
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
