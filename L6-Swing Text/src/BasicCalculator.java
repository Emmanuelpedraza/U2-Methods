import sun.font.TrueTypeFont;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    static JLabel resultLabel;
    static JLabel numbers2;
    static JTextField enterHere;
    static JLabel numbers;
    static JTextField enterHere2;
    public static void main(String[] args) {

        JFrame window = new JFrame("Calculator ");
        JPanel panel = new JPanel();
        numbers = new JLabel("Enter number here");
        enterHere = new JTextField(10);
        numbers2 = new JLabel("Enter number here");
        enterHere2 = new JTextField(10);

        JButton addition = new JButton("+");
        JButton subtraction = new JButton("-");
        JButton division  = new JButton("/");
        JButton multiplication = new JButton("*");

        resultLabel = new JLabel("0.00");


        window.setSize(250, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        addition.addActionListener(new addListener());
       subtraction.addActionListener(new subtractionListener());
        division.addActionListener(new divideListener());
        multiplication.addActionListener(new multiListener());


        panel.add(addition);
        panel.add(subtraction);
        panel.add(division);
        panel.add(multiplication);

        panel.add(numbers);
        panel.add(enterHere);
        panel.add(numbers2);
        panel.add(enterHere2);
        panel.add(resultLabel);



        window.add(panel);
        window.setVisible(true);
    }
    private static class addListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(numbers.getText());
                    double number2 = Double.parseDouble(numbers2.getText());

                    resultLabel.setText(String.valueOf(number1 + number2));
        }
    }

    private static class subtractionListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(numbers.getText());
            double number2 = Double.parseDouble(numbers2.getText());

            resultLabel.setText(String.valueOf(number1 - number2));
        }
    }

    private static class divideListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(numbers.getText());
            double number2 = Double.parseDouble(numbers2.getText());

            resultLabel.setText(String.valueOf(number1 / number2));
        }
    }

    private static class multiListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            double number1 = Double.parseDouble(numbers.getText());
            double number2 = Double.parseDouble(numbers2.getText());

            resultLabel.setText(String.valueOf(number1 * number2));
        }
    }
}

