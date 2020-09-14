public class HoraExtra extends Professor
{
	@Override
    protected Double calculaHrExtra() {
        return super.salario = super.salario * 0.20; 
   }
}

//Interface:
public interface HrExtraInterface {
	
	public default void alterarSalario ()
	{
		System.out.println ("O salário com hora extra é de: " + this.salario);
	}
}

public class InterfaceHrExtra implements HrExtraInterface
{
@Override
	public void alterarSalario ()
	{
		System.out.println ("O salário com hora extra é de: " + this.salario);
	}
}

/*	Professor, provavelmente está bem incompleto, mas nesse tempo que temos para a entrega foi o que eu consegui fazer,
 * ainda estou tendo muita dificuldade em Java. */