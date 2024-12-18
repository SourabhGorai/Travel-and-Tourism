import javax.swing.*;
import java.awt.*;

public class splash extends JFrame implements Runnable {

    Thread thread;

    splash() {

        setTitle("Splash");
        setLayout(null);
        setLocationRelativeTo(null);
        // setBounds(160,130,950,550);
        // setMaximizedBounds(getBounds());
        // setResizable(false);

        // ***************************************** ImageIcon

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/world2.png"));
        Image i1 = i.getImage().getScaledInstance(990, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);
        JLabel img = new JLabel(i3);
        img.setBounds(-10, 0, 1000, 480);
        add(img);

        // ****************************************************

        setVisible(true);
        thread = new Thread(this);
        thread.start();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void run() {
        try {
            Thread.sleep(10000);
            new login();
            setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        splash frame = new splash();

        for (int i = 1; i <= 500; i++) {
            frame.setBounds(630 - i, 400 - (i / 2), 2 * i, i);
            try {
                Thread.sleep(6);
            } catch (Exception e) {
            }

        }

    }

}
