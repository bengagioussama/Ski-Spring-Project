package com.bengagi.springproject.DAO.Repository;

import com.bengagi.springproject.DAO.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {
}
