import java.util.*;

public class Fabrica {

	private ArrayList<Angajat> angajati;
	private ArrayList<Client> clienti;
	private TreeMap<Integer, Act> acte;
	
	//constructor
	public Fabrica() {
		this.angajati = new ArrayList<Angajat>();
		this.clienti = new ArrayList<Client>();
		this.acte = new TreeMap<Integer, Act>();
	}
	
	//getters
	public ArrayList<Angajat> getAngajati() {
		return angajati;
	}
	
	public ArrayList<Client> getClienti() {
		return clienti;
	}
	
	public TreeMap<Integer, Act> getActe() {
		return acte;
	}
	
	private String toStringAngajatiActivi() {
		String output = "Angajati activi:";
		for(Angajat angajat: angajati) {
			if(angajat.getActiv())
				output += "\n" + angajat.toString();
		}
		return output;
	}
	
	private String toStringClienti() {
		String output = "Clienti:";
		for(Client client: clienti) {
			output += "\n" + client.toString();
		}
		return output;
	}
	
	private String toStringActe() {
		String outputOferte = "Oferte:";
		String outputFluturaseSalariu = "Fluturase Salariu:";
		
		Collection c = acte.values();
		Iterator itr = c.iterator();
		
		while(itr.hasNext()) {
			Act act = (Act) itr.next();
			if(act.getClass().getName().equals("Oferta")) {
				 outputOferte += "\nOferta " + act.getID() + " - " + act.getPersoana().toString();
			 } else {
				 outputFluturaseSalariu += "\nFluturas Salariu " + act.getID() +  " - " + act.getPersoana().toString();
			 }
		}
		
		return outputOferte + "\n" + outputFluturaseSalariu;
	}
	
	//methods
	public void addAct(Act newAct) {
		acte.put(newAct.getID(), newAct);
	}
	public void addClient(Client newClient) {
		boolean exists = false;
		for(Client client: clienti)
			if(client.equals(newClient)) {
				exists = true;
				break;
			}
		
		if(!exists)
			clienti.add(newClient);
	}
	public void addAngajat(Angajat newAngajat) {
		boolean exists = false;
		for(Angajat angajat: angajati)
			if(angajat.equals(newAngajat)) {
				exists = true;
				break;
			}
		
		if(!exists)
			angajati.add(newAngajat);
	}
	
	public void concediereAngajat(Angajat angajat) {
		angajati.remove(angajat);
	}
	
	public void printAngajatiActivi() {
		System.out.println(toStringAngajatiActivi());
	}
	
	public void printClienti() {
		System.out.println(toStringClienti());
	}
	
	public void printActe() {
		System.out.println(toStringActe());
	}

}
