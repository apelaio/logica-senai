package Exemplos;

public class ExcecaoIndiceStringNaoExiste {
public static void main(String[] args) {
	try {
	
	String a = "N�o sei o que t� fazendo"; 
	char c = a.charAt(50);
	System.out.println(c);
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("N�o existe String > que 50");
	}
}
}
