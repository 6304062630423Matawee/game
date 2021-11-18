import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

public class tree {
    public int x = 780;
    public int y = 0;
    public int count = 0;
    public tree()
    {
    }
    public Rectangle2D getbound() {
        return new Rectangle2D.Double((double)this.x, (double)this.y, 120, 50);
    }
    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }

    public void set(int Y) {
        Y = this.y;
    }


}
