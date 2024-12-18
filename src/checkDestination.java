import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class checkDestination extends JFrame implements Runnable {

    String usrn;
    JLabel il1, il2, il3, il4, il5, il6, il7, il8, il9, il10;
    JLabel[] imgL = new JLabel[] { il1, il2, il3, il4, il5, il6, il7, il8, il9, il10 };
    Thread t1;
    // String[] text = new String[] {"JW Marriott Hotel", "Madarin Oriental Hotel",
    // "Four Seasons Hotel", "Raddission Blue Hotel", "Classio Hotel", "The Bay Club
    // Hotel", "Breeze Blow Hotel", "The Taj Hotel", "Happy Morning Motel", "River
    // View Hotel"};
    // JLabel caption;

    public void run() {

        try {
            for (int i = 0; i <= 9; i++) {
                imgL[i].setVisible(true);
                // caption.setText(text[i]);
                Thread.sleep(2000);
                imgL[i].setVisible(false);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    checkDestination(String usrn) {

        this.usrn = usrn;

        // caption = new JLabel();
        // caption.setBounds(550, 500, 550, 40);
        // caption.setForeground(Color.WHITE);
        // caption.setFont(new Font("Tahoma", Font.BOLD, 35));
        // add(caption);

        setTitle("Check Hotels");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(140, 100, 1000, 600);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** IMAGE

        ImageIcon i1 = null, i2 = null, i3 = null, i4 = null, i5 = null, i6 = null, i7 = null, i8 = null, i9 = null,
                i10 = null;
        ImageIcon[] iimage = new ImageIcon[] { i1, i2, i3, i4, i5, i6, i7, i8, i9, i10 };

        Image j1 = null, j2 = null, j3 = null, j4 = null, j5 = null, j6 = null, j7 = null, j8 = null, j9 = null,
                j10 = null;
        Image[] jimage = new Image[] { j1, j2, j3, j4, j5, j6, j7, j8, j9, j10 };

        ImageIcon k1 = null, k2 = null, k3 = null, k4 = null, k5 = null, k6 = null, k7 = null, k8 = null, k9 = null,
                k10 = null;
        ImageIcon[] kimage = new ImageIcon[] { k1, k2, k3, k4, k5, k6, k7, k8, k9, k10 };

        try {

            for (int c = 0; c <= 9; c++) {
                iimage[c] = new ImageIcon(ClassLoader.getSystemResource("icons/dest" + (c + 1) + ".jpg"));
                jimage[c] = iimage[c].getImage().getScaledInstance(1000, 570, Image.SCALE_DEFAULT);
                kimage[c] = new ImageIcon(jimage[c]);
                imgL[c] = new JLabel(kimage[c]);
                imgL[c].setBounds(0, 0, 1000, 570);
                add(imgL[c]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dest10.jpg"));
        // Image i2 = i1.getImage().getScaledInstance(600, 350, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel img = new JLabel(i3);
        // img.setBounds(450, 55, 500, 400);
        // add(img);


        // *****************************************************Runnable

        t1 = new Thread(this);
        t1.start();

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new checkDestination("admin");
    }
}
