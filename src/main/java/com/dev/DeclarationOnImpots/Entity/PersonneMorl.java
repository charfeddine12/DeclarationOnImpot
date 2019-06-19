package com.dev.DeclarationOnImpots.Entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
public class PersonneMorl extends Contribuable {

    String RaisonSocial;
    Date DateDebutActivite;
    String SecteurActivite;
    String Activite;
    Double ChiffreDaffaire;
    String regime_impot;
    String code_tva;
    String assujettissement_tva;
    String assujettissement_impots;
    String generator_tva;
    String periodicite_acitivte;
    String periodicite_impots;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "personneMorl")
    Set<Employee> employees = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "personneMorl")
    Set<ImpotsSociete> impotsSocietes = new HashSet<>();

    public PersonneMorl(String raisonSocial, Date dateDebutActivite, String secteurActivite,
                        String activite, Double chiffreDaffaire) {
        super();
        RaisonSocial = raisonSocial;
        DateDebutActivite = dateDebutActivite;
        SecteurActivite = secteurActivite;
        Activite = activite;
        ChiffreDaffaire = chiffreDaffaire;
    }

    public PersonneMorl() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<ImpotsSociete> getImpotsSocietes() {
        return impotsSocietes;
    }

    public void setImpotsSocietes(Set<ImpotsSociete> impotsSocietes) {
        this.impotsSocietes = impotsSocietes;
    }

    public String getRaisonSocial() {
        return RaisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        RaisonSocial = raisonSocial;
    }

    public Date getDateDebutActivite() {
        return DateDebutActivite;
    }

    public void setDateDebutActivite(Date dateDebutActivite) {
        DateDebutActivite = dateDebutActivite;
    }

    public String getSecteurActivite() {
        return SecteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        SecteurActivite = secteurActivite;
    }

    public String getActivite() {
        return Activite;
    }

    public void setActivite(String activite) {
        Activite = activite;
    }

    public Double getChiffreDaffaire() {
        return ChiffreDaffaire;
    }

    public void setChiffreDaffaire(Double chiffreDaffaire) {
        ChiffreDaffaire = chiffreDaffaire;
    }

    public String getRegime_impot() {
        return regime_impot;
    }

    public void setRegime_impot(String regime_impot) {
        this.regime_impot = regime_impot;
    }

    public String getCode_tva() {
        return code_tva;
    }

    public void setCode_tva(String code_tva) {
        this.code_tva = code_tva;
    }

    public String getAssujettissement_tva() {
        return assujettissement_tva;
    }

    public void setAssujettissement_tva(String assujettissement_tva) {
        this.assujettissement_tva = assujettissement_tva;
    }

    public String getAssujettissement_impots() {
        return assujettissement_impots;
    }

    public void setAssujettissement_impots(String assujettissement_impots) {
        this.assujettissement_impots = assujettissement_impots;
    }

    public String getGenerator_tva() {
        return generator_tva;
    }

    public void setGenerator_tva(String generator_tva) {
        this.generator_tva = generator_tva;
    }

    public String getPeriodicite_acitivte() {
        return periodicite_acitivte;
    }

    public void setPeriodicite_acitivte(String periodicite_acitivte) {
        this.periodicite_acitivte = periodicite_acitivte;
    }

    public String getPeriodicite_impots() {
        return periodicite_impots;
    }

    public void setPeriodicite_impots(String periodicite_impots) {
        this.periodicite_impots = periodicite_impots;
    }

    @Override
    public String toString() {
        return "PersonneMorl{" +
                ", RaisonSocial='" + RaisonSocial + '\'' +
                ", DateDebutActivite=" + DateDebutActivite +
                ", SecteurActivite='" + SecteurActivite + '\'' +
                ", Activite='" + Activite + '\'' +
                ", ChiffreDaffaire=" + ChiffreDaffaire +
                ", regime_impot='" + regime_impot + '\'' +
                ", code_tva='" + code_tva + '\'' +
                ", assujettissement_tva='" + assujettissement_tva + '\'' +
                ", assujettissement_impots='" + assujettissement_impots + '\'' +
                ", generator_tva='" + generator_tva + '\'' +
                ", periodicite_acitivte='" + periodicite_acitivte + '\'' +
                ", periodicite_impots='" + periodicite_impots + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
