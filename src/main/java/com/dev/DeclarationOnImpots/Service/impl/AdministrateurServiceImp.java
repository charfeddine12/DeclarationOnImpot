package com.dev.DeclarationOnImpots.Service.impl;

import com.dev.DeclarationOnImpots.Entity.Administrateur;
import com.dev.DeclarationOnImpots.Repository.AdministrateurRepository;
import com.dev.DeclarationOnImpots.Service.IAdministrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrateurServiceImp implements IAdministrateur {
    @Autowired
    private AdministrateurRepository adminRepository;

    @Override
    public void add(Administrateur admin) {
        this.adminRepository.save(admin);

    }

    @Override
    public Administrateur update(Administrateur admin) {

        return this.adminRepository.save(admin);
    }

    @Override
    public List<Administrateur> findAll() {

        return (List<Administrateur>) this.adminRepository.findAll();
    }

    @Override
    public Administrateur findOne(Long CodeAdmin) {

        return this.adminRepository.findOne(CodeAdmin);
    }

    @Override
    public boolean supprimer(Long CodeAdmin) {
        adminRepository.deleteById(CodeAdmin);
        return true;
    }

}
