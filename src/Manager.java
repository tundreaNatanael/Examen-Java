import java.util.ArrayList;

public class Manager extends Angajat {
	
	private ArrayList<Muncitor> muncitori;
	
	//constructors
	public Manager(String nume, String prenume, float salar) {
		super(nume, prenume, salar);
		this.muncitori = new  ArrayList<Muncitor>();
	}
	
	public Manager(String nume, String prenume, float salar, ArrayList<Muncitor> muncitori) {
		super(nume, prenume, salar);
		this.muncitori = muncitori;
	}
	
	//getters
	public ArrayList<Muncitor> getMuncitori() {
		return muncitori;
	}
	
	//methods
	public void addMuncitor(Muncitor newMuncitor) {
		muncitori.add(newMuncitor);
	}

}
