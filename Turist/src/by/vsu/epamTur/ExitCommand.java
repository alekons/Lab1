package by.vsu.epamTur;

import java.util.List;

//команда для выхода
interface IExit {

}

class ExitCommand extends BaseCommand implements IExit {
	private final static String COMMAND_LABEL = "Exit";

	public ExitCommand() {
		super(COMMAND_LABEL);
	}

	@Override
	public void execute() {
		System.out.println("Good bye!");
	}

	@Override
	public void setList(List<Tur> listTur) {
		this.listTur = listTur;
	}
}