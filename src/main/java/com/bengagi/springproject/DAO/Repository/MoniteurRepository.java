package com.bengagi.springproject.DAO.Repository;

import com.bengagi.springproject.DAO.Entities.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}
