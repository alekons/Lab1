package by.vsu.epamTur;

import java.util.ArrayList;
import java.util.List;

//организация меню        
class Menu {
 private Console console = new Console();
 private List<ICommand> commands;
 private List<Tur> listTur;

 public Menu(List<ICommand> commands) {
     this.commands = commands;
 }
 
 public void run() {
	 ReaderTable rT = new ReaderTable();
	 rT.turPrintTable(getListTur());
	 
     while (true) {
    	 
         for(int i = 0; i < commands.size(); i++) {
             System.out.println(i + " - " + commands.get(i).getLabel());
         }
         System.out.print("Command? ");
         try {
             int num = console.readInteger();
             commands.get(num).setList(listTur);
             ICommand command = commands.get(num);
             command.execute();
             if (command instanceof IExit) {
                 break;
             }
         } catch (NumberFormatException ex) {
             System.out.println("Illegal number");
         } catch (IndexOutOfBoundsException ex) {
             System.out.println("No such command");
         } catch (Exception ex) {
             System.out.println("Unknown exception");
         }
     }
 }    


 public List<Tur> getListTur() {
	return listTur;
}

public void setListTur(List<Tur> turs) {
	this.listTur = turs;
	
}


}