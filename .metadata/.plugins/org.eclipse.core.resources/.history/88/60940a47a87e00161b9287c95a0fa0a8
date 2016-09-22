package view;

import java.util.Scanner;

public class StudentViewConsole {
	private Scanner input = new Scanner(System.in);
	private String name;
	private String family;
	private String fNumber;
	private int mark;
	
	public StudentViewConsole () {
		System.out.print("enter student name");
		name = input.next();
		System.out.print("enter student family");
		family = input.next();
		System.out.print("enter fNumber: ");
		//int fNumber = input.nextInt();
		fNumber = input.next();
		System.out.print("enter mark: ");
		mark = input.nextInt();
	}
	
	public void printStudent (String name, String family, String fn, double mark) {
		System.out.println(name + " " + family + " " + fn + " " + mark);
	}
	
	public String getStudentName () {
		return name;
	}
	
	public String getStudentFamily() {
		return family;
	}
	
	public String getStudentFn () {
		return fNumber;
	}
	
	public int getStrudentMark() {
		return mark;
	}
}