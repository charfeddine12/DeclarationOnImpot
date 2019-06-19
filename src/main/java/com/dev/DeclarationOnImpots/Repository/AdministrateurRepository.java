package com.dev.DeclarationOnImpots.Repository;

import com.dev.DeclarationOnImpots.Entity.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {


    @Query("select c from Administrateur c where c.CodeAdmin = ?1")
    Administrateur findOne(Long CodeAdmin);


}
