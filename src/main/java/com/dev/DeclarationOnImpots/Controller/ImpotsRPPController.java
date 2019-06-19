package com.dev.DeclarationOnImpots.Controller;

import com.dev.DeclarationOnImpots.Entity.ImpotsRPP;
import com.dev.DeclarationOnImpots.Service.IImpotsRPP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "impotsRPPs", headers = "Accept=application/json")

public class ImpotsRPPController {
    @Autowired
    private IImpotsRPP impotsRPPService;

    @GetMapping(value = "/all")
    public @ResponseBody
    List<ImpotsRPP> getAllImpotsRPPs() {
        return this.impotsRPPService.findAll();
    }

    @GetMapping(value = "/find/{ImpotsRPPId}")
    public ImpotsRPP findOne(@PathVariable Long ImpotsRPPId) {
        return this.impotsRPPService.findOne(ImpotsRPPId);
    }

    @PostMapping(value = "/add")
    public void addImpotsRPP(@RequestBody ImpotsRPP l) {


        this.impotsRPPService.add(l);

    }

    @PutMapping(value = "/update")
    public ImpotsRPP update(@RequestBody ImpotsRPP l) {
        return this.impotsRPPService.update(l);
    }

    @DeleteMapping(value = "/delete/{ImpotsRPPId}")
    public boolean supmrimer(@PathVariable Long ImpotsRPPId) {
        impotsRPPService.supprimer(ImpotsRPPId);
        return true;
    }


}
