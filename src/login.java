import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.border.*;

public class login extends JFrame implements ActionListener {

    JTextField usrnField;
    JPasswordField passField;
    JButton loginButton, signupButton, FPButton, showButton;
    int flag = 0;

    login() {

        setTitle("Login");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(200, 180, 880, 430);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** Layouts

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(204, 229, 255));
        // p1.setBackground(new Color(153,204,255));
        p1.setBounds(0, 0, 375, 480);
        p1.setLayout(null);
        add(p1);

        JPanel p2 = new JPanel();
        // p2.setBackground(new Color(224,224,224));
        p2.setLayout(null);
        p2.setBounds(375, 30, 455, 327);
        add(p2);

        // ***************************************************** IMAGE

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login2.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(40, 40, 300, 300);
        p1.add(img);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/show.png"));
        Image i5 = i4.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);

        showButton = new JButton(i6);
        showButton.setFocusable(false);
        showButton.setBorder(new LineBorder(new Color(51, 153, 255)));
        showButton.setBounds(370, 140, 30, 30);
        showButton.addActionListener(this);
        p2.add(showButton);

        // ***************************************************** JLabel

        JLabel username = new JLabel("Username");
        username.setBounds(50, 20, 150, 30);
        username.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        p2.add(username);

        JLabel password = new JLabel("Password");
        password.setBounds(50, 100, 150, 30);
        password.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        p2.add(password);

        // ***************************************************** JTextField

        usrnField = new JTextField();
        usrnField.setFont(new Font("Raleway", Font.PLAIN, 19));
        usrnField.setBorder(BorderFactory.createEtchedBorder());
        usrnField.setBounds(50, 60, 350, 30);
        p2.add(usrnField);

        // ***************************************************** JPasswordField

        passField = new JPasswordField();
        passField.setFont(new Font("Raleway", Font.PLAIN, 25));
        passField.setBorder(BorderFactory.createEtchedBorder());
        passField.setBounds(50, 140, 320, 30);
        Font font = new Font("Arial", Font.BOLD, 19); // Example font
        passField.setFont(font);
        passField.setEchoChar('*');
        p2.add(passField);

        // ***************************************************** JButton

        loginButton = new JButton("Login");
        loginButton.setFocusable(false);
        loginButton.setBorder(new LineBorder(new Color(51, 153, 255)));
        loginButton.setForeground(new Color(255, 255, 255));
        loginButton.setBackground(new Color(102, 178, 255));
        loginButton.setFont(new Font("Raleway", Font.BOLD, 18));
        loginButton.setBounds(50, 200, 150, 33);
        loginButton.addActionListener(this);
        p2.add(loginButton);

        signupButton = new JButton("Sign Up");
        signupButton.setFocusable(false);
        signupButton.setBorder(new LineBorder(new Color(51, 153, 255)));
        signupButton.setForeground(new Color(255, 255, 255));
        signupButton.setBackground(new Color(102, 178, 255));
        signupButton.setFont(new Font("Raleway", Font.BOLD, 18));
        signupButton.setBounds(250, 200, 150, 33);
        signupButton.addActionListener(this);
        p2.add(signupButton);

        FPButton = new JButton("Forgot Password");
        FPButton.setFocusable(false);
        FPButton.setBorder(new LineBorder(new Color(133, 193, 233)));
        FPButton.setForeground(new Color(102, 178, 255));
        FPButton.setBackground(new Color(255, 255, 255));
        FPButton.setFont(new Font("Raleway", Font.BOLD, 18));
        FPButton.setBounds(135, 260, 180, 33);
        FPButton.addActionListener(this);
        p2.add(FPButton);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signupButton) {

            setVisible(false);
            new signup().setVisible(true);

        } else if (ae.getSource() == loginButton) {

            String usrn = usrnField.getText();
            String pass = passField.getText();
            try {

                Conn c = new Conn();
                String query1 = "SELECT * FROM cus_details where username ='" + usrn + "' AND pass = '" + pass + "';";
                ResultSet rs = c.s.executeQuery(query1);
                if (rs.next()) {

                    setVisible(false);
                    new loading(usrn).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Username of Password is Incorrect");
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == FPButton) {
            setVisible(false);
            new forgot_pass().setVisible(true);

        } else if (ae.getSource() == showButton) {

            if (flag == 0) {
                passField.setEchoChar((char) 0);
                flag = 1;
            } else {
                passField.setEchoChar('*');
                flag = 0;
            }

        }

    }

    public static void main(String[] args) {
        new login();
    }

}
