package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1,"Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2,"Joaquim da Silva", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(3,"Jose da Silva", "jose@gmail.com");

		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p3);

	}

}
