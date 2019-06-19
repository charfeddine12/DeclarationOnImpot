package com.dev.DeclarationOnImpots.Service.impl;

import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;
import com.dev.DeclarationOnImpots.Repository.PersonnePhyzRepository;
import com.dev.DeclarationOnImpots.Service.IPersonnePhyz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnePhyzServiceImp implements IPersonnePhyz {
    @Autowired
    private PersonnePhyzRepository personnePhyzRepository;

    @Override
    public void add(PersonnePhyz personnePhyz) {
        this.personnePhyzRepository.save(personnePhyz);

    }

    @Override
    public PersonnePhyz update(PersonnePhyz personnePhyz) {
        return this.personnePhyzRepository.save(personnePhyz);
    }

    @Override
    public List<PersonnePhyz> findAll() {
        return (List<PersonnePhyz>) this.personnePhyzRepository.findAll();
    }

    @Override
    public PersonnePhyz findOne(Long Cin) {
        return this.personnePhyzRepository.findOne(Cin);
    }

    @Override
    public boolean supprimer(Long Cin) {
        personnePhyzRepository.deleteById(Cin);
        return true;
    }

    @Override
    public void changeStatus(long NIF, Boolean status) {
        PersonnePhyz personnePhyz = this.personnePhyzRepository.findOne(NIF);
        personnePhyz.setStatus(true);
        this.personnePhyzRepository.save(personnePhyz);

    }
}
