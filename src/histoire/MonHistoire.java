package histoire;

import personnages.Humain;
import personnages.principaux.Commerçants;

public class MonHistoire {

	public static void main(String[] args) {
		Humain maitreSusake = new Humain("susake", "coca", 1000);
		maitreSusake.direBonjour();
		maitreSusake.boire();
		
		Commerçants vendeur = new Commerçants("romain", 300);
		vendeur.direBonjour();
		System.out.println(vendeur.getArgent());
		vendeur.seFaireExtorquer();
		System.out.println(vendeur.getArgent());
	}

}
