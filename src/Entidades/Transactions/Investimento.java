package Entidades.Transactions;

public class Investimento extends Transacoes {
	String[] conf = {"Pessoal", "Coletivo"};
	
	public Investimento (String data, Double valor, String categoria, String descricao) {
		super(data, valor, "Investimento",categoria, descricao);
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
			throw new IllegalArgumentException("Categoria inválida para Investimento. Categorias permitidas são: " + String.join(", ", conf));
		}
	}
}