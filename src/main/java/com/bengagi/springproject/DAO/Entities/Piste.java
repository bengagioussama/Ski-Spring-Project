package com.bengagi.springproject.DAO.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Table(name="Piste")
public class Piste {
    @Id
    @Column(name = "numPiste")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private int longeur;
    private int pente;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur> skieur;


}
