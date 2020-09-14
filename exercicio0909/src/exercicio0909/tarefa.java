package exercicio0909;

public class tarefa {
	
	private int id;
	private String status;
	private String titulo;
	private String descricao;
	private usuario nome;
	//public Object usuario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public usuario getNome_usuario() {
		return nome;
	}
	public void setNome_usuario(usuario nome) {
		this.nome = nome;
	}

	public tarefa(int id, String status, String titulo, String descricao, usuario nome) {
		this.id = id;
		this.status = status;
		this.titulo = titulo;
		this.descricao = descricao;
		this.nome = nome;
	}
}
