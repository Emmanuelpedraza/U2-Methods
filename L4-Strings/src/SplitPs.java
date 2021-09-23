import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */


    public static void main(String[] args) {
        String wordP = JOptionPane.showInputDialog("Type word with p");
        JOptionPane.showMessageDialog(null, Pword(wordP));
        System.exit(0);

    }
    public static String Pword(String word){
        return word.substring(word.indexOf("p"), word.indexOf("p")+4);
    }

}


