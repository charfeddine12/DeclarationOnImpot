package com.dev.DeclarationOnImpots.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
//@Inheritance(strategy=InheritanceType.table_per_class)
public class Administrateur /* extends Contribuable*/ implements Serializable {

    @Id
    Long CodeAdmin;
    String Mission;

    public Administrateur(Long codeAdmin, String mission) {
        super();
        CodeAdmin = codeAdmin;
        Mission = mission;
    }

    public Administrateur() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getCodeAdmin() {
        return CodeAdmin;
    }

    public void setCodeAdmin(Long codeAdmin) {
        CodeAdmin = codeAdmin;
    }

    public String getMission() {
        return Mission;
    }

    public void setMission(String mission) {
        Mission = mission;
    }


}
