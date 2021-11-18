//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class coin {
    Image coin = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("ROOT.png"));
    public int x = 890;
    public int y = 600;

    coin() {
    }

    public Image getImage() {
        return this.coin;
    }

    public Rectangle2D getbound() {
        return new Double((double)this.x, (double)this.y, 50D, 50D);
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }
}

