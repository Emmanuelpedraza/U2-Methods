import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    JFrame window1 = new JFrame(" Choose your COLOR");
    JPanel panel = new JPanel();
    JButton Colorclicker = new JButton("NEXT COLOR");
    JButton colorChanger = new JButton("NEXT COLOR");
    JButton colorButton = new JButton("NEXT COLOR");


    //Declare your frame, panel and three buttons.
    public ColorSwitchGUI() {
        //create your GUI


        window1.setSize(400, 127);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window1.setLocationRelativeTo(null);

        //add action button listeners
        Colorclicker.addActionListener(new Colorclicker());
        colorButton.addActionListener(new colorButton());
        colorChanger.addActionListener(new colorChanger());


        panel.add(Colorclicker);
        panel.add(colorChanger);
        panel.add(colorButton);

        window1.add(panel);
        window1.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class Colorclicker implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBack = new Color(255, 0, 67);
            Color buttonBack = new Color(103, 103, 103);
            Color buttonText = new Color(13, 59, 175);

            panel.setBackground(panelBack);
            Colorclicker.setBackground(buttonBack);
            Colorclicker.setForeground(buttonText);
            colorButton.setBackground(buttonBack);
            colorButton.setForeground(buttonText);
            colorChanger.setBackground(buttonBack);
            colorChanger.setForeground(buttonText);

        }
    }

    private class colorButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBack = new Color(38, 52, 190);
            Color buttonBack = new Color(28, 250, 209);
            Color buttonText = new Color(0, 0, 0);

            panel.setBackground(panelBack);
            Colorclicker.setBackground(buttonBack);
            Colorclicker.setForeground(buttonText);
            colorButton.setBackground(buttonBack);
            colorButton.setForeground(buttonText);
            colorChanger.setBackground(buttonBack);
            colorChanger.setForeground(buttonText);

        }
    }

    private class colorChanger implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBack = new Color(25, 0, 67);
            Color buttonBack = new Color(10, 103, 103);
            Color buttonText = new Color(3, 59, 175);

            panel.setBackground(panelBack);
            Colorclicker.setBackground(buttonBack);
            Colorclicker.setForeground(buttonText);
            colorButton.setBackground(buttonBack);
            colorButton.setForeground(buttonText);
            colorChanger.setBackground(buttonBack);
            colorChanger.setForeground(buttonText);

        }
    }
}
