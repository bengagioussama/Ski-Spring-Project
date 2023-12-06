package com.bengagi.springproject.RestController;

import com.bengagi.springproject.DAO.Entities.Inscription;
import com.bengagi.springproject.Services.IInscriptionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class InscriptionRestController {
    IInscriptionService iInscriptionService;

    @GetMapping("/getAll")
    public List<Inscription> getAll() {
        return iInscriptionService.findAll();
    }

    @PostMapping("add")
    public Inscription add(@RequestBody Inscription inscription) {
        return (Inscription) iInscriptionService.add(inscription);
    }

}
