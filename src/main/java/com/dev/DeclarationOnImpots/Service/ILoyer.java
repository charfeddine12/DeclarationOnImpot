package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.Loyer;

import java.util.List;

public interface ILoyer {
    void add(Loyer loyer);

    Loyer update(Loyer loyer);

    List<Loyer> findAll();

    Loyer findOne(Long NumLoyer);

    public boolean supprimer(Long NumLoyer);

}
