package com.dev.DeclarationOnImpots.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Inheritance(strategy=InheritanceType.table_per_class)
public class ImpotsSociete /*extends DeclarationImpots */ implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    Long ImpotsSocieteId;
    Double StockInitial;
    Double StockFinEx;
    Double ValAchatEx;
    Double CAExportation;
    Double CAglobalTTC;
    Double CAglobalHTnonCommercial;
    Double CAglobalHTConsSurPlace;
    Double MontantPrime;
    String ResultatComptable;
    String ResultatFiscal;
    Double BenificesDeduits;
    Double BeneficesNonImposables;
    Double ImpotsDu;
    Double MinImpots;
    Double AccomptesProvisionnels;
    Double Penalites;
    Double TaxeVisite;
    Double PrelevementSurFonds;
    Double TVA;
    @OneToOne
    Loyer loyer;
    @ManyToOne
    PersonneMorl personneMorl;

    public ImpotsSociete() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ImpotsSociete(Double stockInitial, Double stockFinEx, Double valAchatEx, Double cAExportation,
                         Double cAglobalTTC, Double cAglobalHTnonCommercial, Double cAglobalHTConsSurPlace, Double montantPrime,
                         String resultatComptable, String resultatFiscal, Double benificesDeduits, Double beneficesNonImposables,
                         Double impotsDu, Double minImpots, Double accomptesProvisionnels, Double penalites, Double taxeVisite,
                         Double prelevementSurFonds, Double tVA) {
        super();
        StockInitial = stockInitial;
        StockFinEx = stockFinEx;
        ValAchatEx = valAchatEx;
        CAExportation = cAExportation;
        CAglobalTTC = cAglobalTTC;
        CAglobalHTnonCommercial = cAglobalHTnonCommercial;
        CAglobalHTConsSurPlace = cAglobalHTConsSurPlace;
        MontantPrime = montantPrime;
        ResultatComptable = resultatComptable;
        ResultatFiscal = resultatFiscal;
        BenificesDeduits = benificesDeduits;
        BeneficesNonImposables = beneficesNonImposables;
        ImpotsDu = impotsDu;
        MinImpots = minImpots;
        AccomptesProvisionnels = accomptesProvisionnels;
        Penalites = penalites;
        TaxeVisite = taxeVisite;
        PrelevementSurFonds = prelevementSurFonds;
        TVA = tVA;
    }

    public Long getImpotsSocieteId() {
        return ImpotsSocieteId;
    }

    public void setImpotsSocieteId(Long impotsSocieteId) {
        ImpotsSocieteId = impotsSocieteId;
    }

    public Loyer getLoyer() {
        return loyer;
    }

    public void setLoyer(Loyer loyer) {
        this.loyer = loyer;
    }

    public PersonneMorl getPersonneMorl() {
        return personneMorl;
    }

    public void setPersonneMorl(PersonneMorl personneMorl) {
        this.personneMorl = personneMorl;
    }

    public Double getStockInitial() {
        return StockInitial;
    }

    public void setStockInitial(Double stockInitial) {
        StockInitial = stockInitial;
    }

    public Double getStockFinEx() {
        return StockFinEx;
    }

    public void setStockFinEx(Double stockFinEx) {
        StockFinEx = stockFinEx;
    }

    public Double getValAchatEx() {
        return ValAchatEx;
    }

    public void setValAchatEx(Double valAchatEx) {
        ValAchatEx = valAchatEx;
    }

    public Double getCAExportation() {
        return CAExportation;
    }

    public void setCAExportation(Double cAExportation) {
        CAExportation = cAExportation;
    }

    public Double getCAglobalTTC() {
        return CAglobalTTC;
    }

    public void setCAglobalTTC(Double cAglobalTTC) {
        CAglobalTTC = cAglobalTTC;
    }

    public Double getCAglobalHTnonCommercial() {
        return CAglobalHTnonCommercial;
    }

    public void setCAglobalHTnonCommercial(Double cAglobalHTnonCommercial) {
        CAglobalHTnonCommercial = cAglobalHTnonCommercial;
    }

    public Double getCAglobalHTConsSurPlace() {
        return CAglobalHTConsSurPlace;
    }

    public void setCAglobalHTConsSurPlace(Double cAglobalHTConsSurPlace) {
        CAglobalHTConsSurPlace = cAglobalHTConsSurPlace;
    }

    public Double getMontantPrime() {
        return MontantPrime;
    }

    public void setMontantPrime(Double montantPrime) {
        MontantPrime = montantPrime;
    }

    public String getResultatComptable() {
        return ResultatComptable;
    }

    public void setResultatComptable(String resultatComptable) {
        ResultatComptable = resultatComptable;
    }

    public String getResultatFiscal() {
        return ResultatFiscal;
    }

    public void setResultatFiscal(String resultatFiscal) {
        ResultatFiscal = resultatFiscal;
    }

    public Double getBenificesDeduits() {
        return BenificesDeduits;
    }

    public void setBenificesDeduits(Double benificesDeduits) {
        BenificesDeduits = benificesDeduits;
    }

    public Double getBeneficesNonImposables() {
        return BeneficesNonImposables;
    }

    public void setBeneficesNonImposables(Double beneficesNonImposables) {
        BeneficesNonImposables = beneficesNonImposables;
    }

    public Double getImpotsDu() {
        return ImpotsDu;
    }

    public void setImpotsDu(Double impotsDu) {
        ImpotsDu = impotsDu;
    }

    public Double getMinImpots() {
        return MinImpots;
    }

    public void setMinImpots(Double minImpots) {
        MinImpots = minImpots;
    }

    public Double getAccomptesProvisionnels() {
        return AccomptesProvisionnels;
    }

    public void setAccomptesProvisionnels(Double accomptesProvisionnels) {
        AccomptesProvisionnels = accomptesProvisionnels;
    }

    public Double getPenalites() {
        return Penalites;
    }

    public void setPenalites(Double penalites) {
        Penalites = penalites;
    }

    public Double getTaxeVisite() {
        return TaxeVisite;
    }

    public void setTaxeVisite(Double taxeVisite) {
        TaxeVisite = taxeVisite;
    }

    public Double getPrelevementSurFonds() {
        return PrelevementSurFonds;
    }

    public void setPrelevementSurFonds(Double prelevementSurFonds) {
        PrelevementSurFonds = prelevementSurFonds;
    }

    public Double getTVA() {
        return TVA;
    }

    public void setTVA(Double tVA) {
        TVA = tVA;
    }


}
