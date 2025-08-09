import javax.swing.*;
import java.awt.*;

public class Checkbox{
    public static void main(String[] args){
        JFrame frame = new JFrame("Implementing Checkboxes");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel greeting = new JLabel("Welcome to Swing checkboxes");
        JLabel quest = new JLabel("What do you like ???");

        JCheckBox laddu = new JCheckBox("I like laddu");
        JCheckBox ramen = new JCheckBox("I like ramen");
        JCheckBox fruit = new JCheckBox("I like fruits");
        JCheckBox music = new JCheckBox("I like music");

        JButton button = new JButton("Show Results");
        button.addActionListener(e -> {

            String message = "";
            if(laddu.isSelected()) message += "You like laddu yummm \n";
            if(ramen.isSelected()) message += "You like Ramen spicyyy huuuu \n";
            if(fruit.isSelected()) message += "You like fruits mhmmm \n";
            if(music.isSelected()) message += "You like music cool \n";
            JOptionPane.showMessageDialog(frame, message);

        });

        frame.add(greeting);
        frame.add(quest);
        frame.add(laddu);
        frame.add(ramen);
        frame.add(fruit);
        frame.add(music);
        frame.add(button);

        frame.setVisible(true);
    }
}