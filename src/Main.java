
public class Main {

	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica();
		fabrica.addAngajat(new Muncitor("Ion", "Gheorghe", 2000F));
		fabrica.addAngajat(new Muncitor("Ion", "Mihai", 20230F));
		fabrica.addAngajat(new Manager("Gica", "Hagi", 100000F));
		
		fabrica.printAngajatiActivi();
		
		fabrica.addClient(new Client("Gica", "Popescu"));
		fabrica.addClient(new Client("Mac", "Nura"));
		fabrica.addClient(new Client("Microsoft", "gates"));
		
		fabrica.printClienti();
		try {
			fabrica.addAct(fabrica.getAngajati().get(1).emiteFluturasSalar(fabrica.getActe()));
		} catch(Exception e){
			System.out.println("nu se poate emite salar");
		}
		
		fabrica.printActe();
		

	}

}
