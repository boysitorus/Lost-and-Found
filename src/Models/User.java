package Models;

public class User {
    private String nim;
    private String nama;
    private String password;
    private String email;
    private String noHp;
    private String role;
    
    public User(String nim, String nama, String password, String email, String noHp, String role){
        this.nim = nim;
        this.nama = nama;
        this.password = password;
        this.email = email;
        this.noHp = noHp;
        this.role = role;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
     public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
     public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
     public String getNoHp(){
        return noHp;
    }
    
    public void setNoHp(String noHp){
        this.noHp = noHp;
    }
     public String getRole(){
        return role;
    }
    
    public void setRole(String role){
       this.role = role;
    }
    
    
    @Override
    public String toString(){
        return String.format("NIM: %s, NAMA: %s, EMail: %s, NoHp: %s, Role: %s", 
                    getNim(),
                    getNama(),
                    getEmail(),
                    getNoHp(),
                    getRole()
                );
    }
}
