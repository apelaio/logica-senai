package Exemplos;

public class ExcecaoformatoNumero {
	public static void main(String[] args) {
		try {

			int num = Integer.parseInt(" :P ");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Este n�o � um n�mero v�lido");
		}
	}
}
