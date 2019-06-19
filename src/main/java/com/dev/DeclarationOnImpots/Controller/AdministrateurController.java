package com.dev.DeclarationOnImpots.Controller;

import com.dev.DeclarationOnImpots.Entity.Administrateur;
import com.dev.DeclarationOnImpots.Service.IAdministrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "administrateurs", headers = "Accept=application/json")
public class AdministrateurController {
    @Autowired
    private IAdministrateur adminService;

    @GetMapping(value = "/all")
    public @ResponseBody
    List<Administrateur> getAllAdministrateurs() {
        return this.adminService.findAll();
    }

    @GetMapping(value = "/find/{CodeAdmin}")
    public Administrateur findOne(@PathVariable Long CodeAdmin) {
        return this.adminService.findOne(CodeAdmin);
    }

    @PostMapping(value = "/add")
    public void addAdministrateur(@RequestBody Administrateur l) {
        this.adminService.add(l);
    }

    @PutMapping(value = "/update")
    public Administrateur update(@RequestBody Administrateur l) {

        return this.adminService.update(l);
    }

    @DeleteMapping(value = "/delete/{CodeAdmin}")
    public boolean supmrimer(@PathVariable Long CodeAdmin) {
        adminService.supprimer(CodeAdmin);
        return true;
    }


}
