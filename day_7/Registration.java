import javax.swing.*;
import java.awt.event.*;
//Adding Password Field, Submit Button, and Handling Input
public class Registration{
    public static void main(String[] args){
        JFrame frm = new JFrame("Registration form");
        frm.setSize(500,500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(null);

        //Name Label and TextField
        JLabel name = new JLabel("Name: ");
        name.setBounds(50, 50, 90, 60);
        frm.add(name);

        JTextField namef = new JTextField();
        namef.setBounds(90, 70, 90, 25);
        frm.add(namef);

        //Email and Textfield
        JLabel email = new JLabel("Email: ");
        email.setBounds(50, 90, 80, 60);
        frm.add(email);

        JTextField emailf = new JTextField();
        emailf.setBounds(90, 110, 90, 25);
        frm.add(emailf);

        //Password Label and PasswordField
        JLabel pass = new JLabel("Password: ");
        pass.setBounds(50, 150, 80, 25);
        frm.add(pass);

        JPasswordField passf = new JPasswordField();
        passf.setBounds(110, 150, 200, 25);
        frm.add(passf);

        //submit button
        JButton submit = new JButton("Submit: ");
        submit.setBounds(140, 180, 100, 30);
        frm.add(submit);

        //Adding action listner to handle button click
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //get text from fields
                String name = namef.getText();
                String email = emailf.getText();
                String pass = new String(passf.getPassword());

                //For demonstration,show input in a dialog box
                JOptionPane.showMessageDialog(frm, "Name: " + name + "\nEmail: " + email + "\nPassword: " + pass, "Registration", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        );

        frm.setVisible(true);
    }
}