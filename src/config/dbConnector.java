
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DERECHO
 */
public class dbConnector {
     
    private Connection connect;

    public dbConnector(){
        try{
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/petadapt24", "root", "");
        }catch(SQLException ex){
                System.out.println("Can't connect to database: "+ex.getMessage());
        }
    }
    

   //Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
    }
        
        //Function to save data
             public void insertData(String sql) {
              try {
              PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                 System.out.println("Inserted Successfully!");
                     pst.close();
                 } catch (SQLException ex) {
                System.out.println("Connection Error: " + ex);
             }   
        }
        
   public boolean updateData(String sql) {
    try {
        PreparedStatement pst = connect.prepareStatement(sql);
        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Data Updated Successfully");
            return true;
        } else {
            System.out.println("Data Update Failed ");
            return false;
        }
    } catch (SQLException ex) {
        System.out.println("Connection Error: " + ex);
        return false;
    }
}
             public boolean deleteData(String sql) {
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            int rowsDeleted = pst.executeUpdate();
            pst.close();
            return rowsDeleted > 0;
        } catch(SQLException ex) {
            System.out.println("Connection Error: " + ex);
            return false;
         }
        }
              public boolean archiveData(String sql) {
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            int rowsUpdated = pst.executeUpdate();
            pst.close();
            return rowsUpdated > 0;
        } catch(SQLException ex) {
            System.out.println("Connection Error: " + ex);
            return false;
        }
    }
               public boolean adoptPet(String sql) {
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            int rowsUpdated = pst.executeUpdate();
            pst.close();
            return rowsUpdated > 0;
        } catch(SQLException ex) {
            System.out.println("Connection Error: " + ex);
            return false;
        }
    }
}
