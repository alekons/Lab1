package by.vsu.epamTur;

import java.util.List;

public class AddCommand extends BaseCommand {
    private final static String COMMAND_LABEL = "First Command";

    public AddCommand() {
        super(COMMAND_LABEL);
    }
    
    @Override
    public void execute() {
        System.out.println("��� ��������.");
    }

    @Override
	public void setList(List<Tur> listTur) {
		this.listTur = listTur;
	}
}
