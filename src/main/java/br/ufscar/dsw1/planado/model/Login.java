package br.ufscar.dsw1.planado.model;

import br.ufscar.dsw1.planado.enumerator.ProfileEnum;

public class Login {
    private String email;
    private String password;
    private ProfileEnum profile;

    public Login(String email, String password, ProfileEnum profile) {
        this.email = email;
        this.password = password;
        this.profile = profile;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public String getProfile() {
        return ProfileEnum.CLIENT.toString();
    }
}
