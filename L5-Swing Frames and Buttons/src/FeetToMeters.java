import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame(" Convert feet to Meters");
        JPanel panel = new JPanel();
        double feet;
        JButton feetToMeters = new JButton("Put in distance in feet");
        JButton metersToFeet = new JButton("put in distance in Meters");



        window.setSize(500,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        feetToMeters.addActionListener(new feetToMeters());
        panel.add(feetToMeters);

        metersToFeet.addActionListener(new metersToFeet());
        panel.add(metersToFeet);

        window.add(panel);
        window.setVisible(true);
    }
    private static class feetToMeters implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double feet = Double.parseDouble( JOptionPane.showInputDialog("Enter distance in feet"));
                 double meters = feet/3.28;
                 JOptionPane.showMessageDialog(null, "meters" +  meters);
        }
    }
    private static class metersToFeet implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double meters = Double.parseDouble( JOptionPane.showInputDialog("Enter distance in meters"));
            double feet = meters * 3.28;
            JOptionPane.showMessageDialog(null, "Feet" +  feet);
        }
    }
}

