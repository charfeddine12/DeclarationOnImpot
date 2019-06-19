package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.Administrateur;

import java.util.List;


public interface IAdministrateur {
    void add(Administrateur admin);

    Administrateur update(Administrateur admin);

    List<Administrateur> findAll();

    Administrateur findOne(Long CodeAdmin);

    public boolean supprimer(Long CodeAdmin);
}
