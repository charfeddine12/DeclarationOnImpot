package com.dev.DeclarationOnImpots;

import com.dev.DeclarationOnImpots.Entity.AppRole;
import com.dev.DeclarationOnImpots.Entity.Contribuable;
import com.dev.DeclarationOnImpots.Repository.RoleRepository;
import com.dev.DeclarationOnImpots.Service.IContribuable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableJpaRepositories("com.dev.DeclarationOnImpots.Repository")

public class DeclarationOnImpotsApplication {


    @Autowired
    private IContribuable service;


    public static void main(String[] args) {
        SpringApplication.run(DeclarationOnImpotsApplication.class, args);
    }


    @Bean
    CommandLineRunner initDatabase(RoleRepository roleRepository) {
        return args -> {
            AppRole role1 = new AppRole();
            role1.setName("RESPONSABLE");
            AppRole role1cmp = roleRepository.findByName("ADMIN");
            if (role1cmp == null) {
                roleRepository.save(role1);
                System.out.println("Création du role responsable");
            }
            Contribuable contribuable = new Contribuable();
            contribuable.setUsername("admin");
            contribuable.setLogin("admin");
            contribuable.setPassword("admin");
            contribuable.setAdresse("ddddd");
            contribuable.setNationnalite("Tunisien");
            contribuable.setNumCnss(1234);
            contribuable.setStatus(true);
            contribuable.setTel((long) 1331211122);
            contribuable.setEmail("ddddd@mail.com");
            Contribuable cmpContribuable = service.findByLogin("admin");
            if (cmpContribuable == null) {
                service.add(contribuable);
                service.addRoleToUser(contribuable.getUsername(), "ADMIN");
                System.out.println("Création du responsable admin");
            }
        };
    }


}
