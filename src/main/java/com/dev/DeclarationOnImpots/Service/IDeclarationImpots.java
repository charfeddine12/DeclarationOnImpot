package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.DeclarationImpots;

import java.util.List;

public interface IDeclarationImpots {
    void add(DeclarationImpots dec);

    DeclarationImpots update(DeclarationImpots dec);

    List<DeclarationImpots> findAll();

    DeclarationImpots findOne(Long IdDeclarationImpots);

    public boolean supprimer(Long IdDeclarationImpots);
}
