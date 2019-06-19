package com.dev.DeclarationOnImpots.Controller;

import com.dev.DeclarationOnImpots.Entity.DeclarationImpots;
import com.dev.DeclarationOnImpots.Service.IDeclarationImpots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "declarationImpotss", headers = "Accept=application/json")

public class DeclarationImpotsController {
    @Autowired
    private IDeclarationImpots decService;

    @GetMapping(value = "/all")
    public @ResponseBody
    List<DeclarationImpots> getAllDeclarationImpotss() {
        return this.decService.findAll();
    }


    @GetMapping(value = "/find/{IdDeclarationImpots}")
    public DeclarationImpots findOne(@PathVariable Long IdDeclarationImpots) {
        return this.decService.findOne(IdDeclarationImpots);
    }

    @PostMapping(value = "/add")
    public void addDeclarationImpots(@RequestBody DeclarationImpots l) {

        this.decService.add(l);
    }

    @PutMapping(value = "/update")
    public DeclarationImpots update(@RequestBody DeclarationImpots l) {
        return this.decService.update(l);
    }

    @DeleteMapping(value = "/delete/{IdDeclarationImpots}")
    public boolean supmrimer(@PathVariable Long IdDeclarationImpots) {
        decService.supprimer(IdDeclarationImpots);
        return true;
    }

}
