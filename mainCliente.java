import javax.swing.JOptionPane;

public class mainCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem?"));
		String endereco = JOptionPane.showInputDialog("Onde voc� mora?");
		double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto?"));
		
		c1.setNome(nome);
		c1.setIdade(idade);
		c1.setEndereco(endereco);
		c1.setDesconto(desconto);
		c1.getCalcularDesconto();
		
		System.out.println("Seu nome �: " + c1.getNome());
		System.out.println("Sua idade �: " + c1.getIdade());
		System.out.println("Voc� em: " + c1.getEndereco());
		System.out.println("seu desconto: " + c1.getDesconto());
		
		ClientePremium p1 = new ClientePremium();
		
		String nomePremium = JOptionPane.showInputDialog("Qual seu nome?");
		int idadePremium = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem?"));
		String enderecoPremium = JOptionPane.showInputDialog("Onde voc� mora?");
		double descontoPremium = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto?"));
		
		p1.setNome(nomePremium);
		p1.setIdade(idadePremium);
		p1.setEndereco(enderecoPremium);
		p1.setDesconto(descontoPremium);
		p1.CalcularDesconto();
		
		System.out.println("Seu nome �: " + p1.getNome());
		System.out.println("Sua idade �: " + p1.getIdade());
		System.out.println("Voc� em: " + p1.getEndereco());
		System.out.println("seu desconto: " + p1.getDesconto());

	}

}
