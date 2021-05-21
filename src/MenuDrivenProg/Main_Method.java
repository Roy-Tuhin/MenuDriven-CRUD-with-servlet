
package MenuDrivenProg;

import java.util.ArrayList;
import java.util.Scanner;


public class Main_Method {

    public static void main(String[] args) {                                                                            // M A I N      M E T H O D   ☘

        int i = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter 1 to Add  ::  2 to View   ::  3 to Update ::  4 to Delete");
            
            i= sc.nextInt();
            
            
            switch(i){
                case 1: add(); break;
                case 2: view(); break;
                case 3: update(); break;
                case 4: delete(); break;
                default: System.exit(0);
            }
        } while (true);

    }
    
    
    
    
    
    
    public static void add(){
        String name;
        String phone;
        String email;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter name");
        name= sc.nextLine();
         
        System.out.println("Please enter phone");
        phone= sc.nextLine();
         
        System.out.println("Please enter email");
        email= sc.nextLine();
         
         
         
        Database_Con obj = new Database_Con();
        obj.addStudent(name, phone, email);
        System.out.println("Inserted Successfully");
    }
    
    
  
    
    
    
    
    
    
    
    
    
    
    public static void view(){
         Database_Con obj = new Database_Con();
         ArrayList<Student> studentobj = obj.showStudents();
         
//          System.out.println("All students"    +studentobj.size());
         
         
         for (int i=0; i<studentobj.size(); i++){
             System.out.println("Name is"  +studentobj.get(i).name      +     "Phone is"  +studentobj.get(i).phone    +  "Email is" +studentobj.get(i).email      +      "Id is"  +studentobj.get(i).id      );
             System.out.println("===================================================");
         }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void update(){
        String name;
        String phone;
        String email;
         String id;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter id to update");
        id= sc.nextLine();
        
        
        
        
        
        
        System.out.println("Please enter name");
        name= sc.nextLine();
         
        System.out.println("Please enter phone");
        phone= sc.nextLine();
         
        System.out.println("Please enter email");
        email= sc.nextLine();
         
         
         
        Database_Con obj = new Database_Con();
        obj.updateStudent(name, phone, email,id);
        System.out.println("Update Successfully");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void delete(){
        String id;
        
        
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter id to delete");
        id= sc.nextLine();
        
        
        
        Database_Con obj = new Database_Con();
        obj.deleteStudent(id);
        
        
         System.out.println("delete Successfully");
    }
}
