package Exemplos;

public class ExcecaoformatoNumero {
	public static void main(String[] args) {
		try {

			int num = Integer.parseInt(" :P ");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Este não é um número válido");
		}
	}
}
