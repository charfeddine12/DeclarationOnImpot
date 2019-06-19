package com.dev.DeclarationOnImpots.Entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
//@Inheritance(strategy=InheritanceType.table_per_class)
public class Employee implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    Long
            NumEmployee;
    String Poste;
    Date DateDebutService;
    Date DateFinService;
    Double SalaireBrut;
    Double PrivilegeNature;
    Double TotalRevenuBrutImposable;
    Double RevenuInvesti;
    Double MontantReduits;
    Double MontantNetPaye;
    @ManyToOne
    PersonneMorl personneMorl;

    public Employee(Long numEmployee, String poste, Date dateDebutService, Date dateFinService, Double salaireBrut,
                    Double privilegeNature, Double totalRevenuBrutImposable, Double revenuInvesti, Double montantReduits,
                    Double montantNetPaye) {
        super();
        NumEmployee = numEmployee;
        Poste = poste;
        DateDebutService = dateDebutService;
        DateFinService = dateFinService;
        SalaireBrut = salaireBrut;
        PrivilegeNature = privilegeNature;
        TotalRevenuBrutImposable = totalRevenuBrutImposable;
        RevenuInvesti = revenuInvesti;
        MontantReduits = montantReduits;
        MontantNetPaye = montantNetPaye;
    }

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public PersonneMorl getPersonneMorl() {
        return personneMorl;
    }

    public void setPersonneMorl(PersonneMorl personneMorl) {
        this.personneMorl = personneMorl;
    }

    public String getPoste() {
        return Poste;
    }

    public void setPoste(String poste) {
        Poste = poste;
    }

    public Date getDateDebutService() {
        return DateDebutService;
    }

    public void setDateDebutService(Date dateDebutService) {
        DateDebutService = dateDebutService;
    }

    public Date getDateFinService() {
        return DateFinService;
    }

    public void setDateFinService(Date dateFinService) {
        DateFinService = dateFinService;
    }

    public Double getSalaireBrut() {
        return SalaireBrut;
    }

    public void setSalaireBrut(Double salaireBrut) {
        SalaireBrut = salaireBrut;
    }

    public Double getTotalRevenuBrutImposable() {
        return TotalRevenuBrutImposable;
    }

    public void setTotalRevenuBrutImposable(Double totalRevenuBrutImposable) {
        TotalRevenuBrutImposable = totalRevenuBrutImposable;
    }

    public Double getRevenuInvesti() {
        return RevenuInvesti;
    }

    public void setRevenuInvesti(Double revenuInvesti) {
        RevenuInvesti = revenuInvesti;
    }

    public Double getMontantReduits() {
        return MontantReduits;
    }

    public void setMontantReduits(Double montantReduits) {
        MontantReduits = montantReduits;
    }

    public Double getMontantNetPaye() {
        return MontantNetPaye;
    }

    public void setMontantNetPaye(Double montantNetPaye) {
        MontantNetPaye = montantNetPaye;
    }

    public Double getPrivilegeNature() {
        return PrivilegeNature;
    }

    public void setPrivilegeNature(Double privilegeNature) {
        PrivilegeNature = privilegeNature;
    }

    public Long getNumEmployee() {
        return NumEmployee;
    }

    public void setNumEmployee(Long numEmployee) {
        NumEmployee = numEmployee;
    }


}
