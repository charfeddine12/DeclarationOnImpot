package com.dev.DeclarationOnImpots.Service.impl;

import com.dev.DeclarationOnImpots.Entity.DeclarationExistence;
import com.dev.DeclarationOnImpots.Repository.DeclarationExistenceRepository;
import com.dev.DeclarationOnImpots.Service.IDeclarationExistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarationExistenceServiceImp implements IDeclarationExistence {
    @Autowired
    private DeclarationExistenceRepository decRepository;

    @Override
    public void add(DeclarationExistence dec) {
        this.decRepository.save(dec);

    }

    @Override
    public DeclarationExistence update(DeclarationExistence dec) {

        return this.decRepository.save(dec);
    }

    @Override
    public List<DeclarationExistence> findAll() {

        return (List<DeclarationExistence>) this.decRepository.findAll();
    }

    @Override
    public DeclarationExistence findOne(Long CodeDE) {

        return this.decRepository.findOne(CodeDE);
    }

    @Override
    public boolean supprimer(Long CodeDE) {
        decRepository.deleteById(CodeDE);
        return true;
    }
}
