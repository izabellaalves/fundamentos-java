package cursojava;

public class LaçosdeRepetiçao {

	public static void main(String[] args) {
		
		//for
		for (int j = 10; j>0; j--) {
			System.out.println("Hello " + j);
		}
		
		for (int tabuada = 0; tabuada <=10; tabuada++) {
			for (int valor=0; valor <=10; valor++) {
				System.out.println(valor + " * " + tabuada +  " = " + (valor*tabuada));
			}
			System.out.println("-------------------------------------");
		}
		
		//while
		
		int contador = 1;
		while (contador <=10) {
			System.out.println(contador);
			contador++;
		}

	}

}
