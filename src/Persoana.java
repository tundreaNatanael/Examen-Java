
public abstract class Persoana {
	private String nume, prenume;
	
	//constructor
	public Persoana(String nume, String prenume) {
		this.nume = nume;
		this.prenume = prenume;
	}
	
	//getters
	public String getNume() {
		return nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public String toString() {
		return getNume() + " " + getPrenume() + " (" + this.getClass().getName() + ")";
	}
	
	public boolean equals(Persoana persoana) {
		return (this.getNume() + this.getPrenume()).equals(persoana.getNume() + persoana.getPrenume());
	}

}
