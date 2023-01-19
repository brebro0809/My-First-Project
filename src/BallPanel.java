import javax.swing.*;
import java.awt.*;
import java.util.*;
// Creating my own Panel class that inherits from JPanel
public class BallPanel extends JPanel
{
    public static ArrayList<Ball> balls = new ArrayList<Ball>();
    public BallPanel()
    {
        setBackground(Color.BLACK);
    }

    // overriding the paintComponent method inherited
    // this method automatically gets called by JVM
    // Graphics class is in java.awt package
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for (Ball b : balls)
        {
            b.update(g);
        }


        try
        {
            Thread.sleep(10);
        } catch(Exception e)
        {
            System.out.println(e);
        }
        repaint();
    }
}