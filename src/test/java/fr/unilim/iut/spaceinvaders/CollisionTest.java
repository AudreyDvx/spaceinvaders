package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.model.Collision;
import fr.unilim.iut.spaceinvaders.model.Dimension;
import fr.unilim.iut.spaceinvaders.model.Envahisseur;
import fr.unilim.iut.spaceinvaders.model.Missile;
import fr.unilim.iut.spaceinvaders.model.Position;
import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;
import fr.unilim.iut.spaceinvaders.model.Vaisseau;

public class CollisionTest {
	
	private SpaceInvaders spaceinvaders;
	private Collision collision;
	
	@Before 
	public void initialisation() {
	    spaceinvaders = new SpaceInvaders(15, 10);
    }
	
	@Test
	public void test_CollisionLorsqueMissileRencontreEnvahisseur() {
		spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(3,9), 1);
		   spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(3,2),new Position(5,1), 0);
		   
		   spaceinvaders.tirerUnMissile(new Dimension(3,2),1);
		   
		   
		   for (int i = 1; i <=4 ; i++) {
			  spaceinvaders.deplacerMissile();
		   }
		   collision.detecterCollision(spaceinvaders.recupererMissile(), spaceinvaders.recupererEnvahisseur());
		   
		   
	       assertEquals("" +
	       "...............\n" + 
	       "...............\n" +
	       ".....MMM.......\n" + 
	       ".....MMM.......\n" +
	       "...............\n" +
	       "...............\n" + 
	       "...............\n" +
	       "...............\n" + 
	       "...VVVVVVV....\n" + 
	       "...VVVVVVV....\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	  
	}

	
}
