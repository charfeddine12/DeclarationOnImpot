package com.dev.DeclarationOnImpots.Controller;

import com.dev.DeclarationOnImpots.Entity.Loyer;
import com.dev.DeclarationOnImpots.Service.ILoyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "loyers", headers = "Accept=application/json")

public class LoyerController {
    @Autowired
    private ILoyer loyerService;

    @GetMapping(value = "/all")
    public @ResponseBody
    List<Loyer> getAllLoyers() {
        return this.loyerService.findAll();
    }

    @GetMapping(value = "/find/{NumLoyer}")
    public Loyer findOne(@PathVariable Long NumLoyer) {
        return this.loyerService.findOne(NumLoyer);
    }

    @PostMapping(value = "/add")
    public void addLoyer(@RequestBody Loyer l) {

        this.loyerService.add(l);

    }

    @PutMapping(value = "/update")
    public Loyer update(@RequestBody Loyer l) {
        return this.loyerService.update(l);
    }

    @DeleteMapping(value = "/delete/{NumLoyer}")
    public boolean supmrimer(@PathVariable Long NumLoyer) {
        loyerService.supprimer(NumLoyer);
        return true;
    }
}
