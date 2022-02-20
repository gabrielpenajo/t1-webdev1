package br.ufscar.dsw1.planado.model;

import br.ufscar.dsw1.planado.enumerator.ProfileEnum;

import java.sql.Blob;

public class Professional {
    private String name;
    private String CPF;
    private Login login;
    private String workField;
    private String expertise;
    private Blob resume;

    public Professional(String name, String CPF, String email, String senha, String workField, String expertise, Blob resume) {
        this.name = name;
        this.CPF = CPF;
        this.login = new Login(email, senha, ProfileEnum.PROFESSIONAL);
        this.workField = workField;
        this.expertise = expertise;
        this.resume = resume;
    }

    public String getWorkField() {
        return workField;
    }

    public void setWorkField(String workField) {
        this.workField = workField;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public Blob getResume() {
        return resume;
    }

    public void setResume(Blob resume) {
        this.resume = resume;
    }

}
