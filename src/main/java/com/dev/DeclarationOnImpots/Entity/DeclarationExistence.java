package com.dev.DeclarationOnImpots.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Inheritance(strategy=InheritanceType.table_per_class)
public class DeclarationExistence /*extends DeclarationImpots*/ implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    Long CodeDE;
    String RegimeImpots;
    String CodeTva;
    String AssujettissementTva;
    String FaitGenerateurTva;
    String PeriodiciteActivite;
    String PeriodiciteDeclarationImpots;
    String AssujettissementImpots;

    public DeclarationExistence() {
        super();
        // TODO Auto-generated constructor stub
    }

    public DeclarationExistence(Long codeDE, String regimeImpots, String codeTva, String assujettissementTva,
                                String faitGenerateurTva, String periodiciteActivite, String periodiciteDeclarationImpots,
                                String assujettissementImpots) {
        super();
        CodeDE = codeDE;
        RegimeImpots = regimeImpots;
        CodeTva = codeTva;
        AssujettissementTva = assujettissementTva;
        FaitGenerateurTva = faitGenerateurTva;
        PeriodiciteActivite = periodiciteActivite;
        PeriodiciteDeclarationImpots = periodiciteDeclarationImpots;
        AssujettissementImpots = assujettissementImpots;
    }

    public String getRegimeImpots() {
        return RegimeImpots;
    }

    public void setRegimeImpots(String regimeImpots) {
        RegimeImpots = regimeImpots;
    }

    public String getCodeTva() {
        return CodeTva;
    }

    public void setCodeTva(String codeTva) {
        CodeTva = codeTva;
    }

    public String getAssujettissementTva() {
        return AssujettissementTva;
    }

    public void setAssujettissementTva(String assujettissementTva) {
        AssujettissementTva = assujettissementTva;
    }

    public String getFaitGenerateurTva() {
        return FaitGenerateurTva;
    }

    public void setFaitGenerateurTva(String faitGenerateurTva) {
        FaitGenerateurTva = faitGenerateurTva;
    }

    public String getPeriodiciteActivite() {
        return PeriodiciteActivite;
    }

    public void setPeriodiciteActivite(String periodiciteActivite) {
        PeriodiciteActivite = periodiciteActivite;
    }

    public String getPeriodiciteDeclarationImpots() {
        return PeriodiciteDeclarationImpots;
    }

    public void setPeriodiciteDeclarationImpots(String periodiciteDeclarationImpots) {
        PeriodiciteDeclarationImpots = periodiciteDeclarationImpots;
    }

    public String getAssujettissementImpots() {
        return AssujettissementImpots;
    }

    public void setAssujettissementImpots(String assujettissementImpots) {
        AssujettissementImpots = assujettissementImpots;
    }

    public Long getCodeDE() {
        return CodeDE;
    }

    public void setCodeDE(Long codeDE) {
        CodeDE = codeDE;
    }

}
