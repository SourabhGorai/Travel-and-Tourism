import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class payment extends JFrame implements ActionListener{

    String usrn;
    JButton back, pay;

    payment(String usrn){

        this.usrn = usrn;

        setTitle("Payment");
        setLayout(null);
        setLocationRelativeTo(null);
        setBounds(290, 120, 700, 600);
        setMaximizedBounds(getBounds());
        setResizable(false);
        getContentPane().setBackground(Color.WHITE);

        // ***************************************************** IMAGE

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(-55, 67, 800, 500);
        add(img);

        // *****************************************************JBUTTON

        back = new JButton("Back");
        back.setBounds(50, 30, 100, 30);
        back.setFocusable(false);
        back.setFont(new Font("Osward", Font.BOLD, 16));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBackground(new Color(255, 0, 0));
        back.setForeground(new Color(255, 225, 255));
        back.addActionListener(this);
        add(back);

        pay = new JButton("Check Price");
        pay.setBounds(520, 30, 120, 30);
        pay.setFocusable(false);
        pay.setFont(new Font("Osward", Font.BOLD, 16));
        pay.setBorder(BorderFactory.createEmptyBorder());
        pay.setBackground(new Color(153,204,255));
        pay.setForeground(Color.white);
        // cp_Button.setForeground(new Color(255, 225, 255));
        pay.addActionListener(this);
        add(pay);

        // *****************************************************

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == back){
            setVisible(false);
        }else if(ae.getSource() == pay) {
            new paytm(usrn);
        }

    }

    public static void main(String[] args) {
        new payment("admin");
    }
    
}
