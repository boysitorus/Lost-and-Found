package Controllers;

import com.mysql.jdbc.PreparedStatement;
import Utils.DatabaseUtil;
import java.sql.ResultSet;
import java.util.ArrayList;
import Models.User;

public class UserController {
    private DatabaseUtil koneksi;
    private ResultSet rs;
    private PreparedStatement pre;
    
    public UserController(){
        koneksi = new DatabaseUtil();
    }
    
    public ArrayList<User> getAll(){
        ArrayList<User> result = new ArrayList<>();
        rs = koneksi.executeSelect("SELECT * FROM users");
        if(rs != null){
            try{
                while(rs.next()){
                    User pengguna = new User (
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                    );
                    result.add(pengguna);
                }
            } 
            catch(Exception ex){
                        
            }          
        }
        return result;
    }
    
    public User getByNim(String nim){
        ArrayList<String> data = new ArrayList<>();
        data.add(String.valueOf(nim));
        User pengguna = null;
        
        rs = koneksi.executeSelect("SElECT * FROM users WHERE nim  = ?", data);
        if(rs != null){
            try{
                while(rs.next()){
                    pengguna = new User (
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                        );
                    break;
                }
            }
            catch(Exception ex){
                
            }
        }
        return pengguna;
    }
    
//    public Boolean update(String user_id, String name, String username, String password){
//        ArrayList<String> data = new ArrayList<>();
//        data.add(name);
//        data.add(username);
//        data.add(username);
//        data.add(user_id);
//        if(koneksi.execute("UPDATE users SET name = ?, username = ?, " + "password = ? WHERE id = ?", data )){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
    
//    public Boolean delete(String user_id){
//        ArrayList<String> data = new ArrayList<>();
//        data.add(user_id);
//        if(koneksi.execute("DELETE FROM users WHERE id = ?", data)){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
    
    public Boolean insert(User pengguna){
        ArrayList<String> data = new ArrayList<>();
        if(pengguna.getNim() != null){
            data.add(pengguna.getNim());
        }
        data.add(pengguna.getNama());
        data.add(pengguna.getPassword());
        data.add(pengguna.getEmail());
        data.add(pengguna.getNoHp());
        data.add(pengguna.getRole());
        
        if(koneksi.execute("INSERT INTO users (nim, nama, kata_sandi, email, no_hp, roles) " + "VALUES (?, ?, ?, ?, ?, ?)", data)){
            return true;
        }
        else{
            return false;
        }
    }
        
    public User getLogin(String nim, String password){
        ArrayList<String> data = new ArrayList<>();
        data.add(nim);
        data.add(password);
        
        User pengguna = null;
        
        rs = koneksi.executeSelect("SELECT * FROM users WHERE nim = ? AND kata_sandi = ?", data);
        if(rs != null){
            try {
                while(rs.next()){
                    pengguna = new User(rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                    );
                }
            } catch (Exception e) {
                
            }
        }
        return pengguna;
    }
    
    public void close(){
        koneksi.stop();
    }
}
