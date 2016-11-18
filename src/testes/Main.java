package testes;

import br.com.fighter.*;
public class Main {

	public static void main(String[] args) {
		
		Fighter lutador1 = new Fighter("Lew", 10, 2);
		Fighter lutador2 = new Fighter("Harry", 5, 4);
		
		lutador1.DeclareWinner(lutador1, lutador2, "Lew");
	}
}
