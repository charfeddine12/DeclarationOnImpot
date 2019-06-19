package com.dev.DeclarationOnImpots.Controller;

import com.dev.DeclarationOnImpots.Entity.PersonnePhyz;
import com.dev.DeclarationOnImpots.Service.IPersonnePhyz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping(value = "personnePhyzs", headers = "Accept=application/json")

public class PersonnePhyzController {
    @Autowired
    private IPersonnePhyz personnePhyzService;


    @GetMapping(value = "/all")
    public @ResponseBody
    List<PersonnePhyz> getAllPersonnePhyzs() {
        return this.personnePhyzService.findAll();
    }

    @GetMapping(value = "/find/{Cin}")
    public PersonnePhyz findOne(@PathVariable Long Cin) {
        return this.personnePhyzService.findOne(Cin);
    }

    @PostMapping(value = "/add")
    public void addPersonnePhyz(@RequestBody PersonnePhyz pp) {

        this.personnePhyzService.add(pp);

    }

    @PutMapping(value = "/update")
    public PersonnePhyz update(@RequestBody PersonnePhyz pp) {
        return this.personnePhyzService.update(pp);
    }

    @DeleteMapping(value = "/personnePhyzs/{Cin}")
    public boolean supprimer(@PathVariable Long Cin) {
        personnePhyzService.supprimer(Cin);
        return true;
    }

    @PutMapping(value = "/updateStatus/{NIF}/{Status}")
    public List<PersonnePhyz> changeStatus(@PathVariable long NIF, @PathVariable Boolean Status) {
        this.personnePhyzService.changeStatus(NIF, Status);
        return this.personnePhyzService.findAll();
    }
}
