package selecao;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Elseif {
	public static void main(String[] args) {
		float preco = 0.90f;	
		
		if (preco <= 1.99) {
			System.out.println("Compra logo!");
		} else if (preco > 1.99 && preco <= 60.0) {
			System.out.println("Ah, vou pensar...");
		}  else {
			System.out.println("Faloooooooooooou!");
		}
	}

}
