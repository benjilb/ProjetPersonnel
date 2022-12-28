package histoire;

import java.util.Iterator;

import stationski.*;

public class Scenario {

	public static void main(String[] args) {
		Station station = new Station("Andorre",0,60,30,10);
		//for (int journee=0; journee < 2; journee++) {
			station.skiable();
			Sportif paul = new Sportif("Paul",120,"ski", 2, false);
			Sportif adele = new Sportif("Adele",80,"Snow", 1,false);
			paul.acheterforfait(station);
			adele.acheterforfait(station);

			station.afficherSportif();
		//}
	
	}

}
