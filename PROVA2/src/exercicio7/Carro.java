package exercicio7;

public class Carro extends veiculo {
	
	public Carro(String tipo) {
		super(tipo);
	}
	
	public static String tipo = "Classe do tipo Carro";
	
		public static String getTipo()
		{
			System.out.println(tipo);
			return tipo;
		}
}
