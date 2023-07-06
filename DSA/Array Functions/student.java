
import java.util.Scanner;

public class student {
	int id, age;
	double cgpa;
	String name;

	student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		id = sc.nextInt();
		System.out.println("Enter Student Name: ");
		name = sc.next();
		System.out.println("Enter Student age: ");
		age = sc.nextInt();
		System.out.println("Enter Student Cgpa: ");
		cgpa = sc.nextDouble();

	}

	public student(int id, int age, double cgpa, String name) {
		this.id = id;
		this.age = age;
		this.cgpa = cgpa;
		this.name = name;
	}
}
