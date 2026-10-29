package personnages.principaux;

import personnages.Humain;

public class Commerçants extends Humain {
	
	public Commerçants (String nom, int argent) {
		super(nom,"thé",argent);
	}
	
	public int seFaireExtorquer() {
		perdreArgent(getArgent());
		String texte ="le monde est vraiment trop injuste"; 
		parler(texte);
		return getArgent();	
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
	}
}
