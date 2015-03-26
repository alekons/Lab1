package by.vsu.epamTur;

import java.util.ArrayList;
import java.util.Arrays;

public class Main extends TurFirma {

	public static void main(String[] args) {

		turs = new ArrayList<Tur>();
		TurFirma tF = new TurFirma();
		turs = (ArrayList<Tur>) tF.addTur();

		Menu menu = new Menu(
				Arrays.<ICommand> asList(new ExitCommand(), new SortCommand(), new FilterCommand(), new ReaderTable()));
		menu.setListTur(turs);
		menu.run();

	}
}
