package br.senai.sp.jandira.teste;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappper {

	public static void main(String[] args) {
		
//	int a = 5;
//	
//	Integer b = 5;
//		
//	Double x = 2.9;
		
	ArrayList<Especialidade> especialidades = new ArrayList<>();
		
	Especialidade e1 = new Especialidade("Cardiologia");
	e1.setDescricao("Não deixa ter um ataque");
		
	Especialidade e2 = new Especialidade("Gastroenterologia");
	e2.setDescricao("Ddeixa ter dor de barriga");
		
	especialidades.add(e1);
	especialidades.add(e2);
		
	
	Especialidade e3 = new Especialidade("Fisioterapia");
	e3.setDescricao("Não deixa ficar com dor nas costas");
		
	especialidades.add(e3);
		
	Especialidade e4 = new Especialidade("Clínico Geral");
	e4.setDescricao("Sabe de tudo um pouco e um pouco de tudo");
		
	Especialidade e5 = new Especialidade("Pediatra");
	e5.setDescricao("Cuida dos baixin");
	
	especialidades.add(e4);
	especialidades.add(e5);
		
	System.out.println(especialidades.size());
	
	ArrayList<Integer> notas = new ArrayList<>();
	notas.add(50);
	notas.add(76);
	notas.add(34);
	notas.add(45);
	notas.add(23);
		
	System.out.println(notas.size());
	
	notas.add(32);
	notas.add(64);
		
	System.out.println(notas.size());
	System.out.println(especialidades.get(3).getNome());
		
	especialidades.get(1).setNome("Teste");
	System.out.println(especialidades.get(1).getNome());
		
	Especialidade nova = especialidades.get(2);
	System.out.println(nova.getNome());
		nova.setNome("Não é mais fisio");
	System.out.println(nova.getNome());
		
		
	}

}
