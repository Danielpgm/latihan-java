package abstraction;

import abstraction.service.LoginImplnt;
import abstraction.service.LoginService;

public class Main {
    public static void main(String[] args) {
        Registration regis= new Registration();
        LoginImplnt lgn=new LoginImplnt();
        RegistrationUser uregis= new RegistrationUser();

        System.out.println();
        
        regis.SetRole("Admin");
        regis.setUser("Daniel");
        uregis.setUser("Paskalis");

        System.out.println();

        lgn.Login("daniel", "jfdklafjasd");
        lgn.setUser("paskalis");
        lgn.setToken("024025");

    }
}
