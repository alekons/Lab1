package by.vsu.epamTur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TurFirma {

	public String[] putName = { "�����", "���������", "�������", "�����������" };
	public String[] transportName = { "������", "�����", "�������", "�������" };
	public String[] titleTable = { "���������", "��� ������", "�������",
			"����� ����", "������", "�����", "���� �������", "���� ��������",
			"����", "� ����" };

	public Scanner in;

	public int line = 15;

	public static int transNum;
	public static int dayNum;
	public static int pitanieNum;

	public static List<Tur> turs;

	public void toStringFor(String[] name) {

		for (int i = 0; i < name.length; i++) {

			System.out.print(i + ")" + name[i] + ". ");
		}

	}

	public List<Tur> addTur() {
		GenertorTur gT = new GenertorTur();
		ArrayList<Tur> tury = gT.genericTur(transportName, putName);
		return tury;

	}

//	public String enterStr(String text) {
//		in = new Scanner(System.in);
//		System.out.print("" + text);
//		String res = in.nextLine();
//
//		return res;
//
//	}
//
//	public int enterInt(String text) {
//
//		System.out.println("\n" + text);
//		in = new Scanner(System.in);
//		int arg = in.nextInt();
//
//		return arg;
//
//	}

//	public void menu(List<Tur> listTur) {
//    		
//		/*������ ��� ���������� ����*/
//		String textMenu = "| f - ������ | s - ����������� | add - ��������� ��� | x - ����� | ";
//		System.out.println(textMenu);
//
//		String key = enterStr("����: ");
//		switch (key) {
//		case "f":
//			toStringFor(transportName);
//			enterInt("�������� ��� ���������� (0 - "
//					+ (transportName.length - 1) + "): ");
//			enterInt("�������� ����������� ����� (0 - 3): ");
//			enterInt("�������� ����������� ���� (1 - 10): ");
//			searchTur(listTur, transNum, pitanieNum, dayNum);
//			break;
//		case "add":
//			turs = addTurOne(turs);
//			break;
//		case "s":
//			System.out
//					.println("����������� �� : 1 - ��������. 2 - ����. 3 - ���� �������. 4 - �������.");
//			int keySearch = enterInt("������� �����: ");
//			switch (keySearch) {
//			case 1:
//				Collections.sort(listTur, Tur.turNameComparator);
//				break;
//			case 2:
//				Collections.sort(listTur, Tur.turPriceComparator);
//				break;
//			case 3:
//				Collections.sort(listTur, Tur.turStartDataComparator);
//				break;
//			case 4:
//				Collections.sort(listTur, Tur.turNameComparator);
//				break;
//			default:
//				break;
//			}
//			turPrintTable(listTur);
//			break;
//		case "x":
//			System.out.println("Exit.");
//		default:
//			break;
//		}
//
//	}

//	private List<Tur> addTurOne(List<Tur> turs2) {
//		List<Tur> listTur = new ArrayList<Tur>();
//		listTur.addAll(turs2);
//		Tur turAdd = new Tur();
//
//		turAdd.addTurs(enterStr(titleTable[0]), enterStr(titleTable[1]),
//				enterInt(titleTable[2]), enterInt(titleTable[3]), enterStr(titleTable[4]),
//				enterStr(titleTable[5]), enterInt(titleTable[6]), enterInt(titleTable[7]), enterInt(titleTable[8]), enterInt(titleTable[9]));
//		hashCode();
//
//		return null;
//	}

//	public void searchTur(List<Tur> turs, int transNum, int pitanieNum,
//			int dayNum) {
//		SelectTur sT = new SelectTur();
//		List<Tur> result = sT.searchTur(turs, putName, transportName, transNum,
//				pitanieNum, dayNum);
//
//		System.out.println("��������� ������: ");
//		if (result.size() != 0) {
//			turPrintTable(result);
//		} else {
//			System.out.println("���� � ������ ����������� ������ ���");
//		}
//
//	}

//	public void turPrintTable(List<Tur> turs2) {
//
//		String text = "|";
//
//		for (int i = 0; i < titleTable.length; i++) {
//			text = text + addSpace(titleTable[i], line) + " | ";
//		}
//
//		System.out.println(space(text.length(), "="));
//		System.out.println(text);
//		System.out.println(space(text.length(), "="));
//		for (int i = 0; i < turs2.size(); i++) {
//			turs2.get(i).toPrint(line);
//		}
//		System.out.println(space(text.length(), "-"));
//
//	}


	
}
