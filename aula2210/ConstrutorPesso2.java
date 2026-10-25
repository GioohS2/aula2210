package aula2210;

public class ConstrutorPesso2 {

	public static void main(String[] args) {
		
	   Pessoa2 jogador1 = new Pessoa2("Ronaldo", 46);
	   Pessoa2 jogador2 = new Pessoa2("Messi", 36);
	   Pessoa2 jogador3 = new Pessoa2("Neymar");
	
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		System.out.println(jogador3.getNome());

	}

	
}
