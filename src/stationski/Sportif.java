package stationski;

public class Sportif extends Humain{
	private String sport;
	private int niveau;
	private boolean forfait = false;

	public Sportif(String nom, int argent, String sport, int niveau) {
		super(nom,argent);
		this.sport = sport;
		this.niveau = niveau;
	}
	public void acheterforfait(Station station) {
		if(forfait = true) {
			System.out.println("Vous avez deja un forfait !");
		} else {
			int prixForfait = station.getPrixforfait();
			if (prixForfait < argent) {
				System.out.println("paiement refusé");
			} else {
				perdreArgent(prixForfait);
				station.gagnerArgent(prixForfait);
				forfait = true;
				System.out.println("Bienvenue dans la station " + station.getNom());
			}
		}
	}

	public boolean possessionforfait() {
		if(forfait = true) {
			return true;
		} else {
			return false;
		}
	}
}


