package exercicios;
import java.util.Scanner; 

public class comissaoVend {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		    String nomeVendedor;
		    double salarioFixo;
		    double vendas;
		    double comissao;
		    double salarioFinal;
		    
		    System.out.print("Digite o nome do vendedor: ");
		    nomeVendedor= input.nextLine();
		    
		    System.out.print("Digite o salário fixo do vendedor: ");
		    salarioFixo = input.nextDouble();
		    
		    System.out.print("Digite o total de vendas efetuadas pelo vendedor: ");
		    vendas = input.nextDouble();
		    
		    comissao = (vendas *15) / 100;
		    
		    salarioFinal =  comissao + salarioFixo;
		    
		    System.out.println("Nome do vendedor: "+nomeVendedor);
		    System.out.print("Salario Fixo: "+salarioFixo+ "reais");
		    System.out.print("Salario Final: "+salarioFinal +"reais");
		    
	}

}
