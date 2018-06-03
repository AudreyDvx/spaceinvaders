package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite {
	private boolean deplacementEnvahisseurGauche;

	public boolean isDeplacementEnvahisseurGauche() {
		return deplacementEnvahisseurGauche;
	}

	public void setDeplacementEnvahisseurGauche(boolean deplacementEnvahisseurGauche) {
		this.deplacementEnvahisseurGauche = deplacementEnvahisseurGauche;
	}

	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
		this.deplacementEnvahisseurGauche=true;
	}

	
	
}
