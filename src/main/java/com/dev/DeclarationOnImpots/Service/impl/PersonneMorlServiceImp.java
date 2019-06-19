package com.dev.DeclarationOnImpots.Service.impl;

import com.dev.DeclarationOnImpots.Entity.PersonneMorl;
import com.dev.DeclarationOnImpots.Repository.PersonneMorlRepository;
import com.dev.DeclarationOnImpots.Service.IPersonneMorl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonneMorlServiceImp implements IPersonneMorl {
    @Autowired
    private PersonneMorlRepository personneMorlRepository;

    @Override
    public void add(PersonneMorl personneMorl) {
        this.personneMorlRepository.save(personneMorl);

    }

    @Override
    public PersonneMorl update(PersonneMorl personneMorl) {
        return this.personneMorlRepository.save(personneMorl);
    }

    @Override
    public List<PersonneMorl> findAll() {
        return (List<PersonneMorl>) this.personneMorlRepository.findAll();
    }

    @Override
    public PersonneMorl findOne(Long RegistreCommerce) {
        return this.personneMorlRepository.findOne(RegistreCommerce);
    }

    @Override
    public boolean supprimer(Long RegistreCommerce) {
        personneMorlRepository.deleteById(RegistreCommerce);
        return true;
    }

    @Override
    public void changeStatus(long NIF, Boolean status) {
        PersonneMorl personneMorl = this.personneMorlRepository.findOne(NIF);
        personneMorl.setStatus(true);
        this.personneMorlRepository.save(personneMorl);
        this.personneMorlRepository.findOne(NIF);

    }
}
