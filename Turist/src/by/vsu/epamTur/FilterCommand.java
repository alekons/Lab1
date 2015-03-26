package by.vsu.epamTur;

import java.util.List;

public class FilterCommand extends BaseCommand {
	private final static String COMMAND_LABEL = "Фильтрция";
	public List<Tur> listTur;
	private Console console = new Console();
	private SelectTur sT = new SelectTur();
	private ReaderTable rT = new ReaderTable();

	public FilterCommand() {
		super(COMMAND_LABEL);
	}

	@Override
	public void execute() {

		while (true) {
			printSortValue(rT.getTransportName());
			int transport = console.readInteger();

			System.out.println("Питание (количество раз в день)");
			int pitanie = console.readInteger();

			System.out.println("Количество день тура");
			int day = console.readInteger();

			List<Tur> list = sT.searchTur(getList(), rT.getPutName(),
					rT.getTransportName(), transport, pitanie, day);

			rT.turPrintTable(list);

			System.out.println("Фильтрция - Выполнена");

			System.out.println("Повторить поиск (1(Да)/0(Нет))?");
			int exit = console.readInteger();
			if (exit == 0) {
				break;
			} else {
				rT.turPrintTable(getList());
			}
		}
	}

	public void printSortValue(String[] text) {
		for (int i = 0; i < text.length; i++) {
			System.out.println(i + " - " + text[i]);
		}
		System.out.print("Command sort? ");
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
