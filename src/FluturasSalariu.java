import java.util.TreeMap;

public class FluturasSalariu extends Act {
	
	private float valoareSalar;
	
	//constructor
	public FluturasSalariu(TreeMap<Integer, Act> acte, Angajat angajat) throws EmitereSalarRefuzataException {
		super(acte, angajat);
		this.valoareSalar = angajat.getSalar();
		if(!angajat.getActiv())
			throw new EmitereSalarRefuzataException();
	}

}
