package fr.unilim.iut.spaceinvaders.model;

import fr.unilim.iut.spaceinvaders.moteurjeu.MoteurGraphique;
import fr.unilim.iut.spaceinvaders.model.*;

public class SpaceInvadersMain {

    public static void main(String[] args) throws InterruptedException {

	    SpaceInvaders jeu = new SpaceInvaders(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	    jeu.initialiserJeu();
	    DessinSpaceInvaders afficheur = new DessinSpaceInvaders(jeu);

	    MoteurGraphique moteur = new MoteurGraphique(jeu, afficheur);
	    moteur.lancerJeu(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
    }

}