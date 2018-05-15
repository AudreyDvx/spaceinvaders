package fr.unilim.iut.spaceinvaders.moteurjeu;

import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;

public class Main {

	public static void main(String[] args) {

			// creation du jeu particulier et de son afficheur
			SpaceInvaders jeu = new SpaceInvaders();
			DessinSpaceInvaders aff = new DessinSpaceInvaders(jeu);

			// classe qui lance le moteur de jeu generique
			MoteurGraphique moteur = new MoteurGraphique(jeu, aff);
			moteur.lancerJeu(400,400);
		

	}

}
