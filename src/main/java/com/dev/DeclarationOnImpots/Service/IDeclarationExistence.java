package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.DeclarationExistence;

import java.util.List;


public interface IDeclarationExistence {
    void add(DeclarationExistence dec);

    DeclarationExistence update(DeclarationExistence dec);

    List<DeclarationExistence> findAll();

    DeclarationExistence findOne(Long CodeDE);

    public boolean supprimer(Long CodeDE);
}
