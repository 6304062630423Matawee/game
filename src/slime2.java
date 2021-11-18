import java.awt.*;

public class slime2 extends  slime{
    Image slime  = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("1.png"));
    public Image getImage() {
        return this.slime;
    }
    public void slimemove()
    {
        x+=speedx;
        y+=speedy;
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
    }
}
