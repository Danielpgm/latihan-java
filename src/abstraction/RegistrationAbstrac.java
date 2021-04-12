package abstraction;

public abstract class RegistrationAbstrac {
    public abstract void setUser(String name);

    void SetRole(String role){
        System.out.println("role create:" + role);

        //memanggil static method setLevel
        setLevel(1);
    }

//  static method yang tidak bisa di panggil di class lain
    static void setLevel(Integer level){
        System.out.println("level: "+ level);
    }
}
