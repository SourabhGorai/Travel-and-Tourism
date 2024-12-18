import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class viewBookedHotel extends JFrame implements ActionListener {

    String usrn;

    viewBookedHotel(String usrn) {
        this.usrn = usrn;

        setTitle("View Booked Hotel");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(140, 100, 1000, 650);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** IMAGE

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(460, 70, 500, 400);
        add(img);

        // ***************************************************** JLabel

        JLabel text = new JLabel("View Booked Hotel");
        text.setBounds(150, 30, 350, 30);
        text.setForeground(new Color(204, 0, 102));
        // text1.setForeground(new Color(255, 51, 255));
        text.setFont(new Font("Raleway", Font.BOLD, 22));
        add(text);

        JLabel uname_Label = new JLabel("name :");
        uname_Label.setBounds(50, 90, 150, 30);
        uname_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // uname.setForeground(new Color(0, 102, 204));
        add(uname_Label);

        JLabel id_Label = new JLabel("ID : ");
        id_Label.setBounds(50, 130, 150, 30);
        id_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(id_Label);

        JLabel number_Label = new JLabel("Number : ");
        number_Label.setBounds(50, 170, 150, 30);
        number_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(number_Label);

        JLabel ph_Label = new JLabel("Phone : ");
        ph_Label.setBounds(50, 210, 150, 30);
        ph_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(ph_Label);

        JLabel sH_Label = new JLabel("Hotel Name :");
        sH_Label.setBounds(50, 250, 150, 30);
        sH_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // select_P.setForeground(new Color(0, 102, 204));
        add(sH_Label);

        // ******************************************************************

        // ****************************************************** FILL UP Fetch

        String hname = "", ac_foodInc = "", nac_foodInc = "";
        int ac_person_C = -1, ac_room_Cost = -1, ac_stay = -1;
        int nac_person_C = -1, nac_room_Cost = -1, nac_stay = -1;
        int total_cost = -1;
        Timestamp booking_time;
        int increment = 0;
        String id_D = "", idnum_D = "", phone_D = "", name_D = "";

        try {

            String query1 = "SELECT * FROM hotel_booking_status where username = '" + usrn + "';";
            String query2 = "SELECT * FROM add_cus WHERE username = '" + usrn + "';";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query1);

            if (rs.next()) {
                hname = rs.getString("hotel_name");
                ac_person_C = rs.getInt("acroom_pers_count");
                ac_room_Cost = rs.getInt("acroom_cost");
                ac_foodInc = rs.getString("ACfoodinc");
                ac_stay = rs.getInt("ACstay");
                nac_person_C = rs.getInt("nonACroom_pers_count");
                nac_room_Cost = rs.getInt("nonACroom_cost");
                nac_foodInc = rs.getString("nonACfoodinc");
                nac_stay = rs.getInt("NACstay");
                total_cost = rs.getInt("total_price");
                booking_time = rs.getTimestamp("times");
            }

            rs = c.s.executeQuery(query2);

            if (rs.next()) {
                name_D = rs.getString("name");
                id_D = rs.getString("id");
                idnum_D = rs.getString("id_num");
                phone_D = rs.getString("phone");
            }

            if (ac_person_C != 0) {
                increment = 120;
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        //

        // ***************************************************** Fill UP

        JLabel name_Label2 = new JLabel(name_D);
        name_Label2.setBounds(250, 90, 150, 30);
        name_Label2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        name_Label2.setForeground(new Color(0, 102, 204));
        add(name_Label2);

        JLabel id_Label2 = new JLabel(id_D);
        id_Label2.setBounds(250, 130, 150, 30);
        id_Label2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        id_Label2.setForeground(new Color(0, 102, 204));
        add(id_Label2);

        JLabel number_Label2 = new JLabel(idnum_D);
        number_Label2.setBounds(250, 170, 150, 30);
        number_Label2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        number_Label2.setForeground(new Color(0, 102, 204));
        add(number_Label2);

        JLabel ph_Label2 = new JLabel(phone_D);
        ph_Label2.setBounds(250, 210, 150, 30);
        ph_Label2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        ph_Label2.setForeground(new Color(0, 102, 204));
        add(ph_Label2);

        JLabel Hn_Label2 = new JLabel(hname);
        Hn_Label2.setBounds(250, 250, 250, 30);
        Hn_Label2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        Hn_Label2.setForeground(new Color(0, 102, 204));
        add(Hn_Label2);

        // *************************************************************

        if (ac_person_C != 0) {

            JLabel tp_Label = new JLabel("Total Persons (AC):");
            tp_Label.setBounds(50, 290, 180, 30);
            tp_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            // t_Per.setForeground(new Color(0, 102, 204));
            add(tp_Label);

            JLabel nd_Label = new JLabel("Total Days : ");
            nd_Label.setBounds(50, 330, 150, 30);
            nd_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            // id.setForeground(new Color(0, 102, 204));
            add(nd_Label);

            JLabel food_Label = new JLabel("Food Included : ");
            food_Label.setBounds(50, 370, 150, 30);
            food_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            // id.setForeground(new Color(0, 102, 204));
            add(food_Label);

            // *************************************************************

            // String hname = "", ac_foodInc = "", nac_foodInc = "";
            // int ac_person_C = -1, ac_room_Cost = -1, ac_stay = -1;
            // int nac_person_C = -1, nac_room_Cost = -1, nac_stay = -1;
            // int total_cost = -1;
            // Timestamp booking_time;
            // int increment = 0;

            JLabel tp_Label2 = new JLabel(Integer.toString(ac_person_C));
            tp_Label2.setBounds(250, 290, 180, 30);
            tp_Label2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            tp_Label2.setForeground(new Color(0, 102, 204));
            add(tp_Label2);

            JLabel nd_Label2 = new JLabel(Integer.toString(ac_stay));
            nd_Label2.setBounds(250, 330, 180, 30);
            nd_Label2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            nd_Label2.setForeground(new Color(0, 102, 204));
            add(nd_Label2);

            JLabel food_Label2 = new JLabel(ac_foodInc);
            food_Label2.setBounds(250, 370, 180, 30);
            food_Label2.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            food_Label2.setForeground(new Color(0, 102, 204));
            add(food_Label2);

        }
        
        if(nac_person_C != 0){

            // System.out.println(increment);
            JLabel tp_Label3 = new JLabel("Total Persons (nAC):");
            tp_Label3.setBounds(50, increment+290, 200, 30);
            tp_Label3.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            // t_Per.setForeground(new Color(0, 102, 204));
            add(tp_Label3);

            JLabel nd_Label3 = new JLabel("Total Days (nAC): ");
            nd_Label3.setBounds(50, increment+330, 180, 30);
            nd_Label3.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            // id.setForeground(new Color(0, 102, 204));
            add(nd_Label3);

            JLabel food_Label3 = new JLabel("Food Included (nAC): ");
            food_Label3.setBounds(50, increment+370, 200, 30);
            food_Label3.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            // id.setForeground(new Color(0, 102, 204));
            add(food_Label3);

            // *************************************************************

            
            JLabel tp_Label4 = new JLabel(Integer.toString(nac_person_C));
            tp_Label4.setBounds(250,increment+ 290, 180, 30);
            tp_Label4.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            tp_Label4.setForeground(new Color(0, 102, 204));
            add(tp_Label4);

            JLabel nd_Label4 = new JLabel(Integer.toString(nac_stay));
            nd_Label4.setBounds(250,increment+ 330, 180, 30);
            nd_Label4.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            nd_Label4.setForeground(new Color(0, 102, 204));
            add(nd_Label4);

            JLabel food_Label4 = new JLabel(nac_foodInc);
            food_Label4.setBounds(250,increment+ 370, 180, 30);
            food_Label4.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
            food_Label4.setForeground(new Color(0, 102, 204));
            add(food_Label4);

        }

        // *************************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new viewBookedHotel("sourabh_gorai");
    }

}
