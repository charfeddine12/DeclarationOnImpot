package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.PersonneMorl;

import java.util.List;


public interface IPersonneMorl {
    void add(PersonneMorl personneMorl);

    PersonneMorl update(PersonneMorl personneMorl);

    List<PersonneMorl> findAll();

    PersonneMorl findOne(Long RegistreCommerce);

    public boolean supprimer(Long RegistreCommerce);

    void changeStatus(long NIF, Boolean status);

}
