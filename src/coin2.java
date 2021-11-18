//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class coin2 {
    Image coin = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("coin.png"));
    public int x ;
    public int y ;

    coin2(int x,int y) {
        this.x=x;
        this.y=y;
    }

    public Image getImage() {
        return this.coin;
    }

    public Rectangle2D getbound() {
        return new Double((double)this.x, (double)this.y, 70D, 70D);
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }
}

