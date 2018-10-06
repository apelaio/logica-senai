package Exemplos;

public class ExcecaoIndiceArrayNaoExiste {
public static void main(String[] args) {
	try {
	
	int a[] = new int[5];
	a[6] = 9;
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array máximo vai até 5. Não existe Array > que 5. Favor tentar novamente");
	}
}
}
