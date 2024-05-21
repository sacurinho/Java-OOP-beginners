package interface_abstract;

public class RunElectro {
	public static void main (String[]args) {
		Electrodomesticos E1 =new Televisor("Hisense");
		Electrodomesticos E2 =new Radio();
		
		System.out.println("Televisor: ");
		System.out.println("Estado: " + E1.estado()); 
		E1.ligar();
		
		System.out.println("Radio: ");
		System.out.println("Estado: " + E2.estado()); 
		E2.ligar();
		
		}
}
