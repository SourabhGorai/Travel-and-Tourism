import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class loading extends JFrame implements Runnable {

    String usrn, name;
    JProgressBar pb;
    Thread t;

    loading(String usrn) {

        this.usrn = usrn;

        setTitle("Login");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(350, 200, 600, 380);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** JLabel

        JLabel text1 = new JLabel("Travel and Tourism Application");
        text1.setBounds(126, 20, 350, 30);
        text1.setForeground(new Color(204, 0, 102));
        // text1.setForeground(new Color(255, 51, 255));
        text1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(text1);

        JLabel text3 = new JLabel("Loading! Please wait..");
        text3.setBounds(200, 145, 250, 30);
        text3.setForeground(new Color(0, 128, 255));
        text3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(text3);

        try {

            Conn c = new Conn();
            String query1 = "SELECT * FROM cus_details where username = '" + usrn + "';";
            ResultSet rs = c.s.executeQuery(query1);
            if (rs.next()) {
                name = rs.getString("name");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        JLabel text2 = new JLabel("Welcome " + name);
        text2.setBounds(30, 290, 250, 30);
        text2.setForeground(new Color(0, 204, 0));
        text2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(text2);

        // ***************************************************** JProgressBar

        pb = new JProgressBar();
        pb.setBounds(140, 100, 300, 35);
        pb.setStringPainted(true);
        add(pb);

        // ***************************************************** Thread call
        t = new Thread(this);
        t.start();

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void run() {
        try {

            for (int i = 1; i <= 101; i++) {
                int max = pb.getMaximum();
                int value = pb.getValue();

                if (value < max) {
                    pb.setValue(pb.getValue() + 1);
                } else {
                    setVisible(false);
                    new dashboard(usrn).setVisible(true);
                }
                Thread.sleep(50);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new loading("");
    }

}
