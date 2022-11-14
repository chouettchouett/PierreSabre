package personnage;

public class Samouraï extends Humain{
	
	public Samouraï(String seigneur, String nom, String boissonFavorite, int capital) {
		super(seigneur, nom, boissonFavorite, capital);
	}
	
	@Override
	 
	public void boire(String boisson) {	
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+ boisson + ".");
	}

	// faire un setteur ou ...
	
	public traitre(String seigneur, String nom, String boissonFavorite, int capital) {
		super(seigneur, nom, boissonFavorite, capital);
	}
	
	public void ranconner(Commercant commercant) {
		
	}
}
