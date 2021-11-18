import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class ground {
    Image g = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("g.png"));
    public int x = 600;
    public int y = 60;
    ground() {
    }

    public Image getImage() {
        return this.g;
    }

    public Rectangle2D getbound() {
        return new Rectangle2D.Double((double)this.x, (double)this.y, 700.0D, 50.0D);
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }
}
