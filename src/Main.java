import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

class showroom extends JFrame{
    public showroom(){
        JFrame frame= new JFrame("main application");


        //basic frame settings
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("./images.png");


        //label
        JLabel label= new JLabel("Hello World");

        frame.add(label);
        frame.setIconImage(image.getImage());
    }
}

public class Main {
    public static void main(String[] args) {
      showroom sr= new showroom();
    }
}