
public class Main {

	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica();
		fabrica.addAngajat(new Muncitor("Ion", "Gheorghe", 2000F));
		fabrica.addAngajat(new Muncitor("Ion", "Mihai", 20230F));
		fabrica.addAngajat(new Manager("Gica", "Hagi", 100000F));
		
		fabrica.printAngajatiActivi();

	}

}