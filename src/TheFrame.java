import javax.swing.*;
class TheFrame
{
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);

        // Creating an object of MyDrawPanel class which automatically calls paintComponent for me
        BallPanel animPanel = new BallPanel();

        for (int i = 0; i < 1000; i++)
        {
            BallPanel.balls.add(new Ball(animPanel));
        }


        myFrame.add(animPanel);

        myFrame.setVisible(true);





    }
}