import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.border.*;

public class update_Cus1 extends JFrame implements ActionListener {

    String usrn, name1;
    JTextField number_field, country_field, ph_field, add_field, email_field;
    JRadioButton male, female, others;
    ButtonGroup bg1;
    JComboBox idBox;
    JButton add_Customer, back;

    update_Cus1(String usrn) {

        this.usrn = usrn;

        setTitle("Update Personal Details");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(180, 130, 900, 580);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** ImageIcon

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/updatecus.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 100, 300, 300);
        add(image);

        // ***************************************************** JLabel

        JLabel text = new JLabel("Update Personal Details");
        text.setBounds(120, 30, 200, 20);
        text.setFont(new Font("Raleway", Font.BOLD, 20));
        add(text);

        JLabel username = new JLabel("Username");
        username.setBounds(50, 80, 150, 20);
        username.setFont(new Font("Raleway", Font.PLAIN, 17));
        add(username);

        JLabel id = new JLabel("ID : ");
        id.setBounds(50, 120, 150, 20);
        id.setFont(new Font("Raleway", Font.PLAIN, 17));
        add(id);

        JLabel num = new JLabel("Number : ");
        num.setBounds(50, 160, 150, 20);
        num.setFont(new Font("Raleway", Font.PLAIN, 17));
        add(num);

        JLabel name = new JLabel("Name :");
        name.setBounds(50, 200, 150, 20);
        name.setFont(new Font("Raleway", Font.PLAIN, 17));
        add(name);

        JLabel gender = new JLabel("Gender :");
        gender.setBounds(50, 240, 150, 20);
        gender.setFont(new Font("Raleway", Font.PLAIN, 17));
        add(gender);

        JLabel country = new JLabel("Country :");
        country.setBounds(50, 280, 150, 20);
        country.setFont(new Font("Raleway", Font.PLAIN, 17));
        add(country);

        JLabel add = new JLabel("Address");
        add.setBounds(50, 320, 180, 20);
        add.setFont(new Font("Raleway", Font.PLAIN, 17));
        add(add);

        JLabel ph_no = new JLabel("Phone Number :");
        ph_no.setBounds(50, 360, 180, 20);
        ph_no.setFont(new Font("Raleway", Font.PLAIN, 17));
        add(ph_no);

        JLabel email = new JLabel("Email :");
        email.setBounds(50, 400, 150, 20);
        email.setFont(new Font("Raleway", Font.PLAIN, 17));
        add(email);

