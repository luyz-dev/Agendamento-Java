package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

	private LocalDate dataDaConsulta;
	private LocalTime horaDaConsulta;
	private Paciente paciente;
	private Medico medico;
	private Especialidade especialidade;

	public LocalDate getData() {
		return dataDaConsulta;
	}

	public void setData(LocalDate data) {
		this.dataDaConsulta = data;
	}

	public LocalTime getHora() {
		return horaDaConsulta;
	}

	public void setHora(LocalTime hora) {
		this.horaDaConsulta = hora;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}
