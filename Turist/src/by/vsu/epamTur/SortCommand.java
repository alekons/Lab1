package by.vsu.epamTur;

import java.util.Collections;
import java.util.List;

public class SortCommand extends BaseCommand {
	private final static String COMMAND_LABEL = "Сортировка";
	private Console console = new Console();
	public List<Tur> listTur;
	private ReaderTable rT = new ReaderTable();
	public SortCommand() {
		super(COMMAND_LABEL);
	}

	@Override
	public void execute() {
		System.out
				.println("Сотрировать по : 1 - названию. 2 - цене. 3 - дате отбытия. 4 - путевке.");
		int keySearch = console.readInteger();
		switch (keySearch) {
		case 1:
			Collections.sort(getList(), Tur.turNameComparator);
			break;
		case 2:
			Collections.sort(getList(), Tur.turPriceComparator);
			break;
		case 3:
			Collections.sort(getList(), Tur.turStartDataComparator);
			break;
		case 4:
			Collections.sort(getList(), Tur.turNameComparator);
			break;
		default:
			break;
		}
		rT.turPrintTable(getList());
		System.out.println("Сортировка - Выполнена");
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