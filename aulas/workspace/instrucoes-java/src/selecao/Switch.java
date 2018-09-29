package selecao;

public class Switch {
	public static void main(String[] args) {
			String passeio = "montanha";
			
			switch (passeio) {
case "montanha": 
System.out.println("Bora escalar!");
	break;
case "deserto":
System.out.println("Leva uma Água");
	break;
case "floresta":
System.out.println("Vai lá, Tarzam");
	break;
case "mar": 
System.out.println("Compra uma bóia!");
	break;
				default:
					System.out.println("ah, bora assistir Netflix");
					break;
					
			}
	}
}

 