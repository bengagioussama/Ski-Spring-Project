package com.bengagi.springproject.DAO.Repository;

import com.bengagi.springproject.DAO.Entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
