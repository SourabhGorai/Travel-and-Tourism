import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class bookHotel extends JFrame implements ActionListener {

    String usrn;
    JButton back, cp_Button, book_Button;
    Choice sHotel_Choice, ac_Choice, food_Choice;
    JTextField tp_Field, nd_Field;
    String id_F = "", num_F = "", phone_F = "";
    JLabel tp_V_Label;

    bookHotel(String usrn) {

        this.usrn = usrn;

        setTitle("Book Hotel");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(140, 100, 1000, 650);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** IMAGE

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(450, 55, 500, 400);
        add(img);

        // ***************************************************** JLabel

        JLabel text = new JLabel("Book Hotel");
        text.setBounds(150, 30, 350, 30);
        text.setForeground(new Color(204, 0, 102));
        // text1.setForeground(new Color(255, 51, 255));
        text.setFont(new Font("Raleway", Font.BOLD, 22));
        add(text);

        JLabel uname_Label = new JLabel("Username :");
        uname_Label.setBounds(50, 90, 150, 30);
        uname_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // uname.setForeground(new Color(0, 102, 204));
        add(uname_Label);

        JLabel sH_Label = new JLabel("Select Hotel :");
        sH_Label.setBounds(50, 130, 150, 30);
        sH_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // select_P.setForeground(new Color(0, 102, 204));
        add(sH_Label);

        JLabel tp_Label = new JLabel("Total Persons :");
        tp_Label.setBounds(50, 170, 150, 30);
        tp_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // t_Per.setForeground(new Color(0, 102, 204));
        add(tp_Label);

        JLabel nd_Label = new JLabel("No. of Days : ");
        nd_Label.setBounds(50, 210, 150, 30);
        nd_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(nd_Label);

        JLabel acc_Label = new JLabel("Ac/Non-Ac : ");
        acc_Label.setBounds(50, 250, 150, 30);
        acc_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(acc_Label);

        JLabel food_Label = new JLabel("Food Included : ");
        food_Label.setBounds(50, 290, 150, 30);
        food_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(food_Label);

        JLabel id_Label = new JLabel("ID : ");
        id_Label.setBounds(50, 330, 150, 30);
        id_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(id_Label);

        JLabel number_Label = new JLabel("Number : ");
        number_Label.setBounds(50, 370, 150, 30);
        number_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(number_Label);

        JLabel ph_Label = new JLabel("Phone : ");
        ph_Label.setBounds(50, 410, 150, 30);
        ph_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(ph_Label);

        JLabel tprice_Label = new JLabel("Total Price : ");
        tprice_Label.setBounds(50, 450, 150, 30);
        tprice_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(tprice_Label);

        // ***************************************************** Choice

        sHotel_Choice = new Choice();
        sHotel_Choice.add("JW Marriott Hotel");
        sHotel_Choice.add("Madarin Oriental Hotel");
        sHotel_Choice.add("Four Seasons Hotel");
        sHotel_Choice.add("Raddission Blue Hotel");
        sHotel_Choice.add("Classio Hotel");
        sHotel_Choice.add("The Bay Club Hotel");
        sHotel_Choice.add("Breeze Blow Hotel");
        sHotel_Choice.add("The Taj Hotel");
        sHotel_Choice.add("Happy Morning Motel");
        sHotel_Choice.add("River View Hotel");
        sHotel_Choice.setBounds(220, 133, 200, 28);
        sHotel_Choice.setFont(new Font("Osward", Font.BOLD, 13));
        sHotel_Choice.setForeground(new Color(0, 153, 0));
        add(sHotel_Choice);

        ac_Choice = new Choice();
        ac_Choice.add("Yes");
        ac_Choice.add("No");
        ac_Choice.setBounds(220, 253, 200, 28);
        ac_Choice.setFont(new Font("Osward", Font.BOLD, 13));
        ac_Choice.setForeground(new Color(0, 153, 0));
        add(ac_Choice);

        food_Choice = new Choice();
        food_Choice.add("Yes");
        food_Choice.add("No");
        food_Choice.setBounds(220, 293, 200, 28);
        food_Choice.setFont(new Font("Osward", Font.BOLD, 13));
        food_Choice.setForeground(new Color(0, 153, 0));
        add(food_Choice);

        // ***************************************************** JTextField

        tp_Field = new JTextField();
        tp_Field.setFont(new Font("Raleway", Font.BOLD, 15));
        tp_Field.setBorder(BorderFactory.createEtchedBorder());
        tp_Field.setBounds(220, 170, 200, 28);
        tp_Field.setForeground(new Color(0, 153, 0));
        add(tp_Field);

        nd_Field = new JTextField();
        nd_Field.setFont(new Font("Raleway", Font.BOLD, 15));
        nd_Field.setBorder(BorderFactory.createEtchedBorder());
        nd_Field.setBounds(220, 210, 200, 28);
        nd_Field.setForeground(new Color(0, 153, 0));
        add(nd_Field);

        // *****************************************************FILL UP

        try {

            String query1 = "SELECT * FROM add_cus where username = '" + usrn + "';";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query1);
            if (rs.next()) {
                id_F = rs.getString("id");
                num_F = rs.getString("id_num");
                phone_F = rs.getString("phone");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(id_F+" "+num_F+" "+phone_F);

        JLabel uname_F = new JLabel(usrn);
        uname_F.setBounds(220, 90, 150, 30);
        uname_F.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        uname_F.setForeground(new Color(0, 153, 0));
        add(uname_F);

        JLabel id_Fi = new JLabel(id_F);
        id_Fi.setBounds(220, 330, 150, 30);
        id_Fi.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        id_Fi.setForeground(new Color(0, 153, 0));
        add(id_Fi);

        JLabel number_F = new JLabel(num_F);
        number_F.setBounds(220, 370, 150, 30);
        number_F.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        number_F.setForeground(new Color(0, 153, 0));
        add(number_F);

        JLabel ph_F = new JLabel(phone_F);
        ph_F.setBounds(220, 410, 150, 30);
        ph_F.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        ph_F.setForeground(new Color(0, 153, 0));
        add(ph_F);

        tp_V_Label = new JLabel(" ");
        tp_V_Label.setBounds(220, 450, 150, 30);
        tp_V_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        tp_V_Label.setForeground(new Color(255, 128, 0));
        add(tp_V_Label);

        // *****************************************************JBUTTON

        back = new JButton("Back");
        back.setBounds(50, 550, 100, 30);
        back.setFocusable(false);
        back.setFont(new Font("Osward", Font.BOLD, 16));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBackground(new Color(255, 0, 0));
        back.setForeground(new Color(255, 225, 255));
        back.addActionListener(this);
        add(back);

        cp_Button = new JButton("Check Price");
        cp_Button.setBounds(175, 550, 120, 30);
        cp_Button.setFocusable(false);
        cp_Button.setFont(new Font("Osward", Font.BOLD, 16));
        cp_Button.setBorder(BorderFactory.createEmptyBorder());
        cp_Button.setBackground(new Color(204, 0, 204));
        cp_Button.setForeground(Color.white);
        // cp_Button.setForeground(new Color(255, 225, 255));
        cp_Button.addActionListener(this);
        add(cp_Button);

        book_Button = new JButton("Book Package");
        book_Button.setBounds(320, 550, 120, 30);
        book_Button.setFocusable(false);
        book_Button.setFont(new Font("Osward", Font.BOLD, 16));
        book_Button.setBorder(BorderFactory.createEmptyBorder());
        book_Button.setBackground(new Color(0, 204, 0));
        book_Button.setForeground(Color.WHITE);
        book_Button.addActionListener(this);
        add(book_Button);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == back) {
            setVisible(false);
        }

        String hname_D, ac_Cho, food_Cho;
        int vacantAC_D = -1, costAC_D = -1, vacant_nAC_D = -1, costNAC_D = -1, fc_D = -1;
        int head_count = 0, total_days = 0, tp_D = 0;

        hname_D = sHotel_Choice.getSelectedItem();
        ac_Cho = ac_Choice.getSelectedItem(); // yes/no
        food_Cho = food_Choice.getSelectedItem(); // yes/no
        head_count = Integer.parseInt(tp_Field.getText());
        total_days = Integer.parseInt(nd_Field.getText());

        try {

            String query2 = "SELECT * FROM hotel_info WHERE hotel_name = '" + hname_D + "';";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query2);
            if (rs.next()) {
                vacantAC_D = rs.getInt("vacantACroom");
                costAC_D = rs.getInt("acroom_cost");
                vacant_nAC_D = rs.getInt("vacantnonACroom");
                costNAC_D = rs.getInt("nonACroom_cost");
                fc_D = rs.getInt("food_charges");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        // **********************************************************************

        if (ae.getSource() == cp_Button) {

            if (vacantAC_D - head_count >= 0) {

                if (ac_Cho == "Yes") {
                    if (food_Cho == "Yes") {
                        tp_D = head_count * (costAC_D + fc_D) * total_days;
                    } else {
                        tp_D = head_count * costAC_D * total_days;
                    }
                } else if (ac_Cho == "No") {
                    if (food_Cho == "Yes") {
                        tp_D = head_count * (costNAC_D + fc_D) * total_days;
                    } else {
                        tp_D = head_count * costNAC_D * total_days;
                    }
                }

                tp_V_Label.setText(Integer.toString(tp_D));

                revalidate();
                repaint();

            } else {
                if (ac_Cho == "Yes") {
                    JOptionPane.showMessageDialog(null, "Only " + vacantAC_D + " places are left");
                } else {
                    JOptionPane.showMessageDialog(null, "Only " + vacant_nAC_D + " places are left");
                }
            }

        } else if (ae.getSource() == book_Button) {

            // ************************************************************* Need more work

            Conn c = new Conn();

            try {

                // **********************************************************************************

                // String query4 = "UPDATE hotel_booking_status SET ";

                // **********************************************************************************
                // AC room & food included
                String query5_1 = "INSERT INTO hotel_booking_status VALUES ('" + usrn + "','" + hname_D + "',"
                        + head_count + "," + (costAC_D * total_days) + ",' Yes'," + total_days
                        + ",0,0,'No',0," + (fc_D * total_days * head_count) + "," +
                        +((costAC_D + fc_D) * total_days * head_count)
                        + ",Now());";

                // AC room & food not included
                String query5_2 = "INSERT INTO hotel_booking_status VALUES ('" + usrn + "','" + hname_D + "',"
                        + head_count + "," + (costAC_D * total_days) + ",'No'," + total_days
                        + ",0,0,'No',0,0," +
                        +((costAC_D) * total_days * head_count)
                        + ",Now());";

                // Non-AC room & food included
                String query5_3 = "INSERT INTO hotel_booking_status VALUES ('" + usrn + "','" + hname_D
                        + "',0,0,'No',0," +
                        +head_count + "," + (costNAC_D * total_days) + ",' Yes'," + total_days + ","
                        + (fc_D * total_days * head_count) + "," +
                        +((costNAC_D + fc_D) * total_days * head_count)
                        + ",Now());";

                // Non-AC room & food not included
                String query5_4 = "INSERT INTO hotel_booking_status VALUES ('" + usrn + "','" + hname_D
                        + "',0,0,'No',0," +
                        +head_count + "," + (costNAC_D * total_days) + ",' Yes'," + total_days + ",0," +
                        +(costNAC_D * total_days * head_count)
                        + ",Now());";

                // **********************************************************************************
                // AC room & food included
                String query6_1 = "INSERT INTO history_hbooking_status VALUES ('" + usrn +
                        "','" + hname_D + "',"
                        + head_count + "," + (costAC_D * total_days) + ",' Yes'," + total_days
                        + ",0,0,'No',0," + (fc_D * total_days * head_count) + "," +
                        +((costAC_D + fc_D) * total_days * head_count)
                        + ",Now());";

                // AC room & food not included
                String query6_2 = "INSERT INTO history_hbooking_status VALUES ('" + usrn +
                        "','" + hname_D + "',"
                        + head_count + "," + (costAC_D * total_days) + ",'No'," + total_days
                        + ",0,0,'No',0,0," +
                        +((costAC_D) * total_days * head_count)
                        + ",Now());";

                // Non-AC room & food included
                String query6_3 = "INSERT INTO history_hbooking_status VALUES ('" + usrn +
                        "','" + hname_D
                        + "',0,0,'No',0," +
                        +head_count + "," + (costNAC_D * total_days) + ",' Yes'," + total_days + ","
                        + (fc_D * total_days * head_count) + "," +
                        +((costNAC_D + fc_D) * total_days * head_count)
                        + ",Now());";

                // Non-AC room & food not included
                String query6_4 = "INSERT INTO history_hbooking_status VALUES ('" + usrn +
                        "','" + hname_D
                        + "',0,0,'No',0," +
                        +head_count + "," + (costNAC_D * total_days) + ",' Yes'," + total_days +
                        ",0," +
                        +(costNAC_D * total_days * head_count)
                        + ",Now());";

                // *********************************************************************

                // hname_D = sHotel_Choice.getSelectedItem();
                // ac_Cho = ac_Choice.getSelectedItem(); // yes/no
                // food_Cho = food_Choice.getSelectedItem(); // yes/no
                // head_count = Integer.parseInt(tp_Field.getText());
                // total_days = Integer.parseInt(nd_Field.getText());

                // vacantAC_D = rs.getInt("vacantACroom");
                // costAC_D = rs.getInt("acroom_cost");
                // vacant_nAC_D = rs.getInt("vacantnonACroom");
                // costNAC_D = rs.getInt("nonACroom_cost");
                // fc_D = rs.getInt("food_charges");

                // *********************************************************************

                String query3 = "SELECT * FROM hotel_booking_status WHERE username = '" +
                        usrn + "';";

                String hotelNameCheck = "";

                ResultSet rs = c.s.executeQuery(query3);
                if (rs.next()) {

                    hotelNameCheck = rs.getString("hotel_name");
                    System.out.println(hotelNameCheck + " " + hname_D);

                    if (hotelNameCheck.equals(hname_D)) {

                        System.out.println("Entering case1");

                        int Database_food_C = rs.getInt("foodcharges");
                        int Database_total_P = rs.getInt("total_price");

                        // AC room exist and non-AC room added
                        // Food Inc
                        String query7_1 = "Update hotel_booking_status set nonACroom_pers_count = " + head_count
                                + ", nonACroom_cost = " + (costNAC_D * head_count) + ",nonACfoodinc = '" + food_Cho
                                + "', NACstay = "
                                + total_days + ", foodcharges =" + (Database_food_C + (head_count * total_days * fc_D))
                                + ", total_price ="
                                + (Database_total_P + ((costNAC_D + fc_D) * total_days * head_count)) + ";";

                        // Food Not-Inc
                        String query7_2 = "Update hotel_booking_status set nonACroom_pers_count = " + head_count
                                + ", nonACroom_cost = " + (costNAC_D * head_count) + ",nonACfoodinc = '" + food_Cho
                                + "', NACstay = "
                                + total_days + ", total_price ="
                                + (Database_total_P + (costNAC_D * total_days * head_count)) + ";";

                        // Non-AC room exist and AC room added
                        // Food Inc
                        String query7_3 = "Update hotel_booking_status set acroom_pers_count = " + head_count
                                + ", acroom_cost = " + (costAC_D * head_count) + ",ACfoodinc = '" + food_Cho
                                + "', ACstay = "
                                + total_days
                                + ", foodcharges =" + (Database_food_C + (head_count * total_days * fc_D))
                                + ", total_price ="
                                + (Database_total_P + ((costAC_D + fc_D) * total_days * head_count)) + ";";

                        // Food Not-Inc
                        String query7_4 = "Update hotel_booking_status set acroom_pers_count = " + head_count
                                + ", acroom_cost = " + (costAC_D * head_count) + ",ACfoodinc = '" + food_Cho
                                + "', ACstay = "
                                + total_days
                                + ", total_price =" + (Database_total_P + (costAC_D * total_days * head_count)) + ";";

                        // *******************************************************************************************

                        // AC room exist and non-AC room added
                        // Food Inc
                        String query8_1 = "Update history_hbooking_status set nonACroom_pers_count = " + head_count
                                + ", nonACroom_cost = " + (costNAC_D * head_count) + ",nonACfoodinc = '" + food_Cho
                                + "', NACstay = "
                                + total_days + ", foodcharges =" + (Database_food_C + (head_count * total_days * fc_D))
                                + ", total_price ="
                                + (Database_total_P + ((costNAC_D + fc_D) * total_days * head_count)) + ";";

                        // Food Not-Inc
                        String query8_2 = "Update history_hbooking_status set nonACroom_pers_count = " + head_count
                                + ", nonACroom_cost = " + (costNAC_D * head_count) + ",nonACfoodinc = '" + food_Cho
                                + "', NACstay = "
                                + total_days + ", total_price ="
                                + (Database_total_P + (costNAC_D * total_days * head_count)) + ";";

                        // Non-AC room exist and AC room added
                        // Food Inc
                        String query8_3 = "Update history_hbooking_status set acroom_pers_count = " + head_count
                                + ", acroom_cost = " + (costAC_D * head_count) + ",ACfoodinc = '" + food_Cho
                                + "', ACstay = " + total_days
                                + ", foodcharges =" + (Database_food_C + (head_count * total_days * fc_D))
                                + ", total_price ="
                                + (Database_total_P + ((costAC_D + fc_D) * total_days * head_count)) + ";";

                        // Food Not-Inc
                        String query8_4 = "Update history_hbooking_status set acroom_pers_count = " + head_count
                                + ", acroom_cost = " + (costAC_D * head_count) + ",ACfoodinc = '" + food_Cho
                                + "', ACstay = " + total_days
                                + ", total_price =" + (Database_total_P + (costAC_D * total_days * head_count)) + ";";

                        // *******************************************************************************************

                        if (ac_Cho == "No" && vacantAC_D - head_count >= 0) {
                            if (food_Cho == "Yes") {
                                c.s.executeUpdate(query7_1);
                                c.s.executeUpdate(query8_1);
                            } else {
                                c.s.executeUpdate(query7_2);
                                c.s.executeUpdate(query8_2);
                            }
                        } else if (ac_Cho == "Yes" && vacant_nAC_D - head_count >= 0) {
                            if (food_Cho == "Yes") {
                                c.s.executeUpdate(query7_3);
                                c.s.executeUpdate(query8_3);
                            } else {
                                c.s.executeUpdate(query7_4);
                                c.s.executeUpdate(query8_4);
                            }
                        }

                        JOptionPane.showMessageDialog(null, "Booking Successfull");

                    } else {

                        System.out.println("Entering case2");
                        JOptionPane.showMessageDialog(null, "You have already booked a hotel");

                    }

                } else {

                    System.out.println("Entering case3");
                    if (ac_Cho == "Yes" && vacantAC_D - head_count >= 0) {
                        if (food_Cho == "Yes") {
                            c.s.executeUpdate(query5_1);
                            c.s.executeUpdate(query6_1);
                        } else {
                            c.s.executeUpdate(query5_2);
                            c.s.executeUpdate(query6_2);
                        }
                    } else if (ac_Cho == "No" && vacant_nAC_D - head_count >= 0) {
                        if (food_Cho == "Yes") {
                            c.s.executeUpdate(query5_3);
                            c.s.executeUpdate(query6_3);
                        } else {
                            c.s.executeUpdate(query5_4);
                            c.s.executeUpdate(query6_4);
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Booking Successfull");
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                if (ac_Cho == "Yes" && vacantAC_D - head_count >= 0) {
                    String query9 = "UPDATE hotel_info set vacantACroom = " + (vacantAC_D - head_count)
                            + " where hotel_name = '" + hname_D + "';";
                    c.s.executeUpdate(query9);
                } else if (ac_Cho == "No" && vacant_nAC_D - head_count >= 0) {
                    String query9 = "UPDATE hotel_info set vacantnonACroom = " + (vacant_nAC_D - head_count)
                            + " where hotel_name = '" + hname_D + "';";
                    c.s.executeUpdate(query9);
                } else {
                    if (ac_Cho == "Yes") {
                        JOptionPane.showMessageDialog(null, "Only " + vacantAC_D + " places are left");
                    } else {
                        JOptionPane.showMessageDialog(null, "Only " + vacant_nAC_D + " places are left");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) {
        new bookHotel("admin");
    }
}
