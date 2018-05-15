package fr.unilim.iut.spaceinvaders.moteurjeu;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;
import monJeu.MonJeu;
import monJeu.Personnage;

public class DessinSpaceInvaders implements DessinJeu {

	private SpaceInvaders jeu;
	
	public void dessiner(BufferedImage image) {
				SpaceInvaders j = (SpaceInvaders) jeu;
				Personnage pj = j.getPj();
				this.dessinerObjet("PJ", pj.x, pj.y, image);
	}
	

	private void dessinerObjet(String s, int x, int y, BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		switch (s) {
		case "PJ":
			crayon.setColor(Color.blue);
			crayon.fillRect(x,y,jeu.getLongueur(), jeu.getHauteur());
			break;
		case "MUR":
			crayon.setColor(Color.gray);
			crayon.fillRect(x,y,jeu.getLongueur(), jeu.getHauteur());
			break;
		default:
			throw new AssertionError("objet inexistant");
		}

	}
	
	public DessinSpaceInvaders(SpaceInvaders j) {
		this.jeu = j;
	}

}
