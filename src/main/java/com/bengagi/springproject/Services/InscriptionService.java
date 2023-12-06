package com.bengagi.springproject.Services;

import com.bengagi.springproject.DAO.Entities.Inscription;
import com.bengagi.springproject.DAO.Repository.InscriptionRepository;
import com.bengagi.springproject.RestController.InscriptionRestController;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InscriptionService implements IInscriptionService<Inscription>{

    InscriptionRepository inscriptionRepository;

    @Override
    public Inscription add(Inscription inscription) {
      return  inscriptionRepository.save(inscription);
    }


    @Override
    public List<Inscription> addAll(List<Inscription> t) {
        return inscriptionRepository.saveAll(t);
    }

    @Override
    public Inscription getById(long id) {
        return inscriptionRepository.findById(id).orElse(Inscription.builder().numInscription(0).build());
    }

    @Override
    public List<Inscription> findAll() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription update(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public void delete(Inscription inscription) {
        inscriptionRepository.delete(inscription);
    }

    @Override
    public void deleteById(long id) {
        inscriptionRepository.deleteById(id);
    }
}
