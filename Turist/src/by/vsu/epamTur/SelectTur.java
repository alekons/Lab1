package by.vsu.epamTur;

import java.util.ArrayList;
import java.util.List;

public class SelectTur {

	public List<Tur> searchTur(List<Tur> turs,
			String[] putName, String[] transportName, int transport,
			int pitanie, int day) {
		List<Tur> result = new ArrayList<Tur>();
		int e = 0;
		for (int i = 0; i < turs.size(); i++) {
			if (turs.get(i).getTransport().equals(transportName[transport])) {

				if (turs.get(i).getPitanie() == pitanie) {

					if (turs.get(i).getNumbDay() == day) {

						result.add(e, turs.get(i));
						e++;

					}
				}
			}
		}
			

		return result;

	}

}
