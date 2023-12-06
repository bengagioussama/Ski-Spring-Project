package com.bengagi.springproject.DAO.Repository;

import com.bengagi.springproject.DAO.Entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {
}
