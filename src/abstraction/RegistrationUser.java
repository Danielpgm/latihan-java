package abstraction;

public class RegistrationUser extends RegistrationAbstrac {

    // memanggil method setUser yang di isi untuk nama user
    @Override
    public void setUser(String name) {
        System.out.println("user created: " +name);
    }
}
