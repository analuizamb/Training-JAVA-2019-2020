
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
		System.out.println("Ol�, meu nome � " + this.getnome());
		System.out.println("O nome da outra pessoa � " + outraPessoa.getnome());
	}
}