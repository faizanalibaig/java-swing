import javax.swing.*;
import java.awt.*;

class showroom extends JFrame{
    public showroom(){
        System.out.println("Hello");

        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 500);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JButton button = new JButton("Click here");
        button.setFont(new Font("Arial", Font.BOLD, 12));
        button.setBackground(Color.BLACK);
        panel.add(button);

        frame.add(panel);
    }
}

public class Main {
    public static void main(String[] args) {
      showroom sr= new showroom();
    }
}