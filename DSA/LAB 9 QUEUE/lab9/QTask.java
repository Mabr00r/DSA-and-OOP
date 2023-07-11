package lab9;

import java.util.Scanner;

public class QTask {

	Data[] x;

	int front = 0, rear = 0;

	public QTask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int s = sc.nextInt();
		Data d = null;

		x = new Data[s];

		for (int i = 0; i < s; i++) {
			x[i] = new Data();
		}
	}

	public void enqueue(Data d) {
		if (rear == x.length - 1) {
			System.out.println("Queue already full");
		} else {
			x[++rear] = d;
		}
	}

	public Data dequeue() {
		if (rear == -1) {
			System.out.println("Queue is EMpty");
			return null;
		} else if (front > rear) {
			System.out.println("Queue is empty");
			return null;
		} else {
			return x[front++];
		}
	}

	public void display() {

		if (front > rear) {
			System.out.println("Queue is EMpty");
			return;
		}
		if (rear == -1) {
			System.out.println("Queue is EMpty");
			return;
		}

		for (int i = front; i <= rear; i++) {
			System.out.println("ID :" + x[i].d);
			System.out.println("Name :" + x[i].name);
		}
	}

	public void swap() {

		Data[] d1 = new Data[x.length + 1];
		Data first = x[0];
		Data sec = x[1];
		Data last = x[x.length - 1];
		Data seclast = x[x.length - 2];
		if (x.length < 4) {
			x[0] = last;
			x[x.length - 1] = first;
		} else {
			x[0] = last;
			x[1] = seclast;
			x[x.length - 1] = first;
			x[x.length - 2] = sec;
		}

	}

	public static void main(String[] args) {

		QTask q = new QTask();
		int ch;

		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER CHOICE");
			System.out.println("1: ENQUEUE");
			System.out.println("2: DEQUEUE");
			System.out.println("3: DISPLAY");
			System.out.println("4: Swap");
			System.out.println("5: Exit");
			ch = sc.nextInt();

			switch (ch) {
				case 1:
					Data d = new Data();
					System.out.println("ENTER ID");
					d.d = sc.nextInt();
					System.out.println("ENTER Name");
					d.name = sc.next();

					q.enqueue(d);
					break;
				case 2:
					Data ab = q.dequeue();
					System.out.println(ab.d);
					System.out.println(ab.name);
					break;
				case 3:
					q.display();
					break;
				case 4:
					q.swap();
					break;

				case 5:
					System.exit(0);

			}
		} while (ch != 5);
	}

}
