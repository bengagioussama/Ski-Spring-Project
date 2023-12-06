package com.bengagi.springproject.DAO.Repository;

import com.bengagi.springproject.DAO.Entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
}
