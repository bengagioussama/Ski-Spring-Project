package com.bengagi.springproject.RestController;

import com.bengagi.springproject.DAO.Entities.Skieur;
import com.bengagi.springproject.Services.IInscriptionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class SkieurRestController {
    IInscriptionService iInscriptionService;

}
