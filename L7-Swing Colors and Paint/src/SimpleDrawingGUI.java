import javax.swing.*;
import java.awt.*;

public class SimpleDrawingGUI {

    JFrame frame;

    public SimpleDrawingGUI(){
        frame = new JFrame("Simple Drawing");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME
        JPanel panel = new DrawingPanel();


        frame.add(panel);
        frame.setVisible(true);
    }

    private class DrawingPanel extends JPanel{

        //Constructor for the class
        public DrawingPanel(){
            //set the Background color
             setBackground(Color.CYAN);
        }
        public void paintComponent(Graphics g){
              super.paintComponent(g);
              g.setColor(Color.LIGHT_GRAY);
           g.fillRect(100, 100, 100, 200);

           g.setColor(Color.GREEN);
         g.drawRect(100, 100, 100 ,200 );

         g.setColor(Color.RED);
         g.drawLine(0, 0, 400, 600);

        }
    }
}
