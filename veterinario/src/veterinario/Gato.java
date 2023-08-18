package veterinario;

public class Gato {
	
	//atributos
	private String cor;
	private double tamanho;
	private char genero;
	
	public Gato(String cor, double tamanho, char genero) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.genero = genero;
	}
	
	//metodos
	void miar() {
		System.out.println("miua");
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	void julgar() {
		System.out.println(":|");
	}
	
	public double getTamanho() {
		return tamanho;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
