package carCaseStudy;

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList l = new LinkedList();
		// changes values or add new one
		Car c = new Car("1", 2016, 10000);
		l.insertAtStart(c);
		Car c1 = new Car("2", 2009, 20000);
		l.insertAtStart(c1);

		System.out.println("Count :" + l.count());

		l.charge();
		l.display(2016);
		l.display(2009);
		System.out.println();
	}

}
