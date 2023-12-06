package com.bengagi.springproject.DAO.Entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Table(name="Inscription")
public class Inscription {
    @Id
    @Column(name = "numInscription")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;
    private int numSemaine;


    @ManyToOne
    Skieur skieur;
    @ManyToOne
    Cours cours;
}
