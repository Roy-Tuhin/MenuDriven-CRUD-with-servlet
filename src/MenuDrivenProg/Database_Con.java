package MenuDrivenProg;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
//import java.sql.ResultSet;
import java.sql.*;

public class Database_Con {                                                                                                 //  M A I N    C L A S S    💚

    Connection con;
    Statement stm;

    Database_Con() {                                                                                                         // C O N S T R U C T O R    🛠
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch2", "root", "");
            stm = con.createStatement();
        } catch (Exception ex) {
            System.out.println("There is a Exception1 in your code, thats why u r seeing this 💔");
        }
    }

    
    
    
    
    
    
    
    
    
    
    public void addStudent(String name, String phone, String email) {                                                                    // F U N C T I O N     addStudent     🌿
        String sql;
        
        
        
        sql = "insert into student(name, phone,email) values ('" + name + "',  '" + phone + "',    '" + email + "')";

        try {
            stm.execute(sql);
        } catch (SQLException ex) {
            System.out.println("There is a Exception2 in your code, thats why u r seeing this 💔");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    public ArrayList<Student> showStudents() {                  // <Student> is our bin class                                         // F U N C T I O N     showStudents    🌿
        String sql;
        
        
        
        sql = "select * from student";

        ArrayList<Student> obj2 = new ArrayList<>();           // obj2  ArrayList object

    
        
        try {
           ResultSet rs = stm.executeQuery(sql);
            if (rs.first()) {
                do {
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    String phone = rs.getString("phone");
                    String email = rs.getString("email");

                    Student s = new Student(id, name, phone, email);             // 's'  is Student-class object  
                    obj2.add(s);                                                            // 'obj2'   calling with  ArrayList object.

                } while (rs.next());

            } else {
                System.out.println("No record found");
            }

        } catch (SQLException e) {
             System.out.println(e);

        }

        return obj2;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void updateStudent(String name, String phone, String email, String id) {
        String sql;
        
        
        sql = "update  student set name='" + name + "',  phone='" + phone + "',    email='" + email + "'   where id= '" + id + "'         ";

        try {
            stm.execute(sql);
        } catch (SQLException ex) {
            System.out.println("There is a Exception2 in your code, thats why u r seeing this 💔");
        }
    }

    
    
    
 
    
    
    
    
        
    public void deleteStudent(String id) {
        String sql;
        
        
        sql = "delete from student where id ='" + id + "'";
        try {
            stm.execute(sql);
        } catch (SQLException ex) {
            System.out.println("There is a Exception2 in your code, thats why u r seeing this 💔");
        }
    }

}
