package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {

    Connection conn = null;
    Statement stmt = null;
    ResultSet res = null;

    public Database() {
        try {
            String url = "jdbc:mysql://localhost:3306/pi";
            String usuario = "root";
            String senha = "";
            conn = DriverManager.getConnection(url, usuario, senha);

            //Statement executeQuery = conn.createStatement();
        } catch (
                SQLException e) {
            //TODO: handle exception
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore
                stmt = null;
            }
        }
    }
}

