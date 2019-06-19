package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.Exercice;

import java.util.List;


public interface IExercice {
    void add(Exercice exercice);

    Exercice update(Exercice exercice);

    List<Exercice> findAll();

    Exercice findOne(Long CodeEx);

    public boolean supprimer(Long CodeEx);
}
