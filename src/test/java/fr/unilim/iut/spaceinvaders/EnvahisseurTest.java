package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.model.Dimension;
import fr.unilim.iut.spaceinvaders.model.Position;
import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;

public class EnvahisseurTest {
	
	private SpaceInvaders spaceinvaders;
	
	@Before
	 public void initialisation() {
		 spaceinvaders = new SpaceInvaders(15, 10);
	 }
	
	 @Test
	    public void test_Deplacer_Automatiquement_CasDefaut() {

		   spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(1,1),new Position(3,0), 1);
		   spaceinvaders.deplacerEnvahisseurAutomatiquement();
		   
	       assertEquals("" + 
	       "..Y............\n" + 
	       "...............\n" +
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	   }
	 
	 
	  public void test_Deplacer_Automatiquement_CasVaisseauEstSurLaBordureGauche() {

		   spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(1,1),new Position(0,0), 1);
		   spaceinvaders.deplacerEnvahisseurAutomatiquement();
		   
	       assertEquals("" + 
	       ".Y.............\n" + 
	       "...............\n" +
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	   }
	  
	  public void test_Deplacer_Automatiquement_CasVaisseauEstSurLaBordureDroite() {

		   spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(1,1),new Position(14,0), 1);
		   spaceinvaders.deplacerEnvahisseurAutomatiquement();
		   
	       assertEquals("" + 
	       ".............Y.\n" + 
	       "...............\n" +
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	   }
	  
	  public void test_Deplacer_Automatiquement_CasVaisseauAEteSurLaBordureGauche() {

		   spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(1,1),new Position(0,0), 1);
		   spaceinvaders.deplacerEnvahisseurAutomatiquement();
		   spaceinvaders.deplacerEnvahisseurAutomatiquement();
		   
	       assertEquals("" + 
	       "..Y............\n" + 
	       "...............\n" +
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	   }
	  
	  public void test_Deplacer_Automatiquement_CasVaisseauAEteSurLaBordureDroite() {

		   spaceinvaders.positionnerUnNouvelEnvahisseur(new Dimension(1,1),new Position(14,0), 1);
		   spaceinvaders.deplacerEnvahisseurAutomatiquement();
		   spaceinvaders.deplacerEnvahisseurAutomatiquement();
	       assertEquals("" + 
	       "............Y..\n" + 
	       "...............\n" +
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" + 
	       "...............\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
	   }
	  

}
