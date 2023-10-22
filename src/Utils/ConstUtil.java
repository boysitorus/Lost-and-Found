package Utils;
import Models.User;

public class ConstUtil {
    public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
    public static User auth = null;
    public static String getNama() {
        return auth.getNama(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getNim() {
        return auth.getNim(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getPassword() {
        return auth.getPassword(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getRole() {
        return auth.getRole(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
//    public static int getId() {
//        return auth.getId(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
