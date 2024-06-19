import java.util.TreeMap;

public abstract class Angajat extends Persoana {

	private int vechime;
	private float salar;
	private boolean activ;
	
	//constructor
	public Angajat(String nume, String prenume, float salar) {
		super(nume, prenume);
		this.vechime = 0;
		this.salar = salar;
		this.activ = true;
	}
	
	//getters
	public int getVechime() {
		return vechime;
	}
	
	public float getSalar() {
		return calculareSalar(this.salar, this.vechime);
	}
	
	public boolean getActiv() {
		return this.activ;
	}
	
	public void concediat() {
		this.activ = false;
	}
	
	public void reangajat() {
		this.activ = true;
	}
	
	//methods
	public void incrementVechime() {
		if(activ)
			this.vechime++;
	}
	
	private float calculareSalar(float newSalar, float newVechime) {
		if(newVechime == 0)
			return  newSalar;
		else
			return calculareSalar(newSalar + newSalar/10, newVechime-1);
	}
	
	public FluturasSalariu emiteFluturasSalar(TreeMap<Integer, Act> acte) throws EmitereSalarRefuzataException{
		return new FluturasSalariu(acte, this);
	}
}
