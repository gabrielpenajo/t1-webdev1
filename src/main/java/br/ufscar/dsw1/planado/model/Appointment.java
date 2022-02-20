package br.ufscar.dsw1.planado.model;

import java.time.LocalDateTime;

public class Appointment {
    private String clientCPF;
    private String professionalCPF;
    private LocalDateTime date;

    public Appointment(String clientCPF, String professionalCPF, LocalDateTime date) {
        this.clientCPF = clientCPF;
        this.professionalCPF = professionalCPF;
        this.date = date;
    }

    public String getClientCPF() {
        return clientCPF;
    }

    public void setClientCPF(String clientCPF) {
        this.clientCPF = clientCPF;
    }

    public String getProfessionalCPF() {
        return professionalCPF;
    }

    public void setProfessionalCPF(String professionalCPF) {
        this.professionalCPF = professionalCPF;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
