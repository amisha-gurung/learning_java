import javax.swing.*;
import java.awt.*;

public class Swingss{
    public static void main(String[] args){
        // a form that takes name password hobbies and gender as input
        JFrame frame = new JFrame("A Simple Form");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel name = new JLabel("Name: ");
        JTextField namef = new JTextField();

        JLabel password = new JLabel("Password: ");
        JPasswordField passwordf = new JPasswordField();

        JLabel hobbies = new JLabel("Hobbies: ");
        JTextArea hobbiest = new JTextArea();

        JLabel gender = new JLabel("Gender: ");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        frame.add(name);
        frame.add(namef);
        frame.add(password);
        frame.add(passwordf);
        frame.add(hobbies);
        frame.add(hobbiest);
        frame.add(gender);
        frame.add(maleButton);
        frame.add(femaleButton);

        frame.setLayout(new GridLayout(8, 2));


        frame.setVisible(true);
    }
}