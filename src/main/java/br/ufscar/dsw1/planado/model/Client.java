package br.ufscar.dsw1.planado.model;

import java.time.LocalDate;

import br.ufscar.dsw1.planado.enumerator.ProfileEnum;

public class Client {
    private String name;
    private String CPF;
    private Login login;
    private String phone;
    private String gender;
    private LocalDate birthDate;

    public Client(String name, String CPF, String email, String senha, String phone, String gender, LocalDate birthDate) {
        this.name = name;
        this.CPF = CPF;
        this.login = new Login(email, senha, ProfileEnum.CLIENT);
        this.phone = phone;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName(){
        return this.name;
    }

    public String getCPF(){
        return this.CPF;
    }

    public String getEmailLogin(){
        return this.login.getEmail();
    }

    public String getPasswordLogin(){
        return this.login.getPassword();
    }
    
    public String getProfile(){
        return this.login.getProfile();
    }

}
