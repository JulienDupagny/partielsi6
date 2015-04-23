/**
         * Ceci est un commentaire Javadoc. 
         * J'ai mis ce commentaire pour en prouver son utilisation. 
         * Chaque ligne doit commencer par une étoile. 
         * Enfin, le commentaire Javadoc fini par une étoile suivie d'un slash.
         */

package com.constructsio;

public class Batiment {
	public int prix; // prix du batiment
	public boolean construction; // etat de la construction
	public boolean paye; // status du paiement

	public Option option1 = new Option(1000, "option non défini"); /* premiere
																	  option */
	public Option option2 = new Option(2000, "option non défini"); /* deuxieme
																	  option */

	public Batiment(int prix) { 
		// exception si le prix < 0
		if (prix < 0) {
			throw new RuntimeException("prix non valide");
		}
		this.prix = prix;
	}

	public int prixGlobal() { 
		// calcul du prix global
		return prix + option1.prix + option2.prix;
	}

	public void enConstruction() {
		// batiment en construction
		this.construction = true;
	}

	public void pasEnConstruction() {
		// batiment pas en construction
		this.construction = true;
	}

	public boolean etatConstruction() {
		// etat de construction du batiment
		return construction;
	}

	public void paye() {
		// batiment payé
		this.paye = true;
	}

	public void pasPaye() {
		// batiment pas payé
		this.paye = true;
	}

	public boolean etatPaye() {
		// etat du paiement du batiment
		return paye;
	}
}
