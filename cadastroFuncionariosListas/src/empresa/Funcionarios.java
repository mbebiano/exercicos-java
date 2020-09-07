package empresa;

public class Funcionarios {
	private Integer id;
	private String nome;
	private Double salario;
	public Funcionarios(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void aumento(double porcentagem){
		salario+= (salario*(porcentagem/100));
	}
	public String toString() {
		return id+", "+nome+", "+String.format("%.2f", salario);
	}
	
}
