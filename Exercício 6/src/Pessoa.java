
public class Pessoa {
	
	private String nome;
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome= nome;
	}
}

class Main {
	
	public static void main(String[] args) {
		String nome = "Pedro Henrique";
		Pessoa p = new Pessoa();
		p.setNome(nome);
		System.out.println("O nome da pessoa é: " + p.toString());
	}
}