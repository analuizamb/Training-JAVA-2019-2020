public class Professor
{
	private int identidade;
	protected double salario;

	public void recebeSalario(double salario)
	{
		this.salario=salario;
	}
	
	protected Double calculaHrExtra() {
		return null;
	}

	//OS METODOS GETs E SETs S�O PARA ACESSAR OS ATRIBUTOS PROTEGIDOS DA CLASSE.
	
	public void setIdentidade(int id)
	{
		this.identidade=id;
	}
	public int getIdentidade()
	{
		return (identidade);
	}
	
	public void setSalario(double sal)
	{
		this.salario=sal;
	}
	public double getSalario()
	{
		return (salario);
	}
}

public class HoraExtra extends Professor
{
	@Override
    protected Double calculaHrExtra() {
        return super.salario = super.salario * 0.20; 
   }
    public void alterarSalario ()
	{
		System.out.println ("O sal�rio com hora extra � de: " + this.salario);
	}
}

//SLP:
Professor professor = new HoraExtra();
HoraExtra.setSal(1000 + (1000*0.20));
System.out.println(Salario.calculaSal());