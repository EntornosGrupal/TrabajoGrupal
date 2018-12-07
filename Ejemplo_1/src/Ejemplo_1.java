
public class Ejemplo_1 {
	public static void main(String[] args) {
		for (int x=0; x<10; x++) {
			System.out.print("Hola");
		}
		int Contador=0;
		while (Contador<10) {
			
			Contador= Contador+1;
			System.out.print(Contador);
			if (Contador== 5) {
				System.out.println("El contador ha llegado a 5");
			}
		}
		System.out.print("Hola2");
		
	}
}
