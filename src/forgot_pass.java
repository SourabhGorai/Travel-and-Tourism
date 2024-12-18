
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class forgot_pass extends JFrame implements ActionListener {

    JTextField usrn_Field, name_Field, ans_Field, ques_Field;
    JPasswordField pass_Field;
    JButton check_Button, retrive_Button, back_Button, update_Button, showButton;
    int flag11 = 0;
    JPanel p1;
    JLabel text;

    forgot_pass() {

        setTitle("Forgot Password");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(220, 180, 850, 430);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(new Color(255, 255, 255));
        // getContentPane().setBackground(new Color( 255,204,255));

        // ***************************************************** Layouts

        p1 = new JPanel();
        // p1.setBackground(new Color(255, 255, 255));
        // p1.setBackground(new Color( 255,204,255));
        // p1.setBackground(new Color(153,204,255));
        p1.setBounds(30, 40, 500, 320);
        p1.setLayout(null);
        add(p1);

        // ***************************************************** IMAGE

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fp.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(535, 50, 300, 300);
        add(img);

        // ***************************************************** JLabel

        JLabel username = new JLabel("Username");
        username.setBounds(20, 20, 150, 30);
        username.setForeground(new Color(255, 51, 255));
        username.setFont(new Font("Raleway", Font.BOLD, 18));
        p1.add(username);

        JLabel name = new JLabel("Name");
        name.setBounds(20, 70, 150, 30);
        name.setForeground(new Color(255, 51, 255));
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        p1.add(name);

        JLabel SQ = new JLabel("Security Ques.");
        SQ.setBounds(20, 120, 150, 30);
        SQ.setForeground(new Color(255, 51, 255));
        SQ.setFont(new Font("Raleway", Font.BOLD, 18));
        p1.add(SQ);

        JLabel ans = new JLabel("Answer");
        ans.setBounds(20, 170, 150, 30);
        ans.setForeground(new Color(255, 51, 255));
        ans.setFont(new Font("Raleway", Font.BOLD, 18));
        p1.add(ans);

        // ***************************************************** JTextField

        usrn_Field = new JTextField();
        usrn_Field.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        usrn_Field.setBorder(new LineBorder(new Color(255, 178, 102)));
        usrn_Field.setBounds(180, 20, 180, 27);
        p1.add(usrn_Field);

        name_Field = new JTextField();
        name_Field.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        name_Field.setBorder(new LineBorder(new Color(255, 178, 102)));
        name_Field.setBounds(180, 70, 180, 27);
        p1.add(name_Field);

        ques_Field = new JTextField();
        ques_Field.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        ques_Field.setBorder(new LineBorder(new Color(255, 178, 102)));
        ques_Field.setBounds(180, 120, 180, 27);
        p1.add(ques_Field);

        ans_Field = new JTextField();
        ans_Field.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        ans_Field.setBorder(new LineBorder(new Color(255, 178, 102)));
        ans_Field.setBounds(180, 170, 180, 27);
        p1.add(ans_Field);

        // ***************************************************** JButton

        check_Button = new JButton("Check");
        check_Button.setFocusable(false);
        check_Button.setBorder(new LineBorder(new Color(255, 178, 102)));
        check_Button.setForeground(new Color(102, 178, 255));
        check_Button.setBackground(new Color(255, 255, 255));
        check_Button.setFont(new Font("Raleway", Font.BOLD, 16));
        check_Button.setBounds(380, 20, 100, 27);
        check_Button.addActionListener(this);
        p1.add(check_Button);

        retrive_Button = new JButton("Match");
        retrive_Button.setFocusable(false);
        retrive_Button.setBorder(new LineBorder(new Color(255, 178, 102)));
        retrive_Button.setForeground(new Color(102, 178, 255));
        retrive_Button.setBackground(new Color(255, 255, 255));
        retrive_Button.setFont(new Font("Raleway", Font.BOLD, 16));
        retrive_Button.setBounds(380, 170, 100, 27);
        retrive_Button.addActionListener(this);
        p1.add(retrive_Button);

        back_Button = new JButton("Back");
        back_Button.setFocusable(false);
        back_Button.setBorder(new LineBorder(new Color(255, 178, 102)));
        back_Button.setForeground(new Color(102, 178, 255));
        back_Button.setBackground(new Color(255, 255, 255));
        back_Button.setFont(new Font("Raleway", Font.BOLD, 16));
        back_Button.setBounds(380, 270, 100, 27);
        back_Button.addActionListener(this);
        p1.add(back_Button);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {

        String usrn = usrn_Field.getText();
        // String pass = pass_Field.getText();
        // String sqans = ans_Field.getText();

        if (ae.getSource() == check_Button) {

            if (text != null) {
                p1.remove(text);
                revalidate();
                repaint();
            }

            if (usrn.equals("")) {
                JOptionPane.showMessageDialog(null, "Username not entered");
            } else {

                try {

                    String query1 = "Select * from cus_details where username = '" + usrn + "';";
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(query1);
                    if (rs.next()) {

                        name_Field.setText(rs.getString("name"));
                        ques_Field.setText(rs.getString("sec_Q"));

                    } else {

                        text = new JLabel("Username does not exist");
                        text.setBounds(20, 220, 480, 30);
                        text.setForeground(new Color(255, 0, 0));
                        text.setFont(new Font("Raleway", Font.BOLD, 16));
                        p1.add(text);

                        usrn_Field.setText("");

                        revalidate();
                        repaint();
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        } else if (ae.getSource() == retrive_Button) {

            String match = ans_Field.getText();

            // System.out.println("hello");
            if (text != null) {
                p1.remove(text);
                revalidate();
                repaint();
            }

            String query2 = "SELECT * FROM cus_details where username = '" + usrn + "' AND sec_ans = '"
                    + match + "';";
            try {
                Conn c = new Conn();
                ResultSet rs2 = c.s.executeQuery(query2);
                if (rs2.next()) {

                    JLabel password = new JLabel("New Password");
                    password.setBounds(20, 220, 150, 30);
                    password.setForeground(new Color(255, 51, 255));
                    password.setFont(new Font("Raleway", Font.BOLD, 18));
                    p1.add(password);

                    pass_Field = new JPasswordField();
                    pass_Field.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
                    pass_Field.setBorder(new LineBorder(new Color(255, 178, 102)));
                    pass_Field.setBounds(180, 220, 153, 27);
                    pass_Field.setEchoChar('*');
                    p1.add(pass_Field);

                    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/show.png"));
                    Image i5 = i4.getImage().getScaledInstance(27, 27, Image.SCALE_DEFAULT);
                    ImageIcon i6 = new ImageIcon(i5);

                    showButton = new JButton(i6);
                    showButton.setFocusable(false);
                    showButton.setBorder(new LineBorder(new Color(51, 153, 255)));
                    showButton.setBounds(333, 220, 27, 27);
                    showButton.addActionListener(this);
                    p1.add(showButton);

                    update_Button = new JButton("Update");
                    update_Button.setFocusable(false);
                    update_Button.setBorder(new LineBorder(new Color(255, 178, 102)));
                    update_Button.setForeground(new Color(102, 178, 255));
                    update_Button.setBackground(new Color(255, 255, 255));
                    update_Button.setFont(new Font("Raleway", Font.BOLD, 16));
                    update_Button.setBounds(380, 220, 100, 27);
                    update_Button.addActionListener(this);
                    p1.add(update_Button);

                    revalidate();
                    repaint();

                } else {

                    text = new JLabel("Security Answer is wrong");
                    text.setBounds(20, 220, 480, 30);
                    text.setForeground(new Color(255, 0, 0));
                    text.setFont(new Font("Raleway", Font.BOLD, 16));
                    p1.add(text);

                    ans_Field.setText("");

                    revalidate();
                    repaint();
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == update_Button) {

            String np = pass_Field.getText();

            if (np.equals("")) {
                JOptionPane.showMessageDialog(null, "Password is required");
            } else if (np.length() < 8) {
                JOptionPane.showMessageDialog(null,
                        "Password length must be greater than or euqals to 8");
            } else {
                String query3 = "UPDATE cus_details SET pass = '" + np + "' where username = '"
                        + usrn
                        + "';";
                try {
                    Conn c = new Conn();
                    c.s.executeUpdate(query3);

                    usrn_Field.setText("");
                    name_Field.setText("");
                    ques_Field.setText("");
                    ans_Field.setText("");
                    pass_Field.setText("");

                    JOptionPane.showMessageDialog(null, "Update Successfull");

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == back_Button) {
            setVisible(false);
            new login().setVisible(true);
        } else if (ae.getSource() == showButton) {

            if (flag11 == 0) {
                pass_Field.setEchoChar((char) 0);
                flag11 = 1;
            } else {
                pass_Field.setEchoChar('*');
                flag11 = 0;
            }

        }

    }

    public static void main(String[] args) {
        new forgot_pass();
    }

}
