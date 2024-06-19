import java.util.ArrayList;

public class Muncitor extends Angajat {

	private ArrayList<String> reponsabilitati;
	
	//constructors
	public Muncitor(String nume, String prenume, float salar) {
		super(nume, prenume, salar);
		this.reponsabilitati = new ArrayList<String>();
	}
	
	public Muncitor(String nume, String prenume, float salar, ArrayList<String> reponsabilitati) {
		super(nume, prenume, salar);
		this.reponsabilitati = reponsabilitati;
	}
	
	//getters
	public ArrayList<String> getReponsabilitati() {
		return reponsabilitati;
	}

}
