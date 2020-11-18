package com.fekri.joueurs.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fekri.joueurs.entities.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {

}

