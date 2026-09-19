import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringUtility extends JFrame {

    private JButton countButton;
    private JButton reverseButton;
    private JButton removeDuplicatesButton;

    private JTextField inputField;
    private JTextField outputField;

    public StringUtility() {

        setTitle("String Utility");
        setSize(500, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));


        countButton = new JButton("Count Letters");
        reverseButton = new JButton("Reverse Letters");
        removeDuplicatesButton = new JButton("Remove Duplicates");


        inputField = new JTextField();
        outputField = new JTextField();


        JLabel inputLabel = new JLabel("Input");
        JLabel outputLabel = new JLabel("Output");


        add(countButton);
        add(inputLabel);

        add(reverseButton);
        add(inputField);

        add(removeDuplicatesButton);
        add(outputLabel);


        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                outputField.setText(String.valueOf(input.length()));
            }
        });


        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String reversed = new StringBuilder(input).reverse().toString();
                outputField.setText(reversed);
            }
        });


        removeDuplicatesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);

                    if (result.indexOf(String.valueOf(c)) == -1) {
                        result.append(c);
                    }
                }

                outputField.setText(result.toString());
            }
        });

        add(new JLabel(""));
        add(outputField);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StringUtility();
        });
    }
}