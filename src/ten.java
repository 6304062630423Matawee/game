import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

public class ten {
    public int x = 0;
    public int y = 100;
    public int count = 0;
    public ten()
    {
    }
    public Rectangle2D getbound() {
        return new Rectangle2D.Double((double)this.x, (double)this.y, 250, 200);
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
