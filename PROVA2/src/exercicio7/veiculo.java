package exercicio7;

public class veiculo {
	private String nome;
	protected static String tipo;
	
	public veiculo (String tipo) {
		veiculo.tipo = tipo;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return nome;
	}
	public static String getTipo()
	{
		return tipo;
	}
}
