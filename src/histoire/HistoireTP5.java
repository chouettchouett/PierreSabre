package histoire;
import personnage.*;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissanceAvec(Ronin roro);
		marco.faireConnaissanceAvec(Yakuza yaku);
		marco.faireConnaissanceAvec(Commercant chonin);
		marco.faireConnaissanceAvec(Commercant kumi);
		listerConnaissance(marco);
		listerConnaissance(roro);
		listerConnaissance(yaku);
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sake", 80);
		akimoto.direBonjour();
		marco.faireConnaissanceAvec(Samouraï akimoto);
	}

}