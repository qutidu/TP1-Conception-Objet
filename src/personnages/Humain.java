package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public void parler(String texte) {
		System.out.println(nom + " - " + texte);
	}
	
	public void direBonjour() {
		String bjr = "Bonjour ! je m'appelle " + nom + 
				" et j'aime boire du " + boisson;
		parler(bjr);
	}
	
	public void boire() {
		String boire = "Mmmm, un bon verre de " + boisson + " ! GLOUPS !";
		parler(boire);
	}
	
	public int getArgent() {
		return argent;
	}
	public String getNom() {
		return nom;
	}
	public String getBoisson() {
		return boisson;
	}
	
	public void gagnerArgent(int n) {
		argent += n;
	}
	
	public void perdreArgent(int n) {
		argent -= n;
	}
	
	
	
}
