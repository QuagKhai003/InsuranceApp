package InsuranceEmployee;

import Database.DatabaseConfig;
import InsuranceClaims.*;
import javafx.scene.image.ImageView;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeController {
    public static boolean displayClaim(String cID) {
        try {
            Statement stm = DatabaseConfig.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery(String.format("SELECT * FROM claims WHERE insured_person='%s' ", cID));
            while(rs.next()) {
                System.out.println(rs.getRow());
                System.out.println(rs.getString("fid"));
                System.out.println(rs.getString("status"));
                rs.updateString("status","done");
                rs.updateRow();
                System.out.println("data changed: " + rs.getString("status"));
                /*Statement nestedStatement = DatabaseConfig.con.createStatement();
                nestedStatement.executeUpdate(String.format("UPDATE claims SET status='done' WHERE fid='%s' ", fid));
                ResultSet rs1 = nestedStatement.executeQuery(String.format("SELECT * FROM claims WHERE fid='%s'",fid));
                while(rs1.next()) {
                    System.out.println("Data has been changed: ");
                    System.out.println(rs1.getString("fid"));
                    System.out.println(rs1.getString("status"));
                }*/

            }
            rs.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Proposing process error: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        DatabaseConfig.connection();
        String cID = "c-0000014";
        displayClaim(cID);
    }
}
