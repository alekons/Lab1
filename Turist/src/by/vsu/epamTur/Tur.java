package by.vsu.epamTur;

import java.util.Comparator;

public class Tur {

	private String transport;
	private String putevka;
	private int pitanie;
	private int numbDay;
	private String name;
	private String mestoTura;
	private int startData;
	private int endData;
	private int priñe;
	private int id;

	public void addTurs(String transport, String putevka, int pitanie,
			int numbDay, String name, String mestoTura, int startData,
			int endDta, int prise, int id) {
		this.transport = transport;
		this.putevka = putevka;
		this.pitanie = pitanie;
		this.numbDay = numbDay;
		this.name = name;
		this.mestoTura = mestoTura;
		this.startData = startData;
		this.endData = endDta;
		this.priñe = prise;
		this.id = id;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getPutevka() {
		return putevka;
	}

	public void setPutevka(String putevka) {
		this.putevka = putevka;
	}

	public int getPitanie() {
		return pitanie;
	}

	public void setPitanie(int pitanie) {
		this.pitanie = pitanie;
	}

	public int getNumbDay() {
		return numbDay;
	}

	public void setNumbDay(int numbDay) {
		this.numbDay = numbDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMestoTura() {
		return mestoTura;
	}

	public void setMestoTura(String mestoTura) {
		this.mestoTura = mestoTura;
	}

	public int getStartData() {
		return startData;
	}

	public void setStartData(int startData) {
		this.startData = startData;
	}

	public int getEndDta() {
		return endData;
	}

	public void setEndDta(int endDta) {
		this.endData = endDta;
	}

	public int getPrice() {
		return priñe;
	}

	public void setPrice(int prise) {
		this.priñe = prise;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {

		String result = "s " + transport + " | " + putevka + " | " + pitanie
				+ " | " + numbDay + " | " + name + " | " + mestoTura + " | "
				+ startData + " | " + endData + " | " + priñe + " | " + id
				+ " |";

		System.out.println(result);
		return result;

	}

	public String toPrint(int line) {

		String result = addSpace(transport, line) + addSpace(putevka, line)
				+ addSpace(pitanie, line) + addSpace(numbDay, line)
				+ addSpace(name, line) + addSpace(mestoTura, line)
				+ addSpace(startData, line) + addSpace(endData, line)
				+ addSpace(priñe, line) + addSpace(id, line);

		System.out.println("|" + result);
		return result;

	}

	private String addSpace(Object str, int maxLine) {
		String strAdd = "";
		// int maxLine = 15;
		int longs = str.toString().length();
		int addSpace = maxLine - longs;
		for (int i = 0; i < addSpace; i++) {
			strAdd = strAdd + " ";
		}

		return str + strAdd + " | ";
	}

	public static Comparator<Tur> turNameComparator = new Comparator<Tur>() {
		public int compare(Tur s1, Tur s2) {
			String TurName1 = s1.getName().toUpperCase();
			String TurName2 = s2.getName().toUpperCase();

			return TurName1.compareTo(TurName2);

		}
	};

	public static Comparator<Tur> turPutevkiComparator = new Comparator<Tur>() {
		public int compare(Tur s1, Tur s2) {
			String TurName1 = s1.getPutevka().toUpperCase();
			String TurName2 = s2.getPutevka().toUpperCase();

			return TurName1.compareTo(TurName2);

		}
	};

	public static Comparator<Tur> turPriceComparator = new Comparator<Tur>() {

		public int compare(Tur s1, Tur s2) {
			int rollno1 = s1.getPrice();
			int rollno2 = s2.getPrice();

			return rollno1 - rollno2;

		}
	};

	public static Comparator<Tur> turStartDataComparator = new Comparator<Tur>() {

		public int compare(Tur s1, Tur s2) {
			int rollno1 = s1.getStartData();
			int rollno2 = s2.getStartData();

			return rollno1 - rollno2;

		}
	};
}
