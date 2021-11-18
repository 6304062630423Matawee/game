import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

public class pool {
    public int x = 670;
    public int y = 100;
    public pool()
    {
    }
    public Rectangle2D getbound() {
        return new Rectangle2D.Double((double)this.x, (double)this.y, 300, 200);
    }
    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }



}
