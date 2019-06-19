package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.ImpotsSociete;

import java.util.List;


public interface IImpotsSociete {
    void add(ImpotsSociete impotsSociete);

    ImpotsSociete update(ImpotsSociete impotsSociete);

    List<ImpotsSociete> findAll();

    ImpotsSociete findOne(Long ImpotsSocieteId);

    public boolean supprimer(Long ImpotsSociete);
}
