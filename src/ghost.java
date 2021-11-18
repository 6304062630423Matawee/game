//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class ghost {
    Image ghost = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("ghost.png"));
    public int x = 560;
    public int y = 230;

    ghost() {
    }

    public Image getImage() {
        return this.ghost;
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