        try {

            Conn c = new Conn();
            String query1 = "SELECT * FROM cus_details where username = '" + usrn + "';";
            ResultSet rs = c.s.executeQuery(query1);
            if (rs.next()) {
                name1 = rs.getString("name");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        JLabel text1 = new JLabel(name1);
        text1.setBounds(220, 200, 205, 25);
        text1.setForeground(new Color(0, 204, 0));
        text1.setFont(new Font("Raleway", Font.BOLD, 15));
        add(text1);

        JLabel text2 = new JLabel(usrn);
        text2.setBounds(220, 80, 205, 25);
        text2.setForeground(new Color(0, 204, 0));
        text2.setFont(new Font("Raleway", Font.BOLD, 15));
        add(text2);

        // ********************************************************* JComboBox

        String idVal[] = { "Aadhar Card", "Passport", "Driving Liscence", "Voter ID Card", "Ration Card" };
        idBox = new JComboBox(idVal);
        idBox.setBounds(220, 120, 205, 25);
        idBox.setFont(new Font("Raleway", Font.PLAIN, 13));
        idBox.setSelectedItem(null);
        idBox.setBackground(Color.WHITE);
        idBox.setBorder(BorderFactory.createEmptyBorder());
        add(idBox);

        // ********************************************************* JTextField

        number_field = new JTextField();
        number_field.setBounds(220, 160, 205, 25);
        number_field.setBorder(BorderFactory.createEtchedBorder());
        number_field.setFont(new Font("Raleway", Font.PLAIN, 14));
        number_field.setForeground(new Color(0, 204, 0));
        add(number_field);

        country_field = new JTextField();
        country_field.setBounds(220, 280, 205, 25);
        country_field.setBorder(BorderFactory.createEtchedBorder());
        country_field.setFont(new Font("Raleway", Font.PLAIN, 14));
        country_field.setForeground(new Color(0, 204, 0));
        add(country_field);

        ph_field = new JTextField();
        ph_field.setBounds(220, 360, 205, 25);
        ph_field.setBorder(BorderFactory.createEtchedBorder());
        ph_field.setFont(new Font("Raleway", Font.PLAIN, 14));
        ph_field.setForeground(new Color(0, 204, 0));
        add(ph_field);

        add_field = new JTextField();
        add_field.setBounds(220, 320, 205, 25);
        add_field.setBorder(BorderFactory.createEtchedBorder());
        add_field.setFont(new Font("Raleway", Font.PLAIN, 14));
        add_field.setForeground(new Color(0, 204, 0));
        add(add_field);

        email_field = new JTextField();
        email_field.setBounds(220, 400, 205, 25);
        email_field.setBorder(BorderFactory.createEtchedBorder());
        email_field.setFont(new Font("Raleway", Font.PLAIN, 14));
        email_field.setForeground(new Color(0, 204, 0));
        add(email_field);

        // ********************************************************* JRadioButton

        male = new JRadioButton("Male");
        male.setBounds(215, 240, 60, 25);
        male.setFont(new Font("Osward", Font.BOLD, 13));
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(280, 240, 70, 25);
        female.setFont(new Font("Osward", Font.BOLD, 13));
        female.setBackground(Color.WHITE);
        add(female);

        others = new JRadioButton("Others");
        others.setBounds(355, 240, 70, 25);
        others.setFont(new Font("Osward", Font.BOLD, 13));
        others.setBackground(Color.WHITE);
        add(others);

        bg1 = new ButtonGroup();
        bg1.add(male);
        bg1.add(female);
        bg1.add(others);

        // ********************************************************* JButton

        back = new JButton("Exit");
        back.setBounds(70, 470, 150, 30);
        back.setFocusable(false);
        back.setFont(new Font("Osward", Font.BOLD, 15));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setForeground(new Color(255, 255, 255));
        back.setBackground(new Color(255, 102, 102));
        back.addActionListener(this);
        add(back);

        add_Customer = new JButton("Update");
        add_Customer.setBounds(255, 470, 150, 30);
        add_Customer.setFocusable(false);
        add_Customer.setFont(new Font("Osward", Font.BOLD, 14));
        add_Customer.setBorder(BorderFactory.createEmptyBorder());
        add_Customer.setForeground(new Color(0, 153, 76));
        add_Customer.setBackground(new Color(102, 255, 178));
        add_Customer.addActionListener(this);
        add(add_Customer);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == back) {

            setVisible(false);
            // new dashboard(usrn);

        } else if (ae.getSource() == add_Customer) {

            String query2 = "SELECT * FROM add_cus where username = '" + usrn + "';";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query2);

                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "Customer Does Not Exist");
                } else {

                    String id = (String) idBox.getSelectedItem();
                    String id_num = number_field.getText();
                    String country = country_field.getText();
                    String address = add_field.getText();
                    String phone = ph_field.getText();
                    String email = email_field.getText();
                    String gender = "";
                    if (male.isSelected()) {
                        gender = "Male";
                    } else if (female.isSelected()) {
                        gender = "Female";
                    } else {
                        gender = "Others";
                    }

                    if (id == null || id.equals("")) {
                        JOptionPane.showMessageDialog(null, "ID not Selected");
                    } else if (id_num.equals("")) {
                        JOptionPane.showMessageDialog(null, "ID Number is Required");
                    } else if (country.equals("")) {
                        JOptionPane.showMessageDialog(null, "Country is Required");
                    } else if (gender.equals("")) {
                        JOptionPane.showMessageDialog(null, "Gender is Required");
                    } else if (address.equals("")) {
                        JOptionPane.showMessageDialog(null, "Address is Required");
                    } else if (phone.equals("")) {
                        JOptionPane.showMessageDialog(null, "Phone Number is required");
                    } else if (email.equals("")) {
                        JOptionPane.showMessageDialog(null, "Email-id Required");
                    } else if (phone.length() < 10) {
                        JOptionPane.showMessageDialog(null, "Phone Number is incorrect");
                    } else {

                        String query1 = "Update add_cus set id = '" + id + "', id_num = '" + id_num + "',gender = '"
                                + gender + "', country='" + country + "', address ='" + address + "', phone = '" + phone
                                + "', email ='" + email
                                + "' where username = '" + usrn + "';";

                        try {

                            // Conn c = new Conn();
                            c.s.executeUpdate(query1);
                            // JOptionPane.showConfirmDialog(null,"Customer added Successfully");
                            JOptionPane.showMessageDialog(null, "Update Successfully");

                        } catch (Exception e) {
                            System.out.println(e);
                        }

                    }

                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) {
        new update_Cus1("sourabh_gorai");
    }

}