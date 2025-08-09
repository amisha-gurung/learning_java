//my first swing program 🥳
import javax.swing.*;
import java.awt.*;

public class SwingBasics{
    public static void main(String[] args){
        //creating a window usin JFrame
        JFrame window = new JFrame("Amisha's first Window yay");
        window.setSize(400, 500); // set width and height of the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //app exits when the window is closed

        window.setLayout(new FlowLayout());

        //Creating label with text using JLabel
        JLabel greeting = new JLabel("Hello! Welcome to Swing");

        JTextField textInput = new JTextField(20);

        //creating button using JButton
        JButton myButton = new JButton("Click Me");
        myButton.addActionListener(e -> {

            String userText = textInput.getText();
            greeting.setText("You Typed: "+ userText );
        });

        //adding components to the window
        window.add(greeting);
        window.add(myButton);
        window.add(textInput);

        window.setVisible(true); //Actually show the window (hidden by default)


    }
}