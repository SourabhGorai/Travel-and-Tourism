// package package1;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {

            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","#88Deepu");
            s = c.createStatement();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
