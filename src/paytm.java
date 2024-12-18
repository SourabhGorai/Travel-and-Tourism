// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;
// import java.sql.ResultSet;

// public class paytm extends JFrame{
    
//     String usrn;

//     paytm(String usrn){

//         this.usrn = usrn;

//         setTitle("Paytm");
//         // setLayout(null);
//         // setLocationRelativeTo(null);
//         setBounds(290, 40, 700, 750);
//         // setMaximizedBounds(getBounds());
//         // setResizable(false);
//         // getContentPane().setBackground(Color.WHITE);

//         // *****************************************************SCROLL

//         JEditorPane pane = new JEditorPane();
//         pane.setEditable(false);

//         try{

//             pane.setPage("https://paytm.com/rent-payment");

//         }catch(Exception e){
//             pane.setContentType("text/html");
//             pane.setText("<html>Could not load, Error 404 </html>");
//         }

//         JScrollPane sb = new JScrollPane(pane);
//         getContentPane().add(sb);

//         setVisible(true);
//         setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//     }

//     public static void main(String[] args) {
//         new paytm("admin");
//     }
// }


import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class paytm extends JFrame {
    
    String usrn;

    paytm(String usrn) {
        this.usrn = usrn;

        setTitle("Paytm");
        setBounds(290, 40, 700, 750);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);

        try {
            // pane.setPage("https://paytm.com/rent-payment");
            pane.setPage("https://pay.google.com/gp/w/u/0/home/paymentmethods");
        } catch (IOException e) {
            e.printStackTrace();
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404 </html>");
        }

        JScrollPane sb = new JScrollPane(pane);
        getContentPane().add(sb, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new paytm("admin");
    }
}
