import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInput {
    JLabel clickCount = new JLabel(" HOLYPANDA Switch Counter");
    static int clickerCount = 0;
    static JLabel clickerCountLabel;
    static JTextField textInputField;


    public static void main(String[] args) {

        JFrame window = new JFrame("CLICKY CLICK");
        JPanel panel = new JPanel();
        textInputField= new JTextField(10);
        clickerCountLabel = new JLabel("balance : $");
        JLabel textInputLabel = new JLabel("Enter new multiplier ");
        JLabel clickCount = new JLabel(" HOLYPANDA Switch Counter");
        JButton clicker = new JButton("Click here for new switch");


        window.setSize(320, 203);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        clicker.addActionListener(new clickerListener());

        panel.add(textInputLabel);
        panel.add(clickerCountLabel);
        panel.add(textInputField);
        panel.add(clicker);
        window.add(panel);

        window.setVisible(true);

    }
 private static class clickerListener implements ActionListener{


        public void actionPerformed(ActionEvent actionEvent){
            clickerCount++;
            String product = textInputField.getText();
            clickerCountLabel.setText("you sold " + product +" for "  + clickerCount);

        }
    }
}


