import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

public class slime {
        public ImageIcon[] slime = new ImageIcon[4];
        public int x = 820;
        public int y = 60;
        public int speedx = 0;
        public int speedy = 0;
        public int count = 0;
        public slime()
        {
                for(int i = 0; i < this.slime.length; ++i) {
                        this.slime[i] = new ImageIcon(this.getClass().getResource(i + 1 + ".png"));
                }
        }
        public void slimemove()
        {
                x+=speedx;
                y+=speedy;
                collistion();
                if(x<0)
                {
                        x=0;
                }
                if(x>890)
                {
                        x=890;
                }
                if(y<10)
                {
                        y=10;
                }
                if(y>700)
                {
                        y=700;
                }



        }
        private void collistion()
        {
                tree tree = new tree();
                pool pool = new pool();
                gatom gatom = new gatom();
                ten ten = new ten();
                cow cow = new cow();
                if(getbound().intersects(tree.getbound())||getbound().intersects(pool.getbound())||getbound().intersects(gatom.getbound())||getbound().intersects(ten.getbound())||getbound().intersects(cow.getbound()))
                {
                        x+=speedx*-1;
                        y+=speedy*-1;
                }
        }
        public Rectangle2D getbound() {
                return new Rectangle2D.Double((double)this.x, (double)this.y, 25.0D, 25.0D);
        }
        public int getx() {
                return this.x;
        }
        public int gety() {
                return this.y;
        }
        public void KeyPressed(KeyEvent e)
        {
                if (e.getKeyCode() == 65)
                {

                        speedx = -15;
                        ++count;
                }
                if (e.getKeyCode() == 68)
                {
                        speedx = 15;
                        ++count;
                }
                if (e.getKeyCode() == 87)
                {
                        speedy = -15;
                        ++count;
                }
                if (e.getKeyCode() == 83)
                {
                        speedy = 15;
                        ++count;
                }
                if (count > 3) {
                        count = 0;
                }

        }
        public void keyReleased(KeyEvent e)
        {
                if (e.getKeyCode() == 65)
                {
                        speedx = 0;
                }
                if (e.getKeyCode() == 68)
                {
                        speedx = 0;
                }
                if (e.getKeyCode() == 87)
                {
                        speedy = 0;
                }
                if (e.getKeyCode() == 83)
                {
                        speedy = 0;
                }

        }


}
