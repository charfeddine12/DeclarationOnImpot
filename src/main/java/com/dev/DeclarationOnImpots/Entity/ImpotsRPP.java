package com.dev.DeclarationOnImpots.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Inheritance(strategy=InheritanceType.table_per_class)
public class ImpotsRPP /*extends DeclarationImpots */ implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    Long ImpotsRPPId;
    Double BeneficeCommerciauxIndustriels;
    Double BeneficeProfessionNonCommercial;
    Double BeneficeActiviteAgricole;
    Double RevenuImmobiliers;
    Double AutreFraisHonoraires;

    @ManyToOne
    PersonnePhyz personnePhyz;

    public ImpotsRPP() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ImpotsRPP(Double beneficeCommerciauxIndustriels, Double beneficeProfessionNonCommercial,
                     Double beneficeActiviteAgricole, Double revenuImmobiliers, Double autreFraisHonoraires) {
        super();
        BeneficeCommerciauxIndustriels = beneficeCommerciauxIndustriels;
        BeneficeProfessionNonCommercial = beneficeProfessionNonCommercial;
        BeneficeActiviteAgricole = beneficeActiviteAgricole;
        RevenuImmobiliers = revenuImmobiliers;
        AutreFraisHonoraires = autreFraisHonoraires;
    }

    public PersonnePhyz getPersonnePhyz() {
        return personnePhyz;
    }

    public void setPersonnePhyz(PersonnePhyz personnePhyz) {
        this.personnePhyz = personnePhyz;
    }

    public Long getImpotsRPPId() {
        return ImpotsRPPId;
    }

    public void setImpotsRPPId(Long impotsRPPId) {
        ImpotsRPPId = impotsRPPId;
    }

    public Double getBeneficeCommerciauxIndustriels() {
        return BeneficeCommerciauxIndustriels;
    }

    public void setBeneficeCommerciauxIndustriels(Double beneficeCommerciauxIndustriels) {
        BeneficeCommerciauxIndustriels = beneficeCommerciauxIndustriels;
    }

    public Double getBeneficeProfessionNonCommercial() {
        return BeneficeProfessionNonCommercial;
    }

    public void setBeneficeProfessionNonCommercial(Double beneficeProfessionNonCommercial) {
        BeneficeProfessionNonCommercial = beneficeProfessionNonCommercial;
    }

    public Double getBeneficeActiviteAgricole() {
        return BeneficeActiviteAgricole;
    }

    public void setBeneficeActiviteAgricole(Double beneficeActiviteAgricole) {
        BeneficeActiviteAgricole = beneficeActiviteAgricole;
    }

    public Double getRevenuImmobiliers() {
        return RevenuImmobiliers;
    }

    public void setRevenuImmobiliers(Double revenuImmobiliers) {
        RevenuImmobiliers = revenuImmobiliers;
    }

    public Double getAutreFraisHonoraires() {
        return AutreFraisHonoraires;
    }

    public void setAutreFraisHonoraires(Double autreFraisHonoraires) {
        AutreFraisHonoraires = autreFraisHonoraires;
    }


}
