package Exemplos;

public class ExcecaoIndiceStringNaoExiste {
public static void main(String[] args) {
	try {
	
	String a = "Não sei o que tô fazendo"; 
	char c = a.charAt(50);
	System.out.println(c);
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("Não existe String > que 50");
	}
}
}
