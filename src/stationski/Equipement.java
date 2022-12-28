package stationski;

public enum Equipement {
	Casque("casque"), Ski("ski"),Baton("baton"),Chaussureski("chaussure de ski"), Snowboard("snowboard"), Protegepoignet("protege poignet"),Boot("boot snow");
	private String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}

}
