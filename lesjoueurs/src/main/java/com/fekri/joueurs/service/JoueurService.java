package com.fekri.joueurs.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fekri.joueurs.entities.Joueur;

public interface JoueurService {
	Joueur saveJoueur(Joueur p);
	Joueur updateJoueur(Joueur p);
	void deleteJoueur(Joueur p);
	 void deleteJoueurById(Long id);
	 Joueur getJoueur(Long id);
	List<Joueur> getAlljoueurs();
	Page<Joueur> getAllJoueursParPage(int page, int size);
	
		

}
