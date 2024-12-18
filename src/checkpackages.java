import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class checkpackages extends JFrame {

    String usrn;
    JTabbedPane tab;
    JPanel p1;

    checkpackages(String usrn) {

        this.usrn = usrn;

        // ****************************************************
        
        String[] arr1 = {
                "Platinum Package",
                "7 Days & 8 Nights",
                "24/7 Concierge Service",
                "Full Day City Tour with Private Guide",
                "All Meals Included at 5-Star Restaurants",
                "Champagne & Wine Included",
                "Helicopter Tour Over Scenic Landmarks",
                "Private Chauffeur for Sightseeing",
                "Luxury Accommodation",
                "Winter Wonderland Special",
                "Rs 14000/-",
                "icons/platinum.jpg",
                "202", "220", "252",
                "0", "76", "153", // heading
                "115", "93", "165",
                // "204","0","102", // offers
                "255", "0", "0" // price
        };

        String[] arr2 = { "Gold Package",
                "6 Days & 7 Nights",
                "Air Assistance",
                "Half Day City Tour",
                " Daily Buffet",
                "Soft Drinks Free",
                "Full Day 3 Islands Cruise",
                "English Speaking Guide",
                "Book Package",
                "Summer Special",
                "Rs 12000/-",
                "icons/package1.jpg",
                "76", "153", "0",
                "255", "205", "0",
                "255", "255", "255",
                "255", "229", "204" };

        String[] arr3 = { "Silver Package",
                "5 Days & 6 Nights",
                "Limited Assistance",
                "Self-Guided City Tour",
                "Breakfast Only",
                "No Beverages Included",
                "Boat Ride to 1 Island Only",
                "Basic English Brochure",
                "Standard Accommodation",
                "Off-Peak Season",
                "Rs 4000/-",
                "icons/package2.jpg",
                "204", "255", "204",
                "0", "76", "153", // heading
                // "115", "93", "165",
                "0", "153", "0", // offers
                "204", "0", "204" // price
        };

        String[] arr4 = { "Bronze Package",
                "4 Days & 5 Nights",
                "No Assistance",
                "No City Tour",
                "No Meals Included",
                "No Beverages Included",
                "No Cruise Included",
                "No Guide Provided",
                "Budget Accommodation",
                "Limited Access",
                "Rs 2000/-",
                "icons/package3.jpg",
                "0", "153", "153",
                "255", "255", "0", // heading
                // "115", "93", "165",
                "255", "255", "255", // offers
                "255", "229", "204" // price
        };


        setTitle("Check Packages");
        // setLayout(null);
        setLocationRelativeTo(null);
        setBounds(190, 170, 900, 550);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(new Color(0, 36, 107));

        // ******************************************ImageIcon

        // ImageIcon i1 = new
        // ImageIcon(ClassLoader.getSystemResource("icons/package1.jpg"));
        // Image i2 = i1.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel img1 = new JLabel(i3);
        // img1.setBounds(450, 60, 400, 250);

        // ImageIcon i4 = new
        // ImageIcon(ClassLoader.getSystemResource("icons/platinum.jpg"));
        // Image i5 = i4.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
        // ImageIcon i6 = new ImageIcon(i5);
        // JLabel img2 = new JLabel(i6);
        // img2.setBounds(450, 60, 400, 250);

        // ImageIcon i7 = new
        // ImageIcon(ClassLoader.getSystemResource("icons/platinum.jpg"));
        // Image i8 = i7.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
        // ImageIcon i9 = new ImageIcon(i8);
        // JLabel img3 = new JLabel(i9);
        // img3.setBounds(450, 60, 400, 250);

        // ImageIcon i10 = new
        // ImageIcon(ClassLoader.getSystemResource("icons/platinum.jpg"));
        // Image i11 = i10.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
        // ImageIcon i12 = new ImageIcon(i11);
        // JLabel img4 = new JLabel(i12);
        // img4.setBounds(450, 60, 400, 250);

        // ***************************************************** JTabbedPane

        tab = new JTabbedPane();

        JPanel p1 = createPanel(arr1);
        tab.addTab("Package 1", null, p1);

        JPanel p2 = createPanel(arr2);
        tab.addTab("Package 2", null, p2);

        JPanel p3 = createPanel(arr3);
        tab.addTab("Package 3", null, p3);

        JPanel p4 = createPanel(arr4);
        tab.addTab("Package 4", null, p4);

        add(tab);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public JPanel createPanel(String[] arr) {
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(Integer.parseInt(arr[12]), Integer.parseInt(arr[13]), Integer.parseInt(arr[14])));
        // p1.setBackground(new Color(153,0,0));
        // p1.setBackground(new Color(204, 204, 255));;
        add(p1);

        // ******************************************ImageIcon

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(arr[11]));
        Image i2 = i1.getImage().getScaledInstance(400, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img1 = new JLabel(i3);
        img1.setBounds(450, 60, 400, 250);
        p1.add(img1);

        // ******************************************JLabel

        JLabel text1 = new JLabel(arr[0]);
        text1.setBounds(50, 20, 350, 50);
        text1.setForeground(new Color(Integer.parseInt(arr[15]), Integer.parseInt(arr[16]), Integer.parseInt(arr[17])));
        text1.setFont(new Font("Raleway", Font.BOLD, 35));
        p1.add(text1);

        JLabel text2 = new JLabel(arr[1]);
        text2.setBounds(30, 80, 400, 25);
        text2.setForeground(new Color(Integer.parseInt(arr[18]), Integer.parseInt(arr[19]), Integer.parseInt(arr[20])));
        text2.setFont(new Font("Raleway", Font.BOLD, 20));
        p1.add(text2);

        JLabel text3 = new JLabel(arr[2]);
        text3.setBounds(30, 120, 400, 25);
        text3.setForeground(new Color(Integer.parseInt(arr[18]), Integer.parseInt(arr[19]), Integer.parseInt(arr[20])));
        text3.setFont(new Font("Raleway", Font.BOLD, 20));
        p1.add(text3);

        JLabel text4 = new JLabel(arr[3]);
        text4.setBounds(30, 160, 400, 25);
        text4.setForeground(new Color(Integer.parseInt(arr[18]), Integer.parseInt(arr[19]), Integer.parseInt(arr[20])));
        text4.setFont(new Font("Raleway", Font.BOLD, 20));
        p1.add(text4);

        JLabel text5 = new JLabel(arr[4]);
        text5.setBounds(30, 200, 400, 25);
        text5.setForeground(new Color(Integer.parseInt(arr[18]), Integer.parseInt(arr[19]), Integer.parseInt(arr[20])));
        text5.setFont(new Font("Raleway", Font.BOLD, 20));
        p1.add(text5);

        JLabel text6 = new JLabel(arr[5]);
        text6.setBounds(30, 240, 400, 25);
        text6.setForeground(new Color(Integer.parseInt(arr[18]), Integer.parseInt(arr[19]), Integer.parseInt(arr[20])));
        text6.setFont(new Font("Raleway", Font.BOLD, 20));
        p1.add(text6);

        JLabel text7 = new JLabel(arr[6]);
        text7.setBounds(30, 280, 400, 25);
        text7.setForeground(new Color(Integer.parseInt(arr[18]), Integer.parseInt(arr[19]), Integer.parseInt(arr[20])));
        text7.setFont(new Font("Raleway", Font.BOLD, 20));
        p1.add(text7);

        JLabel text8 = new JLabel(arr[7]);
        text8.setBounds(30, 320, 400, 25);
        text8.setForeground(new Color(Integer.parseInt(arr[18]), Integer.parseInt(arr[19]), Integer.parseInt(arr[20])));
        text8.setFont(new Font("Raleway", Font.BOLD, 20));
        p1.add(text8);

        JLabel text9 = new JLabel(arr[8]);
        text9.setBounds(50, 370, 400, 30);
        text9.setForeground(new Color(153, 204, 255));
        text9.setFont(new Font("Raleway", Font.BOLD, 25));
        p1.add(text9);

        JLabel text10 = new JLabel(arr[9]);
        text10.setBounds(50, 420, 400, 25);
        text10.setForeground(new Color(255, 153, 51));
        text10.setFont(new Font("Raleway", Font.BOLD, 30));
        p1.add(text10);

        JLabel text11 = new JLabel(arr[10]);
        text11.setBounds(700, 420, 400, 25);
        text11.setForeground(
                new Color(Integer.parseInt(arr[21]), Integer.parseInt(arr[22]), Integer.parseInt(arr[23])));
        text11.setFont(new Font("Raleway", Font.BOLD, 25));
        p1.add(text11);

        return p1;
    }

    public static void main(String[] args) {
        new checkpackages("sourabh_gorai");
    }
}
