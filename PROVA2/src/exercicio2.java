
public class exercicio2 {

}

class Pessoa {
	private String nome;
	public String getnome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void falar (Pessoa outraPessoa) {
		System.out.println("Olá, meu nome é " + this.getnome());
		System.out.println("O nome da outra pessoa é " + outraPessoa.getnome());
	}
}