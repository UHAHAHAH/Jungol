package Q614;

import java.util.Scanner;

class School {
	private String SHname;
	private int grade;

	School(String school, int grade) {
		this.SHname = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in " + SHname + " School");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school2 = sc.next();
		int grade2 = sc.nextInt();
		sc.close();

		School student1 = new School("Jejuelementary", 6);
		School student2 = new School(school2, grade2);
		
		student1.print();
		student2.print();
		
	}
}

/* 선생님 문제풀이 */
//class Student {
//	private String schoolName;
//	private int grade;
//	
//	public void setSchool(String schoolName) {
//		this.schoolName = schoolName;
//	}
//	
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//	
//	public void print() {
//		System.out.println(grade + " grade in " + schoolName + " School");
//	}
//}
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String schoolname = sc.next();
//		int grade = sc.nextInt();
//		sc.close();
//		
//		Student stu1 = new Student();
//		stu1.setSchool("Jejuelementary");
//		stu1.setGrade(6);
//		
//		
//		Student stu2 = new Student();
//		stu2.setSchool(schoolname);
//		stu2.setGrade(grade);
//		
//		stu1.print();
//		stu2.print();		
//	}
//}
