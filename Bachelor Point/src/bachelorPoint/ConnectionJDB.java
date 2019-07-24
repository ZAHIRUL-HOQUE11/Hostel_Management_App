package bachelorPoint;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionJDB {

    Connection con = null;
    Statement st = null;

    public void createConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bachelor_point", "root", "");
            st = con.createStatement();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void dataInsert(String sql) {
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
