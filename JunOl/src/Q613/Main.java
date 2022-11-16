package Q613;

import java.util.Scanner;

//class Students {
//	String name;
//	String school;
//	int grade;
//}
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Students Class = new Students();
//
//		Class.name = sc.next();
//		Class.school = sc.next();
//		Class.grade = sc.nextInt();
//		sc.close();
//
//		System.out.println("Name : " + Class.name);
//		System.out.println("School : " + Class.school);
//		System.out.println("Grade : " + Class.grade);
//
//	}
//}

/* 선생님 문제풀이 */

class Students {
	private String name;
	private String school;
	private int grade;
	
	public Students(String name, String school, int grade){
		this.name= name;
		this.school = school;
		this.grade = grade;
	}
	public void print() {
		System.out.println("Name : " + name);
		System.out.println("School : " + school);
		System.out.println("Grade : " + grade);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();
		int num = sc.nextInt();
		sc.close();

		Students str = new Students(str1,str2,num);
		str.print();
	}
}