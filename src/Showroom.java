import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class showroom extends JFrame{
    public showroom(){

        JFrame frame= new JFrame("main application");

        //basic frame settings
        frame.setSize(450, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

//        Border border = BorderFactory.createLineBorder(Color.black, 3);

        /*
        fav icon setup and added to frame
        ImageIcon image = new ImageIcon("./images.png");
        frame.setIconImage(image.getImage());


        change background color of application
         frame.getContentPane().setBackground(Color.GREEN);
        frame.getContentPane().setBackground( new Color(123, 50 ,250));
        */

        /*
        JLabel setup

        JLabel label= new JLabel();
        label.setText("Bro, do you even code?");
        label.setFont(new Font("Serif", Font.PLAIN, 20));
        label.setBorder(border);
        label.setBackground(Color.LIGHT_GRAY);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 250);

        frame.add(label);
        */

        /*
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0, 250, 250);
        redpanel.setLayout(new BorderLayout());

        JLabel rdl= new JLabel();
        rdl.setText("red");
        rdl.setFont(new Font("Serif", Font.PLAIN, 20));
        rdl.setVerticalAlignment(JLabel.CENTER);
        rdl.setHorizontalAlignment(JLabel.CENTER);
        redpanel.add(rdl);


        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0, 250, 250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250, 500, 500);

        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);

         */

        // Panel 1: Display Panel for Timer
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 450, 400);
        panel1.setLayout(null); // For custom layout

        JLabel label = new JLabel("00:00:00");
        label.setFont(new Font("Serif", Font.BOLD, 36));
        label.setBounds(0, 170, 450, 60); // Centered position in the panel
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel1.add(label);

        // Panel 2: Control Panel for Buttons
        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 400, 450, 100);
        panel2.setBackground(new Color(230, 230, 250)); // Light Lavender background
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));

        JButton btn1 = new JButton("Start");
        btn1.setPreferredSize(new Dimension(120, 60));
        btn1.setBackground(new Color(144, 238, 144)); // Light Green

        JButton btn2 = new JButton("Stop");
        btn2.setPreferredSize(new Dimension(120, 60));
        btn2.setBackground(new Color(255, 182, 193)); // Light Pink

        JButton btn3 = new JButton("Restart");
        btn3.setPreferredSize(new Dimension(120, 60));
        btn3.setBackground(new Color(135, 206, 250)); // Light Blue

        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);

        // Add panels to frame
        frame.add(panel1);
        frame.add(panel2);




    }
}