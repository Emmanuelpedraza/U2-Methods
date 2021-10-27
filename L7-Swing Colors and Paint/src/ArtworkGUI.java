import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    JFrame frame;

    //DECLARE VARIABLES

    public ArtworkGUI()
    {
        //CREATE THE GUI
        frame = new JFrame("Simple Drawing");
        frame.setSize(1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);

    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing() {
            //Set the background color
            setBackground(new Color (122, 61, 203));
        }
        //Add the PaintComponent Method and create your drawing.
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(new Color(41, 84, 10));
                g.fillRect(0,398,1000,99);

                g.setColor(new Color(255, 251, 0));
                g.drawRect(-1,398,1000,99);

                g.setColor(new Color(161, 49, 49));
                g.fillRect(500,358,99,90);

                g.setColor(new Color(161, 49, 49));
                g.fillRect(450,357,49,90);

                g.setColor(new Color(255, 0, 67));
                g.drawRect(450,357,49,90);

                g.setColor(new Color(145, 145, 145));
                g.drawLine(500,351,526,300);

                g.setColor(new Color(145, 145, 145));
                g.drawLine(600,350,526,300);

                g.setColor(new Color(145, 145, 145));
                g.drawLine(450,350,526,300);

                g.setColor(new Color(68, 67, 60, 186));
                g.fillOval(100,100,100,100);

                g.setColor(new Color(190, 93, 93, 255));
                g.fillOval(120,130,10,10);

                g.setColor(new Color(91, 6, 66, 255));
                g.fillOval(130,149,10,11);

                g.setColor(new Color(255, 7, 7, 255));
                g.fillOval(140,159,20,11);

                g.setColor(new Color(255, 210, 0, 255));
                g.drawOval(100,100,100,100);

                g.setColor(new Color(255, 233, 0));
                g.drawLine(100,150,50,100);

                g.setColor(new Color(255, 233, 0));
                g.drawLine(150,100,50,100);

                g.setColor(new Color(255, 0, 67, 255));
                g.drawRect(500,358,99,90);
        }
    }
}
