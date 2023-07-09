package labSix;

public class Nod {
	int account_id;
	String fullName;
	double currbal;
	Nod next;

	Nod(int aid, String fName, double cBal) {
		account_id = aid;
		fullName = fName;
		currbal = cBal;
		next = null;
	}
}
