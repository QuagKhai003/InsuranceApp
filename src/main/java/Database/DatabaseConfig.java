package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    public static Connection con = null;
    public static void connection() {
        try {
            // Establish Connection
            con = DriverManager.getConnection(
                    "jdbc:postgresql://aws-0-ap-southeast-1.pooler.supabase.com:5432/postgres?user=postgres.wyemaioitieansuvjkoi&password=Team14GroupProjectInsuranceApp");
            System.out.println("Connect to Supabase successfully!");
        } catch (SQLException e) {
            System.out.println("Connect to Supabase failed!");
            e.printStackTrace();
        }
    }
}
