//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class mon {
    Image mon = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("mon.png"));
    public int x ;
    public int y;

    public mon(int x,int y)
    {
        this.x = x;
        this.y = y;

    }

    public Image getImage() {
        return this.mon;
    }

    public Rectangle2D getbound() {
        return new Double((double)this.x, (double)this.y, 120.0D, 120.0D);
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }
}
