package by.vsu.epamTur;

import java.util.List;

//��������� ��� ����� �������
interface ICommand {
 String getLabel();
 void execute();
 List<Tur> getList();
 void setList(List<Tur> list);
}

//����� ���������� ��� ���� ������
abstract class BaseCommand implements ICommand {
 
 private String label;
 public List<Tur> listTur;
 
 public BaseCommand(String label) {
     this.label = label;
 }

 public String getLabel() {
     return label;
 }    
 
 public void setList(List<Tur> listTur) {
     this.listTur = listTur;
 } 
 
 public List<Tur> getList() {
     return listTur;
 } 
 
}