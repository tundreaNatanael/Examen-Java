import java.util.TreeMap;

public class Oferta extends Act {

	private float valoareaTotala;
	
	//constructor
	public Oferta(TreeMap<Integer, Act> acte, float valoareaTotala, Client client) {
		super(acte, client);
		this.valoareaTotala = valoareaTotala;
	}

}
