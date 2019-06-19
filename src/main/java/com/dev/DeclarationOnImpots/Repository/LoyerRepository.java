package com.dev.DeclarationOnImpots.Repository;


import com.dev.DeclarationOnImpots.Entity.Loyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoyerRepository extends JpaRepository<Loyer, Long> {


    @Query("select c from Loyer c where c.NumLoyer = ?1")
    Loyer findOne(Long NumLoyer);

}
