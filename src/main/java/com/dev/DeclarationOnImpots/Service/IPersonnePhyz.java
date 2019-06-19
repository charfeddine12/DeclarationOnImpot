package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;

import java.util.List;

public interface IPersonnePhyz {
    void add(PersonnePhyz personnePhyz);

    PersonnePhyz update(PersonnePhyz personnePhyz);

    List<PersonnePhyz> findAll();

    PersonnePhyz findOne(Long Cin);

    public boolean supprimer(Long Cin);

    void changeStatus(long NIF, Boolean status);

}
