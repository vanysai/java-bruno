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


package jaiza;

public class Animal {
	
		//encapsulamento
		private String nome;
		private double peso;
		
		//construtores
		public Animal() {}
		
		
		public Animal(String nome, double peso) {
		}
		public Animal(String nome){
		}
		
		//métodos
		public void Imprimir() {
			System.out.println("Nome: " + this.nome + "\nPeso: " + this.peso);
		
		}
		//criar metodo para atribuir e recuperar o valor
		//da variavel
		
		public void AddNome(String nome) {
			this.nome = nome;
		}


		public void AddNome(double peso) {
			this.peso = peso;
		}
		
}
