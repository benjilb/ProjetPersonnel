package stationski;


public class Station {
	private String nom;
	private int bourse;
	private int prixforfait;

	
	
	protected Sportif[] sportif;
	protected int nbSportif = 0;
	
	public Station(String nom, int bourse, int prixforfait, int nbSkieurmaximum) {
		this.nom = nom;
		this.bourse = bourse;
		this.prixforfait = prixforfait;
		this.sportif = new Sportif[nbSkieurmaximum];
	}
	
	
	public int getPrixforfait() {
		return prixforfait;
	}

	public String getNom() {
		return nom;
	}
	
	protected void gagnerArgent(int gain) {
		bourse = bourse + gain;
	}
	protected void perdreArgent(int perte) {
		bourse = bourse - perte;
	}
	public void ajouterSportif(Sportif monsportif) {
		if(monsportif.isForfait()) {
			sportif[nbSportif]= monsportif;
			nbSportif++;
		} else {
			System.out.println(monsportif.getNom() +  ", vous n'avez pas de forfait.");
		}
	}
	
	
	public void afficherSportif() {
		System.out.println("Dans la station " + nom + " il y a " + nbSportif + " sportifs:");
		for(int i=0; i < nbSportif; i++) {
			System.out.println("- " + sportif[i].getNom());
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Station station = new Station("Andorre",0,60,30);
		Sportif paul = new Sportif("Paul",120,"ski", 2,true);
		Sportif adele = new Sportif("Adele",80,"Snow", 1,true);
		station.ajouterSportif(paul);
		station.ajouterSportif(adele);
		station.afficherSportif();
	}
}
