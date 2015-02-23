package Exercicio04;

public class TesteErro {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do  main");
	}

	private static void metodo1() {
		System.out.println("Inicio do Metodo1");
		try {
			metodo2();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Pego Erro!");
		}
		System.out.println("Fim do Metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio do Metodo2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("Fim do Metodo2");
	}
}
