import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class package_Details extends JFrame implements ActionListener {

    String usrn;
    JButton back;

    package_Details(String usrn) {

        this.usrn = usrn;

        setTitle("View Package Details");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(140, 100, 1000, 600);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** IMAGE

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(450, 55, 500, 400);
        add(img);

        // ***************************************************** JLabel

        JLabel text = new JLabel("View Pacakage Details");
        text.setBounds(150, 30, 350, 30);
        text.setForeground(new Color(204, 0, 102));
        // text1.setForeground(new Color(255, 51, 255));
        text.setFont(new Font("Raleway", Font.BOLD, 22));
        add(text);

        JLabel uname_Label = new JLabel("Username :");
        uname_Label.setBounds(50, 100, 150, 30);
        uname_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // uname.setForeground(new Color(0, 102, 204));
        add(uname_Label);

        JLabel package_Label = new JLabel("Package :");
        package_Label.setBounds(50, 150, 150, 30);
        package_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // select_P.setForeground(new Color(0, 102, 204));
        add(package_Label);

        JLabel tp_Label = new JLabel("Total Person :");
        tp_Label.setBounds(50, 200, 150, 30);
        tp_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // t_Per.setForeground(new Color(0, 102, 204));
        add(tp_Label);

        JLabel id_Label = new JLabel("Id : ");
        id_Label.setBounds(50, 250, 150, 30);
        id_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(id_Label);

        JLabel number_Label = new JLabel("Id Number : ");
        number_Label.setBounds(50, 300, 150, 30);
        number_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(number_Label);

        // JLabel phone_Label = new JLabel("Phone Number : ");
        // phone_Label.setBounds(50, 290, 150, 30);
        // phone_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // // id.setForeground(new Color(0, 102, 204));
        // add(phone_Label);

        JLabel price_Label = new JLabel("Total Price : ");
        price_Label.setBounds(50, 350, 150, 30);
        price_Label.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        // id.setForeground(new Color(0, 102, 204));
        add(price_Label);

        // ***************************************************** JLabel Fill up

        String package_F="", tp="", id="", idnum="", price="";

        try{

            Conn c = new Conn();
            String query1 = "SELECT * FROM book_package WHERE username = '" + usrn + "';";
            ResultSet rs = c.s.executeQuery(query1);
            
            if(rs.next()){

                package_F = rs.getString("package");
                tp = rs.getString("person");
                id = rs.getString("id");
                idnum = rs.getString("idno");
                price = rs.getString("total_price");

            }

        } catch (Exception e){
            System.out.println(e);
        }

        JLabel uname_Label_F = new JLabel(usrn);
        uname_Label_F.setBounds(210, 100, 150, 30);
        uname_Label_F.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        uname_Label_F.setForeground(new Color(255,128,0));
        add(uname_Label_F);

        JLabel package_Label_F = new JLabel(package_F);
        package_Label_F.setBounds(210, 150, 150, 30);
        package_Label_F.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        package_Label_F.setForeground(new Color(255,128,0));
        add(package_Label_F);

        JLabel tp_Label_F = new JLabel(tp);
        tp_Label_F.setBounds(210, 200, 150, 30);
        tp_Label_F.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        tp_Label_F.setForeground(new Color(255,128,07));
        add(tp_Label_F);

        JLabel id_Label_F = new JLabel(id);
        id_Label_F.setBounds(210, 250, 150, 30);
        id_Label_F.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        id_Label_F.setForeground(new Color(255,128,0));
        add(id_Label_F);

        JLabel number_Label_F = new JLabel(idnum);
        number_Label_F.setBounds(210, 300, 150, 30);
        number_Label_F.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        number_Label_F.setForeground(new Color(255,128,0));
        add(number_Label_F);

        JLabel price_Label_F = new JLabel(price);
        price_Label_F.setBounds(210, 350, 150, 30);
        price_Label_F.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        price_Label_F.setForeground(new Color(255,128,0));
        add(price_Label_F);

        // *****************************************************JBUTTON

        back = new JButton("Back");
        back.setBounds(50, 450, 120, 26);
        back.setFocusable(false);
        back.setFont(new Font("Osward", Font.BOLD, 16));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBackground(new Color(255, 0, 0));
        back.setForeground(new Color(255, 225, 255));
        back.addActionListener(this);
        add(back);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new package_Details("admin");
    }

}
