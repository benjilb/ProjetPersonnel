package stationski;

public class Restaurant {
	private String nom;
	private int caisse;
	private String plat1;
	private int prixPlat1;
	private int invPlat1;
	private String plat2;
	private int prixPlat2;
	private int invPlat2;
	
	public Restaurant(String nom, int caisse, String plat1, int prixPlat1, int invPlat1, String plat2, int prixPlat2, int invPlat2) {
		this.nom = nom;
		this.caisse = caisse;
		this.plat1 = plat1;
		this.prixPlat1 = prixPlat1;
		this.invPlat1 = invPlat1;
		this.plat2 = plat2;
		this.prixPlat2 = prixPlat2;
		this.invPlat2 = invPlat2;
	}
	protected String getNom() {
		return nom;
	}
	
	protected void parler(String texte){
		System.out.println("(" + getNom() + ")" + "< " + texte + " >");
	}
	
	protected void gagnerArgent(int gain) {
		caisse = caisse + gain;
	}
	
	public void servirClient(Humain humain, String plat) {
		if (plat == "menu1") {
			humain.parler("Bonjour je vais prendre " + plat1);
			if (invPlat1 <= 0) {
				parler("Desole, " + plat1 + " n'est plus disponible ");

			} else {
				invPlat1--;
				humain.perdreArgent(prixPlat1);
				gagnerArgent(prixPlat1);
				humain.parler("Merci, j'ai encore " + humain.getArgent() + "€ sur mon compte");
			}
		} else {
			humain.parler("Bonjour je vais prendre " + plat2);
			if (invPlat2 <= 0) {
				parler("Desole, " + plat2 + " n'est plus disponible ");
			} else {
				invPlat2--;
				humain.perdreArgent(prixPlat2);
				gagnerArgent(prixPlat2);
				humain.parler("Merci, j'ai encore " + humain.getArgent() + "€ sur mon compte");
			}
		}
	}
		
		
	

}
