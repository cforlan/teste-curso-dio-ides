package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livros livros = new Livros();
		Gato gato = new Gato();
		
		System.out.println(gato);
		System.out.println(livros);
		int a = 2;
		int b = 3;
		System.out.println("Hello World " + (a*b));
	}

}
class Livros {
	private String nome;
	private String npag;
}