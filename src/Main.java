import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Every dialog (Asking a user for input)
        // is provided by the JOptionPane class


        int response;

        do {

            response =  response = JOptionPane.showConfirmDialog
                    (null, "Are you 21 years of age or older?",
                            "Age Verification", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            switch (response) {
                case JOptionPane.YES_OPTION:
                    // Display "Proceed on adult"
                    // for output messages only, no user input
                    JOptionPane.showMessageDialog(null, "Proceed on, adult!", "You are an adult", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case JOptionPane.NO_OPTION:
                    // "You shall not pass!"
                    JOptionPane.showMessageDialog(null, "You shall not pass!", "Minor detected!", JOptionPane.ERROR_MESSAGE);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    // "Aversion detected"
                    JOptionPane.showMessageDialog(null, "You must answer the question", "Aversion Detected!", JOptionPane.ERROR_MESSAGE);
                    break;



            }
        }while(response== JOptionPane.CLOSED_OPTION);


    }
}
