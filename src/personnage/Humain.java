package personnage;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	private Humain(String nom, String boisson, int argent){
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;	
	}
	
	private void parler(String texte) { 
		 System.out.println("- " + texte); 
	 }
	
	private void direBonjour() {
		parler(" Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boisson);
	}
	
	private void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS ! ");
	}
	
	private void acheter(String bien, int prix) {
		if (argent < prix) {
			parler("Je n'ai pas assez d'argent");
		}else {
			parler("J'ai assez pour acheter " + bien);
			perdreArgent(prix);
		}
	}

	private void gagnerArgent(int gain) {
		argent += gain;
	}
	
	private void perdreArgent(int perte) {
		argent -= perte;
	}
	
	
	

}
