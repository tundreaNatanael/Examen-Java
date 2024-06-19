import java.util.TreeMap;

public abstract class Act {
	
	private int ID;
	private Persoana persoana;
	
	//constructor
	public Act(TreeMap<Integer, Act> acte,  Persoana persoana) {
		ID = 0;
		while(ID == 0) {
			int randomID = (int) (Math.random()*100000);
			if(!acte.containsKey(randomID)) {
				ID = randomID;
			}
		}
		this.persoana = persoana;
	}
	
	//getters
	public int getID() {
		return ID;
	}
	
	public Persoana getPersoana() {
		return persoana;
	}
	
	//methods
	public boolean equals(Act act) {
		return this.getID() == act.getID();
	}

}
