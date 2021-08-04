import javax.swing.JOptionPane;

public class mainCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
		String endereco = JOptionPane.showInputDialog("Onde você mora?");
		double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto?"));
		
		c1.setNome(nome);
		c1.setIdade(idade);
		c1.setEndereco(endereco);
		c1.setDesconto(desconto);
		c1.getCalcularDesconto();
		
		System.out.println("Seu nome é: " + c1.getNome());
		System.out.println("Sua idade é: " + c1.getIdade());
		System.out.println("Você em: " + c1.getEndereco());
		System.out.println("seu desconto: " + c1.getDesconto());
		
		ClientePremium p1 = new ClientePremium();
		
		String nomePremium = JOptionPane.showInputDialog("Qual seu nome?");
		int idadePremium = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
		String enderecoPremium = JOptionPane.showInputDialog("Onde você mora?");
		double descontoPremium = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto?"));
		
		p1.setNome(nomePremium);
		p1.setIdade(idadePremium);
		p1.setEndereco(enderecoPremium);
		p1.setDesconto(descontoPremium);
		p1.CalcularDesconto();
		
		System.out.println("Seu nome é: " + p1.getNome());
		System.out.println("Sua idade é: " + p1.getIdade());
		System.out.println("Você em: " + p1.getEndereco());
		System.out.println("seu desconto: " + p1.getDesconto());

	}

}
