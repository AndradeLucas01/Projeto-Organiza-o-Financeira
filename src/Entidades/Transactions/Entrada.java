package Entidades.Transactions;

import java.lang.IllegalArgumentException;

public class Entrada extends Transacoes {
	String[] conf = {"Serviço", "Salário"};
	
	public Entrada (String data, Double valor, String categoria, String descricao) {
		super(data, valor, "Entrada",categoria, descricao);
	}
	
	@Override
	public void setCategoria(String categoria) {
		boolean categoriaValida = false;
		for (String cat : conf) {
			if (cat.equals(categoria)) {
				categoriaValida = true;
				break;
			}
		}
		
		if (categoriaValida) {
			super.setCategoria(categoria);
		} else {
			throw new IllegalArgumentException("Categoria inválida para Entrada. Categorias permitidas são: " + String.join(", ", conf));
		}
	}
}