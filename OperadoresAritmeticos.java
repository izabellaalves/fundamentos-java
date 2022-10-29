package cursojava;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		double i=10;
		System.out.println("i = " + i );
		System.out.println("i = "+i+ " + 5 | i = " + (i+5));
		System.out.println("i = "+i+ " - 5 | i = " + (i-5));
		System.out.println("i = "+i+ " * 5 | i = " + (i*5));
		System.out.println("i = "+i+ " / 5 | i = " + (i/5));
		System.out.println("i = "+i+ " % 5 | i = " + (i%5));
		
		System.out.println("i += 5       | = " + (i+=5));
		System.out.println("i -= 5       | = " + (i-=5));
		System.out.println("i *= 5       | = " + (i*=5));
		System.out.println("i /= 5       | = " + (i/=5));
		i++;
		System.out.println("i++ =        | = " +i);
		i--;
		System.out.println("i-- =        | = " +i);
	}

}
