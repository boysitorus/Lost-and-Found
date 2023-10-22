package Utils;
import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Models.Database;


public class DatabaseUtil {
    private Database config;
    private Connection dbCon;
    private Statement dbStmnt;
    private ResultSet dbRs;
    private PreparedStatement dbPre;
    
    public DatabaseUtil(){
        this.config = new Database(
                "localhost",
                3306,
                "root",
                "root",
                "k05"
        );
    
        try{
            dbCon = createCon();
            dbStmnt = dbCon.createStatement();
        } catch(SQLException e){
            Logger.getLogger(MySQLConnection.class.getName()).log(
                            Level.SEVERE, null, e);
        }

        try{
            Class.forName(ConstUtil.DRIVER_MYSQL).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex){
            ToolsUtil.Log("ERROR", ToolsUtil.errorMessage(100));
        }  
    }
    
    public Connection getConnection(){
        return dbCon;
    }
    
    private Connection createCon() throws SQLException {
        if(this.config.getPort() > 0){
            return DriverManager.getConnection(
                    "jdbc:mysql:" + "//" + this.config.getHost() + ":"
                    + this.config.getPort() + "/"
                    + this.config.getDatabase() + "?"
                    + "user=" + this.config.getUsername()
                    + "&password=" + this.config.getPassword()                        
            );
        } else{
            return DriverManager.getConnection(
                    "jdbc:mysql:" + "//" + this.config.getHost() + "/"
                    + this.config.getDatabase() + "?"
                    + "user=" + this.config.getUsername()
                    + "&password=" + this.config.getPassword()                                              
            );        
        }
    }
    
    public boolean stop(){
        try {
            dbStmnt.close();
            dbCon.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ResultSet executeSelect(String query){
        try{
            dbRs = dbStmnt.executeQuery(query);
            return dbRs;
        } catch(SQLException e){
            return null;
        }
    }
    
    public boolean execute(String query){
        try {
            dbStmnt.executeUpdate(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ResultSet executeSelect(String query, ArrayList<String> data){
        try {
            dbPre = (PreparedStatement) dbCon.prepareStatement(query);
            for(int i = 0; i < data.size(); i++){
                dbPre.setString((i+1), data.get(i));
            }
            dbRs = dbPre.executeQuery();
            return dbRs;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public boolean execute(String query, ArrayList<String> data){
        try {
            dbPre = (PreparedStatement) dbCon.prepareStatement(query);
            for(int i = 0; i < data.size(); i++){
                dbPre.setString((i+1), data.get(i));
            }
            dbPre.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}



