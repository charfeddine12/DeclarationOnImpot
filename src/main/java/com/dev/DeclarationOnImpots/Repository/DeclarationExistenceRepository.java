package com.dev.DeclarationOnImpots.Repository;

import com.dev.DeclarationOnImpots.Entity.DeclarationExistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclarationExistenceRepository extends JpaRepository<DeclarationExistence, Long> {

    @Query("select c from DeclarationExistence c where c.CodeDE = ?1")
    DeclarationExistence findOne(Long CodeDE);

}
