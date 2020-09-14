package exercicio0209;

public class pessoa {
	
	private String nome;
	private String rg;
	private String email;
	
	public pessoa(String nome, String rg, String email) {
		this.nome = nome;
		this.rg = rg;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + getNome());
		sb.append("RG: " + getRg());
		sb.append("Email: " + getEmail());
		return toString();
	}
	

}
