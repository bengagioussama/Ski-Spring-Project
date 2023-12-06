package com.bengagi.springproject.DAO.Repository;


import com.bengagi.springproject.DAO.Entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
}
