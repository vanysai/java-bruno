package jaiza;

public class Animal {
	
		public String nome;
		public double peso;
		
		public Animal() {}
		
		public void Imprimir() {
			System.out.println(
					"Nome: " + this.nome+
					"\nPeso: "+ this.peso);
		}
}
