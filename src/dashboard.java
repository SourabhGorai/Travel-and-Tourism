import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.Book;

public class dashboard extends JFrame implements ActionListener {

        JPanel p1, p2;
        String usrn;
        JButton add_pdButton, update_pdButton, viewDetails_Button, DeleteButton,
                        checkButton, bookButton,
                        viewPackage_Button, viewHotels_Button,
                        bookHotelsButton, BookedHotel_button, dest_Button, paymeButton,
                        calculatorButton, notepadButton,
                        aboutButton, logout;

        dashboard(String usrn) {

                this.usrn = usrn;

                setTitle("Dashboard");
                setLayout(null);
                setLocationRelativeTo(null);
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                // setResizable(false);
                getContentPane().setBackground(Color.WHITE);

                //
                // *****************************************************Panel1*****************************

                p1 = new JPanel();
                p1.setLayout(null);
                p1.setBackground(new Color(0, 36, 107));
                p1.setBounds(0, 0, 1290, 50);
                // setLocationRelativeTo(null);
                add(p1);

                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
                Image i2 = i1.getImage().getScaledInstance(50, 60, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel img = new JLabel(i3);
                img.setBounds(10, -4, 50, 60);
                p1.add(img);

                JLabel text = new JLabel("Dashboard");
                text.setBounds(70, 8, 150, 30);
                text.setForeground(Color.white);
                text.setFont(new Font("SAN_SERIF", Font.BOLD, 28));
                p1.add(text);

                logout = new JButton("Logout");
                logout.setFocusable(false);
                logout.setBorder(new LineBorder(new Color(255, 178, 102)));
                logout.setForeground(new Color(204,0,0));
                logout.setBackground(new Color(255, 255, 255));
                logout.setFont(new Font("Raleway", Font.BOLD, 25));
                logout.setBounds(1182,0, 100, 50);
                logout.addActionListener(this);
                p1.add(logout);

                //
                // ****************************************************************************************
                // //
                // *****************************************************Panel2*****************************

                p2 = new JPanel();
                p2.setLayout(null);
                // setLocationRelativeTo(null);
                p2.setBackground(new Color(153, 204, 255));
                p2.setBounds(0, 50, 250, 750);
                add(p2);

                // ***************************************************** JButton

                add_pdButton = new JButton("Add Personal Details");
                add_pdButton.setFocusable(false);
                add_pdButton.setBackground(new Color(0, 153, 0));
                add_pdButton.setForeground(Color.WHITE);
                add_pdButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 80)));
                add_pdButton.setBounds(0, 0, 290, 50);
                add_pdButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                add_pdButton.addActionListener(this);
                p2.add(add_pdButton);

                update_pdButton = new JButton("Update Personal Details");
                update_pdButton.setFocusable(false);
                update_pdButton.setBackground(new Color(0, 153, 0));
                update_pdButton.setForeground(Color.WHITE);
                update_pdButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 80)));
                update_pdButton.setBounds(0, 50, 320, 50);
                update_pdButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                update_pdButton.addActionListener(this);
                p2.add(update_pdButton);

                viewDetails_Button = new JButton("View Personal Details");
                viewDetails_Button.setFocusable(false);
                viewDetails_Button.setBackground(new Color(0, 153, 0));
                viewDetails_Button.setForeground(Color.WHITE);
                viewDetails_Button.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 0, 0, 90)));
                viewDetails_Button.setBounds(0, 100, 320, 50);
                viewDetails_Button.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                viewDetails_Button.addActionListener(this);
                p2.add(viewDetails_Button);

                DeleteButton = new JButton("Delete Personal Details");
                DeleteButton.setFocusable(false);
                DeleteButton.setBackground(new Color(0, 153, 0));
                DeleteButton.setForeground(Color.WHITE);
                DeleteButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 85)));
                DeleteButton.setBounds(0, 150, 320, 50);
                DeleteButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                DeleteButton.addActionListener(this);
                p2.add(DeleteButton);

                checkButton = new JButton("Check Package");
                checkButton.setFocusable(false);
                checkButton.setBackground(new Color(0, 153, 0));
                checkButton.setForeground(Color.WHITE);
                checkButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 160)));
                checkButton.setBounds(0, 200, 320, 50);
                checkButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                checkButton.addActionListener(this);
                p2.add(checkButton);

                bookButton = new JButton("Book Package");
                bookButton.setFocusable(false);
                bookButton.setBackground(new Color(0, 153, 0));
                bookButton.setForeground(Color.WHITE);
                bookButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 170)));
                bookButton.setBounds(0, 250, 320, 50);
                bookButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                bookButton.addActionListener(this);
                p2.add(bookButton);

                viewPackage_Button = new JButton("View Package");
                viewPackage_Button.setFocusable(false);
                viewPackage_Button.setBackground(new Color(0, 153, 0));
                viewPackage_Button.setForeground(Color.WHITE);
                viewPackage_Button.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 170)));
                viewPackage_Button.setBounds(0, 300, 320, 50);
                viewPackage_Button.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                viewPackage_Button.addActionListener(this);
                p2.add(viewPackage_Button);

                viewHotels_Button = new JButton("View Hotels");
                viewHotels_Button.setFocusable(false);
                viewHotels_Button.setBackground(new Color(0, 153, 0));
                viewHotels_Button.setForeground(Color.WHITE);
                viewHotels_Button.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 160)));
                viewHotels_Button.setBounds(0, 350, 290, 50);
                viewHotels_Button.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                viewHotels_Button.addActionListener(this);
                p2.add(viewHotels_Button);

                bookHotelsButton = new JButton("Book Hotels");
                bookHotelsButton.setFocusable(false);
                bookHotelsButton.setBackground(new Color(0, 153, 0));
                bookHotelsButton.setForeground(Color.WHITE);
                bookHotelsButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 160)));
                bookHotelsButton.setBounds(0, 400, 290, 50);
                bookHotelsButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                bookHotelsButton.addActionListener(this);
                p2.add(bookHotelsButton);

                BookedHotel_button = new JButton("View Booked Hotel");
                BookedHotel_button.setFocusable(false);
                BookedHotel_button.setBackground(new Color(0, 153, 0));
                BookedHotel_button.setForeground(Color.WHITE);
                BookedHotel_button.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 160)));
                BookedHotel_button.setBounds(0, 450, 350, 50);
                BookedHotel_button.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                BookedHotel_button.addActionListener(this);
                p2.add(BookedHotel_button);

                dest_Button = new JButton("Destination");
                dest_Button.setFocusable(false);
                dest_Button.setBackground(new Color(0, 153, 0));
                dest_Button.setForeground(Color.WHITE);
                dest_Button.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 170)));
                dest_Button.setBounds(0, 500, 290, 50);
                dest_Button.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                dest_Button.addActionListener(this);
                p2.add(dest_Button);

                paymeButton = new JButton("Payment");
                paymeButton.setFocusable(false);
                paymeButton.setBackground(new Color(0, 153, 0));
                paymeButton.setForeground(Color.WHITE);
                paymeButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 200)));
                paymeButton.setBounds(0, 550, 290, 45);
                paymeButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                paymeButton.addActionListener(this);
                p2.add(paymeButton);

                calculatorButton = new JButton("Calculator");
                calculatorButton.setFocusable(false);
                calculatorButton.setBackground(new Color(0, 153, 0));
                calculatorButton.setForeground(Color.WHITE);
                calculatorButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 180)));
                calculatorButton.setBounds(0, 595, 290, 45);
                calculatorButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                calculatorButton.addActionListener(this);
                p2.add(calculatorButton);

                notepadButton = new JButton("Notepad");
                notepadButton.setFocusable(false);
                notepadButton.setBackground(new Color(0, 153, 0));
                notepadButton.setForeground(Color.WHITE);
                notepadButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 200)));
                notepadButton.setBounds(0, 640, 290, 45);
                notepadButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                notepadButton.addActionListener(this);
                p2.add(notepadButton);

                aboutButton = new JButton("About");
                aboutButton.setFocusable(false);
                aboutButton.setBackground(new Color(0, 153, 0));
                aboutButton.setForeground(Color.WHITE);
                aboutButton.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(255, 255, 0)),
                                BorderFactory.createEmptyBorder(0, 5, 0, 180)));
                aboutButton.setBounds(0, 685, 250, 45);
                aboutButton.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
                aboutButton.addActionListener(this);
                p2.add(aboutButton);

                // *****************************************************JPanel3

                ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
                Image i5 = i4.getImage().getScaledInstance(1300, 750, Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel img2 = new JLabel(i6);
                img2.setBounds(70, 50, 1290, 750);
                add(img2);

                JLabel text2 = new JLabel("The whole world awaits");
                text2.setBounds(450, 50, 550, 50);
                text2.setForeground(Color.WHITE);
                text2.setFont(new Font("SAN_SERIF", Font.BOLD, 45));
                img2.add(text2);

                // *****************************************************

                setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);

        }

        public void actionPerformed(ActionEvent ae) {

                if (ae.getSource() == add_pdButton) {
                        System.out.println(1);
                        new add_Cus(usrn);
                } else if (ae.getSource() == update_pdButton) {
                        System.out.println(2);
                        new update_Cus1(usrn);
                } else if (ae.getSource() == viewDetails_Button) {
                        System.out.println(3);
                        new viewDetails(usrn);
                } else if (ae.getSource() == DeleteButton) {
                        System.out.println(4);
                        new deleteDetails(usrn);
                } else if (ae.getSource() == checkButton) {
                        System.out.println(5);
                        new checkpackages(usrn);
                } else if (ae.getSource() == bookButton) {
                        System.out.println(6);
                        new book_Package(usrn);
                } else if (ae.getSource() == viewPackage_Button) {
                        System.out.println(7);
                        new package_Details(usrn);
                } else if (ae.getSource() == viewHotels_Button) {
                        System.out.println(8);
                        new checkHotels(usrn);
                } else if (ae.getSource() == dest_Button) {
                        System.out.println(9);
                        new checkDestination(usrn);
                } else if (ae.getSource() == bookHotelsButton) {
                        System.out.println(10);
                        new bookHotel(usrn);
                } else if (ae.getSource() == BookedHotel_button) {
                        System.out.println(11);
                        new viewBookedHotel(usrn);
                } else if (ae.getSource() == paymeButton) {
                        new payment(usrn);
                } else if (ae.getSource() == calculatorButton) {
                        try {
                                Runtime.getRuntime().exec("calc.exe");
                        } catch (Exception e) {
                                System.out.println(e);
                        }
                } else if (ae.getSource() == notepadButton) {
                        try {
                                Runtime.getRuntime().exec("notepad.exe");
                        } catch (Exception e) {
                                System.out.println(e);
                        }
                } else if (ae.getSource() == aboutButton) {
                        new about(usrn);
                } else if(ae.getSource()==logout){
                        setVisible(false);
                        new login();
                }

        }

        public static void main(String[] args) {
                new dashboard("admin");
        }
}
