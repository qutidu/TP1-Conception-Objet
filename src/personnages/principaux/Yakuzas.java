package personnages.principaux;

import personnages.Humain;

public class Yakuzas extends Humain {
	private String clan;
	private int réputation;
	
	public Yakuzas(String nom, String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
		this.réputation = 1;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getRéputation() {
		return réputation;
	}
	
	public void extorquer(Commerçants c) {
		
	}
}
