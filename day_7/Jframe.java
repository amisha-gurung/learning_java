import javax.swing.*;
//Adding Labels and Text Fields
public class Jframe{
    public static void main(String[] args){
        JFrame frame = new JFrame("Registration Form"); //creating a window with title
        frame.setSize(400, 300); //setting width and height 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit when closed
        frame.setLayout(null); //Allow absolute positioning 

        //creating labels 
        JLabel name = new JLabel("Name: ");
        name.setBounds(50, 50, 80, 25); // x, y, width, height
        frame.add(name);

        JLabel email = new JLabel("Email: ");
        email.setBounds(50, 90, 80, 25);
        frame.add(email);

        //Create text fields
        JTextField nameF = new JTextField();
        nameF.setBounds(140, 50, 200, 25);
        frame.add(nameF);

        JTextField emailf = new JTextField();
        emailf.setBounds(140, 90, 200, 25);
        frame.add(emailf);

        frame.setVisible(true);

    }
}