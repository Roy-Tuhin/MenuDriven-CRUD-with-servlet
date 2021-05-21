package batch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;







public class Database {                                                                                                 //  M A I N    C L A S S    💚

    Connection con;
    Statement stm;

    
    
    
    
    public static void main(String[] args) {                                                                            // M A I N      M E T H O D   ☘
        Database obj = new Database();

        obj.addStudent("Kinkar", "10059", "kinkar@gmail.com");
        System.out.println("Added into student table DONE");
    }

    
    
    
    
    
    Database() {                                                                                                         // C O N S T R U C T O R    🛠
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch2", "root", "");
            stm = con.createStatement();
        } catch (Exception ex) {
            System.out.println("There is a Exception1 in your code, thats why u r seeing this 💔");
        }
    }
    
    
    
    
    
    
    

    public void addStudent(String name, String phone, String email) {                                                    // F U N C T I O N          🌿
        String sql = "insert into student(name, phone,email) values ('" + name + "',  '" + phone + "',    '" + email + "')";

        try {
            stm.execute(sql);
        } catch (SQLException ex) {
            System.out.println("There is a Exception2 in your code, thats why u r seeing this 💔");
        }
    }

}
