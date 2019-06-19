package com.dev.DeclarationOnImpots.Controller;

import com.dev.DeclarationOnImpots.Entity.DeclarationExistence;
import com.dev.DeclarationOnImpots.Service.IDeclarationExistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "declarationExistences", headers = "Accept=application/json")

public class DeclarationExistenceController {
    @Autowired
    private IDeclarationExistence decService;

    @GetMapping(value = "/all")
    public @ResponseBody
    List<DeclarationExistence> getAllDeclarationExistences() {
        return this.decService.findAll();
    }


    @GetMapping(value = "/find/{CodeDE}")
    public DeclarationExistence findOne(@PathVariable Long CodeDE) {
        return this.decService.findOne(CodeDE);
    }

    @PostMapping(value = "/add")
    public void addDeclarationExistence(@RequestBody DeclarationExistence l) {

        this.decService.add(l);

    }

    @PutMapping(value = "/update")
    public DeclarationExistence update(@RequestBody DeclarationExistence l) {
        return this.decService.update(l);
    }

    @DeleteMapping(value = "/delete/{CodeDE}")
    public boolean supmrimer(@PathVariable Long CodeDE) {
        decService.supprimer(CodeDE);
        return true;
    }

}
