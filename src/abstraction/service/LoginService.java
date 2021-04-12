package abstraction.service;

public interface LoginService {
// setiap method yang ada didalam interface sudah pasti abstrac method

//method  abstrac tanpa body
    public void Login(String name, String password);
    public void failedLogin();

//  method abstrac dengan body
    default void setToken(String token){
        System.out.println("token created: " + token);
        forgotPassword(token);
    }

//  static method -- dengan body -- tidak bisa diturunkan pada anak
//  hanya bisa digunakan pada class ini saja
    static void forgotPassword(String Newpassword){
        System.out.println("created new password: " + Newpassword);
    }
}
