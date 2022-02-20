package br.ufscar.dsw1.planado.model;

import br.ufscar.dsw1.planado.enumerator.ProfileEnum;

public class Administrator {
    private String name;
    private Login login;
    
    public Administrator(String name, String email, String password) {
        this.name = name;
        this.login = new Login(email, password, ProfileEnum.ADMIN);
    }
}
