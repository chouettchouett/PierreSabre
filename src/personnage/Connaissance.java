package personnage;

public enum Connaissance {
	HUMAIN("humain"),
	COMMERCANT("commercant"),
	RONIN("ronin"),
	YAKUZA("yakuza"),
	SAMOURAÏ ("samouraï");
	private String nom;
	
	private Connaissance(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return(nom);
	}
	
}