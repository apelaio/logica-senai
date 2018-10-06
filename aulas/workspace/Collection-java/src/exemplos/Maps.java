package exemplos;

import java.util.HashMap;

public class Maps {
	public static void main(String[] args) {
		HashMap<Integer, String> alunosLogica = new HashMap<>();
		
		
		alunosLogica.put(1, "Alex");
		alunosLogica.put(2, "Alexandre");
		alunosLogica.put(3, "André");
		
		System.out.println(alunosLogica);
		
		// Imprimir valores do mapa
		for (Integer Key : alunosLogica.KeySet()) {
			System.out.println("Chave " + Key);
			System.out.println(alunosLogica.get(key));
		}
		
		HashMap<Integer, String> empresas = new HashMap<>();
		
		
		empresas.put("Apple", "Empresa de eletrônicos");
		empresas.put("Walmart", "Empresa de varejo");
		empresas.put("Sony", "Empresa de eletronicos");
		
		// Recuperar valor do mapa
		String descricaoApple = empresas.get"Apple");
		System.out.println(descricaoApple);
		
	}

}
