package br.cesed.si.p3.questao2;

public abstract class Empregado extends Pessoa {
	
	private double salario;
	private String matricula;
	
	public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
