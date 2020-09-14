package exercicio0909;

import java.util.ArrayList;

public class programa {

	public static void main(String[] args) {
		
		ArrayList<usuario> usuarios = new ArrayList<usuario>();
		
		usuario user1 = new usuario("Ana", 123123123, "ana@email.com", "TI");
		usuario user2 = new usuario("Luiza", 321321321, "luiza@email.com", "Gerencia");
		usuario user3 = new usuario("Bianca", 456456456, "bianca@email.com", "Administração");

		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		
		System.out.println("LISTA USUARIOS: \n");
		System.out.println(user1.getNome() + "\n" + user1.getId() + "\n" + user1.getEmail() + "\n" + user1.getCargo());
		System.out.println("\n" +user2.getNome() + "\n" + user2.getId() + "\n" + user2.getEmail() + "\n" + user2.getCargo());
		System.out.println("\n" + user3.getNome() + "\n" + user3.getId() + "\n" + user3.getEmail() + "\n" + user3.getCargo());
		
		ArrayList<tarefa> tarefas = new ArrayList<tarefa>();
		
		tarefa t1 = new tarefa(789, "concuida", "TI", "Verificar computadores", user1);
		tarefa t2 = new tarefa(654, "pendente", "Gerencia", "Palestra", user2);
		tarefa t3 = new tarefa(321, "pendente", "Administração", "Agendamentos", user3);
		tarefa t4 = new tarefa(910, "pendente", "TI", "Reunião", user1);
		
		tarefas.add(t1);
		tarefas.add(t2);
		tarefas.add(t3);
		tarefas.add(t4);
		
		System.out.println("\n\nLISTA TAREFAS: ");
		System.out.println("\n" + t1.getId() + "\n" + t1.getStatus() + "\n" + t1.getTitulo() + "\n" + t1.getDescricao() + "\n" + "Usuário: " + user1.getNome());
		System.out.println("\n" + t2.getId() + "\n" + t2.getStatus() + "\n" + t2.getTitulo() + "\n" + t2.getDescricao() + "\n" + "Usuário: " + user2.getNome());
		System.out.println("\n" + t3.getId() + "\n" + t3.getStatus() + "\n" + t3.getTitulo() + "\n" + t3.getDescricao() + "\n" + "Usuário: " + user3.getNome());
		System.out.println("\n" + t4.getId() + "\n" + t4.getStatus() + "\n" + t4.getTitulo() + "\n" + t4.getDescricao() + "\n" + "Usuário: " + user1.getNome());
	}

}
