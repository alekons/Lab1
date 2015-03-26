package by.vsu.epamTur;

import java.util.Collections;
import java.util.List;

public class SortCommand extends BaseCommand {
	private final static String COMMAND_LABEL = "����������";
	private Console console = new Console();
	public List<Tur> listTur;
	private ReaderTable rT = new ReaderTable();
	public SortCommand() {
		super(COMMAND_LABEL);
	}

	@Override
	public void execute() {
		System.out
				.println("����������� �� : 1 - ��������. 2 - ����. 3 - ���� �������. 4 - �������.");
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
		System.out.println("���������� - ���������");
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