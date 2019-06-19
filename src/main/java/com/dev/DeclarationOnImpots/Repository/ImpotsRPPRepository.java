package com.dev.DeclarationOnImpots.Repository;

import com.dev.DeclarationOnImpots.Entity.ImpotsRPP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpotsRPPRepository extends JpaRepository<ImpotsRPP, Long> {


    @Query("select c from ImpotsRPP c where c.ImpotsRPPId = ?1")
    ImpotsRPP findOne(Long ImpotsRPPId);

}


