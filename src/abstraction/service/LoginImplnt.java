package abstraction.service;

import abstraction.RegistrationAbstrac;

public class LoginImplnt extends RegistrationAbstrac implements LoginService{

    @Override
    public void Login(String name, String password) {
        System.out.println("login berhalis :" + name);
    }

    @Override
    public void failedLogin() {
        System.out.println("login gagal");
    }

    @Override
    public void setToken(String token) {
        LoginService.super.setToken(token);
    }

//  overide dari RegistrationAbstrac
    @Override
    public void setUser(String name) {
        System.out.println("user create and logged: " + name);
    }
}
