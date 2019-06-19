package com.dev.DeclarationOnImpots.Repository;

import com.dev.DeclarationOnImpots.Entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<AppRole, Long> {

    public AppRole findByName(String name);

}

