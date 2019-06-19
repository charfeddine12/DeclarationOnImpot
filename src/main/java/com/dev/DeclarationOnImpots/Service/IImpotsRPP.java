package com.dev.DeclarationOnImpots.Service;

import com.dev.DeclarationOnImpots.Entity.ImpotsRPP;

import java.util.List;


public interface IImpotsRPP {
    void add(ImpotsRPP impotsRPP);

    ImpotsRPP update(ImpotsRPP impotsRPP);

    List<ImpotsRPP> findAll();

    ImpotsRPP findOne(Long ImpotsRPPId);

    public boolean supprimer(Long ImpotsRPP);
}
