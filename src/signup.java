
// import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.border.*;

public class signup extends JFrame implements ActionListener {

    JTextField usrn_Field, name_Field, ans_Field;
    JPasswordField pass_FIeld;
    Choice SQ_Choice;
    JButton create_Button, back_Button, showButton;
    int flag = 0;

    signup() {

        setTitle("Sign Up");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(200, 180, 900, 410);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(new Color(255, 255, 255));
        // getContentPane().setBackground(new Color( 255,204,255));

        // ***************************************************** Layouts

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255, 255, 255));
        // p1.setBackground(new Color( 255,204,255));
        // p1.setBackground(new Color(153,204,255));
        p1.setBounds(530, 30, 370, 327);
        p1.setLayout(null);
        add(p1);

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(255, 102, 102));
        p2.setLayout(null);
        p2.setBounds(0, 0, 530, 480);
        add(p2);

        // ***************************************************** IMAGE

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup2.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(80, 50, 200, 200);
        p1.add(img);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/show.png"));
        Image i5 = i4.getImage().getScaledInstance(27, 27, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);

        showButton = new JButton(i6);
        showButton.setFocusable(false);
        showButton.setBorder(new LineBorder(new Color(51, 153, 255)));
        showButton.setBounds(423, 130, 27, 27);
        showButton.addActionListener(this);
        p2.add(showButton);

        // ***************************************************** JLabel

        JLabel username = new JLabel("Username");
        username.setBounds(50, 30, 150, 30);
        username.setForeground(Color.WHITE);
        username.setFont(new Font("Raleway", Font.BOLD, 18));
        p2.add(username);

        JLabel name = new JLabel("Name");
        name.setBounds(50, 80, 150, 30);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        p2.add(name);

        JLabel password = new JLabel("Password");
        password.setBounds(50, 130, 150, 30);
        password.setForeground(Color.WHITE);
        password.setFont(new Font("Raleway", Font.BOLD, 18));
        p2.add(password);

        JLabel SQ = new JLabel("Security Ques.");
        SQ.setBounds(50, 180, 150, 30);
        SQ.setForeground(Color.WHITE);
        SQ.setFont(new Font("Raleway", Font.BOLD, 18));
        p2.add(SQ);

        JLabel ans = new JLabel("Answer");
        ans.setBounds(50, 230, 150, 30);
        ans.setForeground(Color.WHITE);
        ans.setFont(new Font("Raleway", Font.BOLD, 18));
        p2.add(ans);

        // ***************************************************** JTextField

        usrn_Field = new JTextField();
        usrn_Field.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        usrn_Field.setBorder(new LineBorder(new Color(255, 178, 102)));
        usrn_Field.setBounds(230, 30, 220, 27);
        p2.add(usrn_Field);

        name_Field = new JTextField();
        name_Field.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        name_Field.setBorder(new LineBorder(new Color(255, 178, 102)));
        name_Field.setBounds(230, 80, 220, 27);
        p2.add(name_Field);

        pass_FIeld = new JPasswordField();
        pass_FIeld.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        pass_FIeld.setBorder(new LineBorder(new Color(255, 178, 102)));
        pass_FIeld.setBounds(230, 130, 193, 27);
        pass_FIeld.setEchoChar('*');
        p2.add(pass_FIeld);

        ans_Field = new JTextField();
        ans_Field.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        ans_Field.setBorder(new LineBorder(new Color(255, 178, 102)));
        ans_Field.setBounds(230, 230, 220, 27);
        p2.add(ans_Field);

        // ***************************************************** JButton

        create_Button = new JButton("Create");
        create_Button.setFocusable(false);
        create_Button.setBorder(new LineBorder(new Color(255, 178, 102)));
        // create_Button.setForeground(new Color(255, 102, 102));
        create_Button.setBackground(new Color(255, 255, 255));
        create_Button.setFont(new Font("Raleway", Font.BOLD, 18));
        create_Button.setBounds(70, 300, 150, 33);
        create_Button.addActionListener(this);
        p2.add(create_Button);

        back_Button = new JButton("Back");
        back_Button.setFocusable(false);
        back_Button.setBorder(new LineBorder(new Color(255, 178, 102)));
        // back_Button.setForeground(new Color(255, 102, 102));
        back_Button.setBackground(new Color(255, 255, 255));
        back_Button.setFont(new Font("Raleway", Font.BOLD, 18));
        back_Button.setBounds(280, 300, 150, 33);
        back_Button.addActionListener(this);
        p2.add(back_Button);

        // ***************************************************** Choice

        SQ_Choice = new Choice();
        SQ_Choice.add("");
        SQ_Choice.add("Your fav Cartoon");
        SQ_Choice.add("Your Lucky Number");
        SQ_Choice.add("Your neighbour''s pet name");
        SQ_Choice.add("Your fav Marvel Character");
        SQ_Choice.setBounds(230, 185, 220, 50);
        SQ_Choice.setFont(new Font("Osward", Font.PLAIN, 16));
        p2.add(SQ_Choice);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back_Button) {
            setVisible(false);
            new login().setVisible(true);
            ;
        }

        if (ae.getSource() == create_Button) {

            String usrn = usrn_Field.getText();
            String name = name_Field.getText();
            String pass = pass_FIeld.getText();
            String sq = SQ_Choice.getSelectedItem();
            String sans = ans_Field.getText();
            int flag=0;

            if(usrn.contains(" ")){
                flag = 1;
            }
            

            if (usrn.equals("")) {
                JOptionPane.showMessageDialog(null, "Username is required");
            } else if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else if (pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Password is required");
            } else if (pass.length() < 8) {
                JOptionPane.showMessageDialog(null, "Password length must be greater than or euqals to 8");
            } else if (sans.equals("")) {
                JOptionPane.showMessageDialog(null, "Security Answer is required");
            } else if (flag == 1){
                JOptionPane.showMessageDialog(null, "Username should not contain blank space");
            } else {

                try {

                    Conn c = new Conn();

                    String query2 = "SELECT * FROM cus_details WHERE username = '" + usrn + "';";
                    ResultSet rs = c.s.executeQuery(query2);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Username already Taken");
                    } else {

                        // String query1 = "INSERT INTO cus_details VALUES
                        // ('usrn','name','pass','sq','sans');";

                        String query1 = "INSERT INTO cus_details VALUES ('" + usrn + "','" + name + "','" + pass + "','"
                                + sq + "','" + sans + "');";

                        c.s.executeUpdate(query1);

                        JOptionPane.showMessageDialog(null, "Signup Successfull");

                        usrn_Field.setText("");
                        name_Field.setText("");
                        pass_FIeld.setText("");
                        ans_Field.setText("");

                    }

                } catch (Exception e) {
                    // e.printStackTrace();
                    System.out.println(e);
                }

            }

        }else if (ae.getSource() == showButton) {

            if (flag == 0) {
                pass_FIeld.setEchoChar((char) 0);
                flag = 1;
            } else {
                pass_FIeld.setEchoChar('*');
                flag = 0;
            }

        }
    }

    public static void main(String[] args) {
        new signup();
    }

}
