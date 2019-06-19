package com.dev.DeclarationOnImpots.Service.impl;

import com.dev.DeclarationOnImpots.Entity.Exercice;
import com.dev.DeclarationOnImpots.Repository.ExerciceRepository;
import com.dev.DeclarationOnImpots.Service.IExercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciceServiceImp implements IExercice {
    @Autowired
    private ExerciceRepository exerciceRepository;

    @Override
    public void add(Exercice exercice) {
        this.exerciceRepository.save(exercice);

    }

    @Override
    public Exercice update(Exercice exercice) {
        return this.exerciceRepository.save(exercice);
    }

    @Override
    public List<Exercice> findAll() {
        return (List<Exercice>) this.exerciceRepository.findAll();
    }

    @Override
    public Exercice findOne(Long CodeEx) {
        return this.exerciceRepository.findOne(CodeEx);
    }

    @Override
    public boolean supprimer(Long CodeEx) {
        exerciceRepository.deleteById(CodeEx);
        return true;
    }

}
