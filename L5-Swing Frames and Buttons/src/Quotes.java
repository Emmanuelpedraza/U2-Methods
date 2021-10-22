import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {

        JFrame window = new JFrame("THis is the best quotes");
        JPanel panel = new JPanel();
        JButton button1 = new JButton("click for 1st quote");
        JButton button2 = new JButton("click for 2nd quote");
        JButton button3 = new JButton("click for 3rd quote");



        window.setSize(300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button1.addActionListener(new ButtonListener());

        panel.add(button1);

    button2.addActionListener(new Quote2());
        panel.add(button2);

        button3.addActionListener(new Quote3());
        panel.add(button3);
        window.add(panel);
        window.setVisible(true);





        window.setVisible(true);
    }
    private static class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, " THAT THOUGH");
        }
    }
    private static class Quote2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "BY 6 YEAR OLD CHILD : YE THAT TRASH");
        }
    }

    private static class Quote3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, " THAT ROUGH");
        }
    }
}


