package exercicio4;

import javax.management.InvalidAttributeValueException;

public class Curso {
	String descricao;
	String nome;
	double valor;
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
		public void setDescricao(String descricao) {
			this.descricao =  descricao;
		}
			public void setNome(String nome) {
				this.nome = nome;
			}
				public void setValor(double valor) throws Exception {
					if (valor>0) {
						System.out.print("Valor aceito");
						this.valor = valor;
					} else {
						throw new InvalidAttributeValueException("Valor nao permitido");
							
					}
				}

				/*public void setValor(String valor2) {
					// TODO Auto-generated method stub
					
				}*/
}
