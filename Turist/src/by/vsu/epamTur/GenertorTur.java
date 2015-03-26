package by.vsu.epamTur;

import java.util.ArrayList;

public class GenertorTur {

	public ArrayList<Tur> genericTur(String[] transportName, String[] putName) {
		ArrayList<Tur> generikTur = new ArrayList<Tur>();
		Tur addTur = new Tur();
		int i = 0;

		addTur.addTurs(transportName[0], putName[0], 3, 10, "Турция",
				"Анталия", 20150110, 20150120, 500, ++i);
		generikTur.add(addTur);

		addTur = new Tur();
		addTur.addTurs(transportName[2], putName[0], 1, 10, "Италия", "Рим",
				20150210, 20150220, 200, ++i);
		generikTur.add(addTur);

		addTur = new Tur();
		addTur.addTurs(transportName[0], putName[1], 3, 3, "Италия", "Рим",
				20150210, 20150214, 100, ++i);
		generikTur.add(addTur);

		addTur = new Tur();
		addTur.addTurs(transportName[3], putName[2], 3, 10, "Крым",
				"Крымский п-т", 20150310, 20150320, 220, ++i);
		generikTur.add(addTur);

		addTur = new Tur();
		addTur.addTurs(transportName[2], putName[1], 0, 1, "Италия", "Рим",
				20150210, 20150211, 100, ++i);
		generikTur.add(addTur);

		addTur = new Tur();
		addTur.addTurs(transportName[1], putName[0], 3, 10, "Франция", "Париж",
				20150510, 20150520, 5000, ++i);
		generikTur.add(addTur);

		addTur = new Tur();
		addTur.addTurs("Поезд", putName[0], 0, 10, "Германия", "Мюнхен",
				20150210, 20150220, 100, ++i);
		generikTur.add(addTur);

		addTur = new Tur();
		addTur.addTurs("Поезд", putName[0], 3, 5, "Россия", "С.Питербург.",
				20150210, 20150205, 100, ++i);
		generikTur.add(addTur);

		return generikTur;

	}
	
}
