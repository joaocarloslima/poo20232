package veterinario;

public class App {
	
	public static void main(String[] args) {
		Gato felix = new Gato("preto", 10, 'M');
		//Gato garfield = new Gato();
		
		//felix.cor = "preto";
		felix.setCor("preto");
		//felix.tamanho = -1;
		//felix.genero = 'G';
		
		System.out.println(felix.getTamanho());
		
		felix.miar();
	}

}
