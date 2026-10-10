import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {

    MyPanel(Color startColor) {
        super();
        setBackground(startColor);
    }
}

public class SwingAssignment {

    JFrame frame;
    JPanel panel;
    JLabel label;

    SwingAssignment() {

        frame = new JFrame();
        panel = new MyPanel(Color.LIGHT_GRAY);
        label = new JLabel("Welcome to Java Swing First Individual Assignment by Jaria Bah");
        label.setFont(new Font("Tahoma", Font.BOLD, 18));
        label.setPreferredSize(new Dimension(780, 40));
        label.setHorizontalAlignment(JLabel.CENTER);

        JButton textButton = new JButton("Change Text");
        JButton colorButton = new JButton("Change Background");

        textButton.addActionListener(e ->
                label.setText("The text has been changed!"));

        colorButton.addActionListener(e ->
                panel.setBackground(new Color((int) (Math.random() * 0x1000000))));

        panel.add(label);
        panel.add(textButton);
        panel.add(colorButton);
        frame.add(panel);

        frame.setTitle("Java Swing Assignment");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(getClass().getResource("/icon.png"));
        frame.setIconImage(icon.getImage());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingAssignment();
    }
}