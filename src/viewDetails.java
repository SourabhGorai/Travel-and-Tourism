import javax.swing.*;
import javax.swing.border.LineBorder;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class viewDetails extends JFrame implements ActionListener {

    String usrn;
    String[] s = new String[9];
    JButton exit;

    viewDetails(String usrn) {

        this.usrn = usrn;

        setTitle("View Personal Details");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(240, 100, 800, 580);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** IMAGE

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(90, 390, 600, 180);
        add(img);

        // ***************************************************** JLabel

        JLabel text = new JLabel("View Customer Details");
        text.setBounds(280, 30, 350, 30);
        text.setForeground(new Color(204, 0, 102));
        // text1.setForeground(new Color(255, 51, 255));
        text.setFont(new Font("Raleway", Font.BOLD, 22));
        add(text);

        JLabel username1 = new JLabel("Username : ");
        username1.setBounds(50, 100, 150, 30);
        username1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        username1.setForeground(new Color(0, 128, 255));
        add(username1);

        JLabel id1 = new JLabel("ID : ");
        id1.setBounds(50, 150, 150, 30);
        id1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        id1.setForeground(new Color(0, 128, 255));
        add(id1);

        JLabel id_num = new JLabel("Id Number : ");
        id_num.setBounds(50, 200, 150, 30);
        id_num.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        id_num.setForeground(new Color(0, 128, 255));
        add(id_num);

        JLabel name1 = new JLabel("Name : ");
        name1.setBounds(50, 250, 150, 30);
        name1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        name1.setForeground(new Color(0, 128, 255));
        add(name1);

        JLabel gender1 = new JLabel("Gender : ");
        gender1.setBounds(50, 300, 150, 30);
        gender1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        gender1.setForeground(new Color(0, 128, 255));
        add(gender1);

        JLabel country1 = new JLabel("Country : ");
        country1.setBounds(400, 100, 150, 30);
        country1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        country1.setForeground(new Color(0, 128, 255));
        add(country1);

        JLabel add1 = new JLabel("Address : ");
        add1.setBounds(400, 150, 150, 30);
        add1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        add1.setForeground(new Color(0, 128, 255));
        add(add1);

        JLabel phone1 = new JLabel("Phone Number : ");
        phone1.setBounds(400, 200, 150, 30);
        phone1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        phone1.setForeground(new Color(0, 128, 255));
        add(phone1);

        JLabel email1 = new JLabel("Email-Id : ");
        email1.setBounds(400, 250, 150, 30);
        email1.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        email1.setForeground(new Color(0, 128, 255));
        add(email1);

        // *****************************************************

        try {

            String query1 = "SELECT * FROM  add_cus where username ='" + usrn + "';";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query1);
            ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Iterate over the result set
            while (rs.next()) {
                // Iterate over columns
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object columnValue = rs.getObject(columnName);

                    // Process the retrieved values as needed
                    // System.out.println(columnName + ": " + columnValue);
                    s[i - 1] = (String) columnValue;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        // *****************************************************

        JLabel username2 = new JLabel(s[0]);
        username2.setBounds(180, 100, 150, 30);
        username2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        username2.setForeground(new Color(255, 153, 51));
        add(username2);

        JLabel id2 = new JLabel(s[1]);
        id2.setBounds(180, 150, 150, 30);
        id2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        id2.setForeground(new Color(255, 153, 51));
        add(id2);

        JLabel id_nu2 = new JLabel(s[2]);
        id_nu2.setBounds(180, 200, 150, 30);
        id_nu2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        id_nu2.setForeground(new Color(255, 153, 51));
        add(id_nu2);

        JLabel name2 = new JLabel(s[3]);
        name2.setBounds(180, 250, 150, 30);
        name2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        name2.setForeground(new Color(255, 153, 51));
        add(name2);

        JLabel gender2 = new JLabel(s[4]);
        gender2.setBounds(180, 300, 150, 30);
        gender2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        gender2.setForeground(new Color(255, 153, 51));
        add(gender2);

        JLabel country2 = new JLabel(s[5]);
        country2.setBounds(570, 100, 150, 30);
        country2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        country2.setForeground(new Color(255, 153, 51));
        add(country2);

        JLabel add2 = new JLabel(s[6]);
        add2.setBounds(570, 150, 200, 30);
        add2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        add2.setForeground(new Color(255, 153, 51));
        add(add2);

        JLabel phone2 = new JLabel(s[7]);
        phone2.setBounds(570, 200, 250, 30);
        phone2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        phone2.setForeground(new Color(255, 153, 51));
        add(phone2);

        JLabel email2 = new JLabel(s[8]);
        email2.setBounds(570, 250, 250, 30);
        email2.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        email2.setForeground(new Color(255, 153, 51));
        add(email2);

        // *****************************************************

        exit = new JButton("Exit");
        exit.setBounds(330, 350, 120, 25);
        exit.setFocusable(false);
        exit.setFont(new Font("Osward", Font.BOLD, 15));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setForeground(new Color(255, 255, 255));
        exit.setBackground(new Color(255, 102, 102));
        exit.addActionListener(this);
        add(exit);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new viewDetails("admin");
    }

}
