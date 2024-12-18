import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class book_Package extends JFrame implements ActionListener {

    String usrn;
    JButton cp, bp, back;
    Choice sp_Choice;
    JTextField tp_Field;
    JLabel tpLabel;
    String Name = "", idType = "", number = "", phoneNo = "";

    book_Package(String usrn) {

        this.usrn = usrn;

        setTitle("Book Package");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(140, 150, 1000, 600);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** IMAGE

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/travelpic.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(450, 55, 500, 400);
        add(img);

        // ***************************************************** JLabel

        JLabel text = new JLabel("Book Package");
        text.setBounds(150, 30, 350, 30);
        text.setForeground(new Color(204, 0, 102));
        // text1.setForeground(new Color(255, 51, 255));
        text.setFont(new Font("Raleway", Font.BOLD, 22));
        add(text);

        JLabel name = new JLabel("Name ");
        name.setBounds(50, 90, 150, 30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        name.setForeground(new Color(0, 102, 204));
        add(name);

        JLabel select_P = new JLabel("Select Package ");
        select_P.setBounds(50, 140, 150, 30);
        select_P.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        select_P.setForeground(new Color(0, 102, 204));
        add(select_P);

        JLabel t_Per = new JLabel("Total Person ");
        t_Per.setBounds(50, 190, 150, 30);
        t_Per.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        t_Per.setForeground(new Color(0, 102, 204));
        add(t_Per);

        JLabel id = new JLabel("Id : ");
        id.setBounds(50, 240, 150, 30);
        id.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        id.setForeground(new Color(0, 102, 204));
        add(id);

        JLabel num = new JLabel("Number : ");
        num.setBounds(50, 290, 150, 30);
        num.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        num.setForeground(new Color(0, 102, 204));
        add(num);

        JLabel phone = new JLabel("Phone : ");
        phone.setBounds(50, 340, 150, 30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        phone.setForeground(new Color(0, 102, 204));
        add(phone);

        JLabel tp = new JLabel("Total Price : ");
        tp.setBounds(50, 390, 150, 30);
        tp.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        tp.setForeground(new Color(0, 102, 204));
        add(tp);

        // ***************************************************** Choice

        sp_Choice = new Choice();
        sp_Choice.add("Platinum Package");
        sp_Choice.add("Gold Package");
        sp_Choice.add("Silver Package");
        sp_Choice.add("Bronze Package");
        sp_Choice.setBounds(210, 145, 200, 30);
        sp_Choice.setFont(new Font("Osward", Font.PLAIN, 13));
        add(sp_Choice);

        // ***************************************************** JTextField

        tp_Field = new JTextField();
        tp_Field.setFont(new Font("Raleway", Font.PLAIN, 15));
        tp_Field.setBorder(BorderFactory.createEtchedBorder());
        tp_Field.setBounds(210, 190, 200, 27);
        add(tp_Field);

        // *****************************************************JBUTTON

        back = new JButton("Back");
        back.setBounds(50, 470, 100, 30);
        back.setFocusable(false);
        back.setFont(new Font("Osward", Font.BOLD, 16));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBackground(new Color(255, 0, 0));
        back.setForeground(new Color(255, 225, 255));
        back.addActionListener(this);
        add(back);

        cp = new JButton("Check Price");
        cp.setBounds(170, 470, 100, 30);
        cp.setFocusable(false);
        cp.setFont(new Font("Osward", Font.BOLD, 16));
        cp.setBorder(BorderFactory.createEmptyBorder());
        cp.setBackground(new Color(204, 0, 204));
        cp.setForeground(new Color(255, 225, 255));
        cp.addActionListener(this);
        add(cp);

        bp = new JButton("Book Package");
        bp.setBounds(290, 470, 120, 30);
        bp.setFocusable(false);
        bp.setFont(new Font("Osward", Font.BOLD, 16));
        bp.setBorder(BorderFactory.createEmptyBorder());
        bp.setBackground(new Color(0, 204, 0));
        bp.setForeground(new Color(255, 225, 255));
        bp.addActionListener(this);
        add(bp);

        // ***************************************************** FILL UP

        try {

            Conn c = new Conn();
            String query1 = "SELECT * FROM add_cus where username = '" + usrn + "';";
            ResultSet rs = c.s.executeQuery(query1);
            if (rs.next()) {
                Name = rs.getString("name");
                idType = rs.getString("id");
                number = rs.getString("id_num");
                phoneNo = rs.getString("phone");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        // System.out.println(Name);

        tpLabel = new JLabel(" ");
        tpLabel.setBounds(210, 390, 150, 30);
        tpLabel.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        tpLabel.setForeground(new Color(255, 0, 127));
        add(tpLabel);

        JLabel nameF = new JLabel(Name);
        nameF.setBounds(210, 90, 150, 30);
        nameF.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        nameF.setForeground(new Color(255, 128, 0));
        add(nameF);

        JLabel idF = new JLabel(idType);
        idF.setBounds(210, 240, 150, 30);
        idF.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        idF.setForeground(new Color(0, 204, 0));
        add(idF);

        JLabel numF = new JLabel(number);
        numF.setBounds(210, 290, 150, 30);
        numF.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        numF.setForeground(new Color(0, 204, 0));
        add(numF);

        JLabel phoneF = new JLabel(phoneNo);
        phoneF.setBounds(210, 340, 150, 30);
        phoneF.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        phoneF.setForeground(new Color(0, 204, 0));
        add(phoneF);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == back) {
            setVisible(false);
        }

        String Package_selected = sp_Choice.getSelectedItem();
        int maxLimit = -1, vacant_Place = -1, price = -1, totalP = -1;
        int head_Count = Integer.parseInt(tp_Field.getText());
        // System.out.println(head_Count);

        try {

            Conn c = new Conn();
            String query2 = "SELECT * FROM package_info where P_name = '" + Package_selected + "';";

            ResultSet rs = c.s.executeQuery(query2);

            if (rs.next()) {
                maxLimit = Integer.parseInt(rs.getString("max_limit"));
                vacant_Place = Integer.parseInt(rs.getString("vacant_place"));
                price = Integer.parseInt(rs.getString("Price"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        if (ae.getSource() == cp) {

            if (vacant_Place - head_Count >= 0) {
                // System.out.println("*");
                totalP = head_Count * price;
                tpLabel.setText(Integer.toString(totalP));
                // System.out.println(totalP);

                revalidate();
                repaint();
            } else {
                // System.out.println("No space");
                JOptionPane.showMessageDialog(null, "Only " + vacant_Place + " left");
            }

        } else if (ae.getSource() == bp) {

            try {

                Conn c = new Conn();
                String query4 = "SELECT * FROM book_package where username = '" + usrn + "';";
                ResultSet rs = c.s.executeQuery(query4);

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "1 user can make only 1 booking at a time");
                } else {

                    try {

                        totalP = price * head_Count;

                        String query5 = "INSERT INTO book_package values ('" + usrn + "','" + idType + "','" + number
                                + "','"
                                + Package_selected + "','" + head_Count + "','" + totalP + "');";

                        String query5_1 = "INSERT INTO history_book_package values ('" + usrn + "','" + idType + "','" + number
                                + "','"
                                + Package_selected + "','" + head_Count + "','" + totalP + "');";

                        // Conn c = new Conn();
                        c.s.executeUpdate(query5);
                        c.s.executeUpdate(query5_1);

                        try {
                            // Conn c = new Conn();
                            String updated_count = Integer.toString(vacant_Place - head_Count);
                            String query3 = "update package_info set vacant_place = '"
                                    + updated_count + "' where P_name = '" +
                                    Package_selected + "';";

                            c.s.executeUpdate(query3);

                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        JOptionPane.showMessageDialog(null, "Package booked successfully");

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) {
        new book_Package("sourabh_gorai");
    }

}
