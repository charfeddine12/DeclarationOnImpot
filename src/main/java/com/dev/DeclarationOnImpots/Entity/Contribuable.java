package com.dev.DeclarationOnImpots.Entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity

//@Inheritance(strategy=InheritanceType.table_per_class)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Contribuable implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    protected long nif;
    @Column(unique = true)
    protected String username;
    protected int numCnss;
    protected String nationnalite;
    protected String adresse;
    protected Boolean status;

    ;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "contribuable")
    protected Set<DeclarationImpots> declarationImpots = new HashSet<>();
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "roles")
    protected List<AppRole> roles = new ArrayList<>();
    private String login;
    private String password;
    private String email;
    private Long tel;

    public Contribuable() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Contribuable(String login, String password, String email, Long tel, int numCnss, String nationnalite, String adresse,
                        Boolean status, Set<DeclarationImpots> declarationImpots) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.tel = tel;
        this.numCnss = numCnss;
        this.nationnalite = nationnalite;
        this.adresse = adresse;
        this.status = status;
        this.declarationImpots = declarationImpots;
    }

    public Set<DeclarationImpots> getDeclarationImpots() {
        return declarationImpots;
    }

    public void setDeclarationImpots(Set<DeclarationImpots> declarationImpots) {
        this.declarationImpots = declarationImpots;
    }

    public long getNif() {
        return nif;
    }

    public void setNif(long nif) {
        this.nif = nif;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public int getNumCnss() {
        return numCnss;
    }

    public void setNumCnss(int numCnss) {
        this.numCnss = numCnss;
    }

    public String getNationnalite() {
        return nationnalite;
    }

    public void setNationnalite(String nationnalite) {
        this.nationnalite = nationnalite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<AppRole> getRoles() {
        return roles;
    }

    public void setRoles(List<AppRole> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public enum categorie {personnePhysique, personneMorale}
}
