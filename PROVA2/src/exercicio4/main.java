package exercicio4;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class main {
	
	public main (String[] args)
	{
		Curso c = new Curso();
		
		java.lang.reflect.Field[] allFields = c.getClass().getDeclaredFields();
		
		Arrays.sort(allFields, (a,b) ->a.getName().compareTo(b.getName()));
		
		for (java.lang.reflect.Field field: allFields) {
			if (Modifier.isPrivate(field.getModifiers())) {
				System.out.println(field.getName());
			}
		}
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine())
		{
			String descricao = scan.nextLine();
			String nome = scan.nextLine();
			String valor = scan.nextLine();
			
			try
			{	
				c.setDescricao(descricao);
				c.setNome(nome);
				c.setValor(valor);
				System.out.println(c.getDescricao());
				System.out.println(c.getNome());
				System.out.println(c.getValor());
			}
			catch(Exception ex)
			{
				System.out.println(ex.getClass().getName());
			}
		}
	}

}
