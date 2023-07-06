
import java.util.Scanner;

public class Arryfuntions {

	int arrysize;
	student[] s;

	Arryfuntions() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size: ");
		arrysize = sc.nextInt();
		s = new student[arrysize];
		for (int i = 0; i < arrysize; i++) {
			s[i] = new student();

		}
	}

	public void search(int age, Arryfuntions a) {
		int chk = 0;
		if (a.s[0].id == -1) {
			System.out.println("Arry empty");
		} else {
			int i = 0;
			while (i < a.s.length) {
				if (a.s[i].age == age) {
					chk++;
					System.out.println("found");
					break;
				} else if (a.s[i].age < age) {
					i = i * 2 + 2;
				} else {
					i = i * 2 + 1;
				}
			}
		}

	}

	public void insert(student s1) {
		int i = 0;
		if (s[0].id == -1)
			s[0] = s1;
		else {
			while (true) {
				if (s[i].id < s1.id) {
					if (s[i * 2 + 2].id == -1) {
						s[i * 2 + 2] = s1;
						break;
					} else {
						i = i * 2 + 2;
					}
				} else {
					if (s[i * 2 + 1].id == -1) {
						s[i * 2 + 1] = s1;
						break;
					} else
						i = i * 2 + 1;
				}
			}
		}
	}

	public void preorder(int i, Arryfuntions a) {
		if (a.s[i].id == -1) {
			return;
		} else {
			System.out.println(a.s[i].name);
			System.out.println(a.s[i].id);
			System.out.println(a.s[i].cgpa);
			System.out.println(a.s[i].age);
			preorder(i * 2 + 1, a);
			preorder(i * 2 + 2, a);
		}
	}

	public void inorder(int i) {
		if (s[i].id == -1) {
			return;
		} else {
			inorder(i * 2 + 1);
			System.out.println(s[i].name);
			System.out.println(s[i].id);
			System.out.println(s[i].cgpa);
			System.out.println(s[i].age);
			inorder(i * 2 + 2);
		}
	}

	public void postorder(int i) {
		if (s[i].id == -1) {
			return;
		} else {
			postorder(i * 2 + 1);
			postorder(i * 2 + 2);
			System.out.println(s[i].name);
			System.out.println(s[i].id);
			System.out.println(s[i].cgpa);
			System.out.println(s[i].age);
		}
	}
}