package Exemplos;

public class DoWhile {
	public static void main(String[] args ) {
		int num = 1;
		
		do {
			System.out.println("Olha eu aqui pela " + num + " vez!");
			++num;
		} while (num < 10);
	}

}
