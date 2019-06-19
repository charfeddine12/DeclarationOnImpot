package com.dev.DeclarationOnImpots.Service.impl;

import com.dev.DeclarationOnImpots.Entity.Loyer;
import com.dev.DeclarationOnImpots.Repository.LoyerRepository;
import com.dev.DeclarationOnImpots.Service.ILoyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoyerServiceImp implements ILoyer {
    @Autowired
    private LoyerRepository loyerRepository;

    @Override
    public void add(Loyer loyer) {
        this.loyerRepository.save(loyer);

    }

    @Override
    public Loyer update(Loyer loyer) {
        return this.loyerRepository.save(loyer);
    }

    @Override
    public List<Loyer> findAll() {
        return (List<Loyer>) this.loyerRepository.findAll();
    }

    @Override
    public Loyer findOne(Long NumLoyer) {
        return this.loyerRepository.findOne(NumLoyer);
    }

    @Override
    public boolean supprimer(Long NumLoyer) {
        loyerRepository.deleteById(NumLoyer);
        return true;
    }

}
