import java.awt.*;

public class Ball
{
    private int x, y, size, xSpeed, ySpeed;
    private Color col;
    private int xAdd;
    private int yAdd;
    private BallPanel myPanel;

    public Ball(int startX, int startY, int size, int XSpeed,int ySpeed, Color col, BallPanel myPanel)
    {
        x = startX;
        y = startY;
        this.size = size;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.col = col;
        this.myPanel = myPanel;

        xAdd = xSpeed;
        yAdd = ySpeed;
    }

    public Ball(BallPanel myPanel)
    {
        x = (int)(Math.random()*1000);
        y = (int)(Math.random()*1000);
        size = (int)(Math.random()*20)+1;
        xSpeed = (int)(Math.random()*5)+1;
        ySpeed = (int)(Math.random()*5)+1;
        col = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        this.myPanel = myPanel;

        xAdd = xSpeed;
        yAdd = ySpeed;
    }

    public void update(Graphics g)
    {
        g.setColor(col);

        if(x > myPanel.getWidth() || x < 0)
        {
            xAdd *= -1;
        }

        if(y > myPanel.getHeight() || y < 0)
        {
            yAdd *= -1;
        }

        x += xAdd;
        y += yAdd;
        g.fillOval(x, y, size, size);
    }
}