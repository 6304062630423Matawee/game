import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyInput extends KeyAdapter {
    slime s;
    public keyInput(slime s)
    {
        this.s=s;
    }
    public void keyPressed(KeyEvent e)
    {
        s.KeyPressed(e);
    }
    public void keyReleased(KeyEvent e)
    {
        s.keyReleased(e);

    }
}
