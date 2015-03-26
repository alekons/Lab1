package by.vsu.epamTur;

import java.util.List;

public class ReaderTable extends BaseCommand  {

	private final static String COMMAND_LABEL = "Таблица";
	public List<Tur> listTur;
	
	public String[] putName = { "Отдых", "Экскурсии", "Лечение", "Шопингкруиз" };
	public String[] transportName = { "Машина", "Поезд", "Автобус", "Самолет" };
	public String[] titleTable = { "Транспорт", "Тип отдыха", "Питания",
			"Число дней", "Страна", "Город", "Дата отбытия", "Дата прибытия",
			"Цена", "№ Тура" };
	public int line = 15;
	
	public ReaderTable() {
		super(COMMAND_LABEL);
	}
	
	public String[] getPutName() {
		return putName;
	}

	public void setPutName(String[] putName) {
		this.putName = putName;
	}

	public String[] getTransportName() {
		return transportName;
	}

	public void setTransportName(String[] transportName) {
		this.transportName = transportName;
	}

	public String[] getTitleTable() {
		return titleTable;
	}

	public void setTitleTable(String[] titleTable) {
		this.titleTable = titleTable;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}


	public void turPrintTable(List<Tur> turs2) {

		String text = "|";

		for (int i = 0; i < titleTable.length; i++) {
			text = text + addSpace(titleTable[i], line) + " | ";
		}

		System.out.println(space(text.length(), "="));
		System.out.println(text);
		System.out.println(space(text.length(), "="));
		for (int i = 0; i < turs2.size(); i++) {
			turs2.get(i).toPrint(line);
		}
		System.out.println(space(text.length(), "-"));

	}


	private String space(int line, String str) {
		String strAdd = "";
		for (int i = 0; i < line; i++) {
			strAdd = strAdd + str;
		}
		return strAdd;
	}

	private String addSpace(Object str, int line) {
		// int maxLine = 15;
		int longs = str.toString().length();
		int addSpace = line - longs;

		return str + space(addSpace, " ");
	}

	@Override
	public void execute() {
		
		turPrintTable(getList());
		
	}
	
	@Override
	public void setList(List<Tur> listTur) {
		this.listTur = listTur;
	}

	@Override
	public List<Tur> getList() {
		return listTur;
	}
	
}
