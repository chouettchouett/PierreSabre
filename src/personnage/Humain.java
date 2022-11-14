package personnage;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int capital;
	//private Humain memoire[] = new memoire[30];
	
	public Humain(String nom, String boissonFavorite, int capital) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.capital = capital;
	}
	
	public String getNom() {
		return nom;
	}
	public int getCapital() {
		return capital;
	}
	
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour, je m'apelle " + nom + " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmmm, un bon verre de " + boissonFavorite + " ! Gloups !");
	}
	//public void boire(String boisson) {
		// TODO Auto-generated method stub
		
	//}
	
	protected void gagnerArgent(int gain) {
		capital += gain;
	}
	
	protected void perdreArgent(int perte) {
		capital -= perte;
	}
	
	public void acheter(String bien,int prix) {
		if (prix > capital) {
			parler("Je n'ai plus que " + capital + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous.");
		} else {
			parler("J'ai " + capital + " en poche, je vais pouvoir m'offrir une " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
	}
	
	public void memoriser(Humain autreHumain) {
		for(int i = 0; i < memoire; i++) {
			
		}
	}
	
	public void repondre(Humain autreHumain) {
		autreHumain.direBonjour();
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		String personne;
		for(int i = 0; i < memoire; i++) {
			System.out.println("Je connais beaucoup de monde dont : "+ personne	
				}
	}
	
}
