package fr.unilim.iut.spaceinvaders;
public class Vaisseau {

	int x;
	int y;
	int longueur; 
	int hauteur;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}
	
	public Vaisseau(int longueur, int hauteur, int x, int y) {
		   this.longueur=longueur;
		   this.hauteur=hauteur;
		   this.x = x;
		   this.y = y;
	    }

	public boolean occupeLaPosition(int x, int y) {
	     return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
    }

	private boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse()<=y) && (y<=ordonneLaPlusHaute());
	}

	private int ordonneLaPlusHaute() {
		return this.y;
	}

	private int ordonneeLaPlusBasse() {
		return ordonneLaPlusHaute()-this.hauteur+1;
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusAGauche() {
		return this.x;
	}

	public int abscisseLaPlusADroite() {
		return abscisseLaPlusAGauche()+this.longueur-1;
	}

	public void seDeplacerVersLaDroite() {
		this.x = abscisseLaPlusAGauche()+1;
		
	}

	public int abscisse() {
		return abscisseLaPlusAGauche();
	}

	public void seDeplacerVersLaGauche() {
		this.x = abscisseLaPlusAGauche() -1 ;
		
	}

	public void positionner(int x, int y) {
		this.x = x;
	    this.y = y;
	}
	
}
