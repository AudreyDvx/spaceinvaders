package fr.unilim.iut.spaceinvaders.model;

public class Collision {

	public void detecterCollision(Sprite missile, Sprite envahisseur) {
		
		if(((missile.ordonneeLaPlusHaute()<=envahisseur.ordonneeLaPlusHaute() && missile.ordonneeLaPlusHaute()>=envahisseur.ordonneeLaPlusBasse()) 
			|| (missile.ordonneeLaPlusBasse()<=envahisseur.ordonneeLaPlusHaute() && missile.ordonneeLaPlusBasse()>=envahisseur.ordonneeLaPlusBasse()))
			&& ((missile.abscisseLaPlusADroite()>=envahisseur.abscisseLaPlusAGauche() && missile.abscisseLaPlusADroite()<=envahisseur.abscisseLaPlusADroite()) 
			|| (missile.abscisseLaPlusAGauche()>=envahisseur.abscisseLaPlusAGauche() && missile.abscisseLaPlusAGauche()<=envahisseur.abscisseLaPlusADroite())) 
			){
			
			envahisseur=null;
			
		}
		
	}
	
	
	
}
