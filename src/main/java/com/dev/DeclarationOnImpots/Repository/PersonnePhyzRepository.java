package com.dev.DeclarationOnImpots.Repository;


import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnePhyzRepository extends JpaRepository<PersonnePhyz, Long> {


    @Query(" select c from PersonnePhyz c " +
            " where c.Nom = ?1")
    PersonnePhyz findUserWithName(String nom);

    @Query("select c from PersonnePhyz c where c.nif = ?1")
    PersonnePhyz findOne(Long Cin);

}
