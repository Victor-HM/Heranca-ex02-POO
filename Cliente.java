
public class Cliente {
	
	private String Nome;
	private int Idade;
	protected String Endereco;
	double Desconto;
	
	//GETTERS and SETTERS
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public int getIdade() {
		return Idade;
	}
	
	public void setIdade(int idade) {
		this.Idade = idade;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(String endereco) {
		this.Endereco = endereco;
	}
	
	public double getDesconto() {
		return Desconto;
	}

	public void setDesconto(double desconto) {
		this.Desconto = desconto;
	}
	
	public double getCalcularDesconto() {
		return this.Desconto = Desconto - (Desconto * 0.10);
	}
	
}
