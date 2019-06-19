package com.dev.DeclarationOnImpots.Service.impl;

import com.dev.DeclarationOnImpots.Entity.ImpotsSociete;
import com.dev.DeclarationOnImpots.Repository.ImpotsSocieteRepository;
import com.dev.DeclarationOnImpots.Service.IImpotsSociete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpotsSocieteServiceImp implements IImpotsSociete {
    @Autowired
    private ImpotsSocieteRepository impotsSocieteRepository;

    @Override
    public void add(ImpotsSociete impotsSociete) {
        this.impotsSocieteRepository.save(impotsSociete);

    }

    @Override
    public ImpotsSociete update(ImpotsSociete impotsSociete) {

        return this.impotsSocieteRepository.save(impotsSociete);
    }

    @Override
    public List<ImpotsSociete> findAll() {

        return (List<ImpotsSociete>) this.impotsSocieteRepository.findAll();
    }

    @Override
    public ImpotsSociete findOne(Long ImpotsSocieteId) {

        return this.impotsSocieteRepository.findOne(ImpotsSocieteId);
    }

    @Override
    public boolean supprimer(Long ImpotsSociete) {
        impotsSocieteRepository.deleteById(ImpotsSociete);
        return true;
    }
}
