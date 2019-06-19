package com.dev.DeclarationOnImpots.Repository;

import com.dev.DeclarationOnImpots.Entity.Contribuable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ContribuableRepository extends JpaRepository<Contribuable, Long> {
    @Query("select c from Contribuable c where c.username like :x")
    public Page<Contribuable> chercher(@Param("x") String mc, Pageable pageable);

    @Query("select c from Contribuable c where c.nif = ?1")
    Contribuable findOne(Long nif);


    @Modifying
    @Query("update Contribuable c set c.status = status where c.nif = nif")
    void changeStatus(Long nif, String status);
    // @Query("select c from Contribuable c where c.username =:username ")

    Contribuable findByUsername(String username);


    @Query("select e from Contribuable e where e.login = :login and e.password = :pwd")
    public Contribuable authentication(@Param("login") String login, @Param("pwd") String pwd);

    @Query("select e from Contribuable e where e.login = :login")
    public Contribuable findByLogin(@Param("login") String login);

    @Query("select e from Contribuable e where e.login = :login and e.email = :email")
    public Contribuable findByEmailAndLogin(@Param("login") String login, @Param("email") String email);
}
