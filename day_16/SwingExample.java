
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample{
    public static void main(String[] args){
        JFrame frame = new JFrame("Yoo");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton redButton = new JButton("RED");
        redButton.setSize(30, 20);
        JButton blueButton = new JButton("BLUE");
        blueButton.setSize(30, 20);
        JButton greenButton = new JButton("GREEN");
        greenButton.setSize(30,20);

        redButton.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                redButton.setBackground(Color.RED);
            }
        });

        blueButton.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                blueButton.setBackground(Color.BLUE);
            }
        });

        greenButton.addActionListener(new ActionListener(){
          
            public void actionPerformed(ActionEvent e){
                greenButton.setBackground(Color.GREEN);
            }
        });

        frame.add(redButton);
        frame.add(blueButton);
        frame.add(greenButton);
        frame.setLayout(new FlowLayout());

        frame.setVisible(true);
    }
}