package com.dev.DeclarationOnImpots.Controller;

import com.dev.DeclarationOnImpots.Entity.ImpotsSociete;
import com.dev.DeclarationOnImpots.Service.IImpotsSociete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "impotsSocietes", headers = "Accept=application/json")

public class ImpotsSocieteController {
    @Autowired
    private IImpotsSociete impotsSocieteService;

    @GetMapping(value = "/all")
    public @ResponseBody
    List<ImpotsSociete> getAllImpotsSocietes() {
        return this.impotsSocieteService.findAll();
    }

    @GetMapping(value = "/find/{ImpotsSocieteId}")
    public ImpotsSociete findOne(@PathVariable Long ImpotsSocieteId) {
        return this.impotsSocieteService.findOne(ImpotsSocieteId);
    }

    @PostMapping("/add")
    public void addImpotsSociete(@RequestBody ImpotsSociete l) {


        this.impotsSocieteService.add(l);

    }

    @PutMapping(value = "/update")
    public ImpotsSociete update(@RequestBody ImpotsSociete l) {
        return this.impotsSocieteService.update(l);
    }

    @DeleteMapping(value = "/delete/{ImpotsSocieteId}")
    public boolean supmrimer(@PathVariable Long ImpotsSocieteId) {
        impotsSocieteService.supprimer(ImpotsSocieteId);
        return true;
    }


}
