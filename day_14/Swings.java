// We are building a minimal app: a window with two input fields and a compute si button that calculates si, showing the result in an output field
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.KeyStroke;

public class Swings {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame frm = new JFrame("Simple Interest Calculator");
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frm.setSize(420, 220);
            frm.setLocationRelativeTo(null);

            frm.setLayout(new GridLayout(5, 2, 9, 8));

            frm.add(new JLabel("Principal (P):"));
            JTextField pField = new JTextField();
            frm.add(pField);

            frm.add(new JLabel("Rate (R):"));
            JTextField rField = new JTextField();
            frm.add(rField);

            frm.add(new JLabel("Time (T, years):"));
            JTextField tField = new JTextField();
            frm.add(tField);

            JButton computeB = new JButton();
            JButton clearB = new JButton();
            frm.add(computeB);
            frm.add(clearB);

            frm.add(new JLabel("Simple Interest:"));
            JTextField siField = new JTextField();
            siField.setEditable(false);
            frm.add(siField);

            frm.getRootPane().setDefaultButton(computeB);

            Runnable doCompute = () -> {
                try{
                    double p = Double.parseDouble(pField.getText().trim());
                    double r = Double.parseDouble(rField.getText().trim());
                    double t = Double.parseDouble(pField.getText().trim());

                    if(p < 0 || r < 0 || t < 0){
                        JOptionPane.showMessageDialog(frm, "Values must be non-negative.", "Validation", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    double si = (p * r * t) / 100.0;
                    siField.setText(String.format("%.2f", si));
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(frm, "Enter valid numberic values for P, R, T.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            };

            computeB.addActionListener(e -> doCompute.run());
            clearB.addActionListener(e -> {
                pField.setText("");
                rField.setText("");
                tField.setText("");
                siField.setText("");
                pField.requestFocus();
            });

            JRootPane root = frm.getRootPane();
            String keyName = "computeAction";
            root.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ctrl ENTER"), keyName);
            root.getActionMap().put(keyName, new AbstractAction() {
                @Override public void actionPerformed(ActionEvent e){
                    doCompute.run();
                }
            });

            frm.setVisible(true);
        });
    }
}