package com.esmt.noor.web;

import java.util.Date;

public class CompteRequest {
    private double solde;
    private Long idUser;

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
