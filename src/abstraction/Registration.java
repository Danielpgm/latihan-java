package abstraction;

public class Registration extends RegistrationAbstrac {

    //memanggil method abstrac setUser tapi digunakan untuk membuat admin
    @Override
    public void setUser(String name) {
        System.out.println("user admin create: " +name);
    }

    // memanggil method setRole
    @Override
    void SetRole(String role) {
        super.SetRole(role);
    }
    
}
