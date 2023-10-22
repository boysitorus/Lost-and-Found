import Controllers.UserController;
//import Controllers.BarangController;

public class Driver {
    public static void main(String[] args) {
        UserController uc = new UserController();
        System.out.println(uc.getAll().toString());
    }
}
