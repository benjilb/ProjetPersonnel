package stationski;

public class Sportif extends Humain{
	private String sport;
	private int niveau;
	public boolean forfait;
	private int lvl = 4;
	

	public Sportif(String nom, int argent, String sport, int niveau, boolean forfait) {
		super(nom,argent);
		this.sport = sport;
		this.niveau = niveau;
		this.forfait = forfait;
	}
	
	public boolean isForfait() {
		return forfait;
	}
	
	public void acheterforfait(Station station) {
		if(forfait == true) {
			System.out.println("Vous avez deja un forfait !");
		} else {
			int prixForfait = station.getPrixforfait();
			if (prixForfait > argent) {
				System.out.println("paiement refusé");
			} else {
				perdreArgent(prixForfait);
				station.gagnerArgent(prixForfait);
				forfait = true;
				System.out.println("Bonjour " + nom + " et bienvenue dans la station " + station.getNom());
				station.ajouterSportif(this);
			}
		}
	}

	
	

	
	public static void main(String[] args) {
		
		Sportif paul = new Sportif("Paul",120,"ski", 2,false);
		System.out.println(paul.getNom());
		Sportif adele = new Sportif("Adele",80,"Snow", 1,false);
	}
	
}


