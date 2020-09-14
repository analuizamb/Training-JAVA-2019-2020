public class Professor
{
	public static void main (int[] args) {

	}
	
	protected class calculaHrExtra {
	
	}
	public static void main (int[] args) {
	}
	private int identidade;
	protected double salario;

	public void recebeSalario(double salario)
	{
		this.salario=salario;
	}
	
	protected Double calculaHrExtra() {
		return null;
	}

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

//SLP:
Professor professor = new HoraExtra();
professor.setHoraExtra(1000 + (1000*0.20));
System.out.println(this.HoraExtra());
}