import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

public class gatom {
    public int x = 340;
    public int y = 100;
    public int count = 0;
    public gatom()
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
