import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DespesasTeste {

	public static void main(String[] args) {

		
List <Double> ManutencaoValor = new ArrayList<Double>();
List <String> ManutencaoNome = new ArrayList<String>();
Scanner leia = new Scanner(System.in);
Despesas Des = new Despesas(0,0,0,0,0);
Ganhos gan = new Ganhos(0,0);	


	int menu = 1, despesas = 1, man = 0, ganhos = 1;
	double c = 0, m = 0; 
	
String[] tipoDeMan= new String[30]; 

do {
	
	System.out.println("\t\tMENU");
	System.out.println();
	System.out.println("1°) DESPESAS" +"\n2°) GANHOS" +"\n3°) SAIR");
	System.out.print("\nOpção: ");

	menu =leia.nextInt();	
	System.out.println("\n***************************************************************");
	System.out.println();
	
	
switch(menu){
	
	case 1:
		
		do {
		
		System.out.println("\t\tDESPESAS");
		System.out.println();
		System.out.println("1°) Combustivel" +"\n2°) Manutenção"+"\n3°) Limpeza"+"\n4°) Alimentação"+"\n5°) Outras Despesas"+"\n6°) Voltar ao menu");
		System.out.print("\nOpção: ");
		despesas = leia.nextInt();
			
		switch(despesas) {
			
			
			case 1:
				
				System.out.print("Insira o gasto com combustivel: ");
				c =leia.nextDouble();
				Des.setCombustivel(c);
				System.out.println(Des.getCombustivel());
				System.out.println("\n***************************************************************");
				
				System.out.println();
				break;

			case 2:
				String Nome;
				leia.nextLine();
				System.out.print("Insira o tipo de Manutenção: ");				
				Nome = leia.nextLine();
				ManutencaoNome.add(Nome);     
				man++;
				
				double valor;
				System.out.print("Insira o valor gasto: ");
				valor =leia.nextDouble();
				Des.setManutencao(valor);
				ManutencaoValor.add(valor);
				System.out.println("\n***************************************************************");
				
				System.out.println();
				break;
				
				
			case 3:
				
				System.out.print("Insira o valor gasto com limpeza: ");
				c =leia.nextDouble();
				Des.setLimpeza(c);
				System.out.println(Des.getLimpeza());
				System.out.println("\n***************************************************************");
				
				System.out.println();
				break;
				
			case 4:
				
				System.out.print("Insira o valor gasto com alimentação: ");
				c =leia.nextDouble();
				Des.setAlimentacao(c);
				System.out.println(Des.getAlimentacao());
				System.out.println("\n***************************************************************");
				
				System.out.println();
				break;
			
			case 5:
				
				System.out.print("Insira o valor gasto com outras despesas: ");
				c =leia.nextDouble();
				Des.setOutrasDespesas(c);
				leia.nextLine();
				System.out.print("Insira o nome da despesa: ");				
				tipoDeMan[man] = leia.nextLine();     
				man++;
				
				System.out.println("\n***************************************************************");
				
				System.out.println();
				System.out.println(Des.getOutrasDespesas());
				break;
			
			
			case 6:
				System.out.println("\nVoltando para o menu...");
			
				System.out.println("\n***************************************************************");
			
				System.out.println();
				break;
			
			
			case 7:
				System.out.println(ManutencaoValor);
				System.out.println(ManutencaoNome);
				
				
				
			
			default:
				System.out.println("\nOpção invalido");
				
				System.out.println("\n***************************************************************");
			
				System.out.println();
				break;
			
			
			
			}}while(despesas != 6);
			break;
	case 2:
		do {
			
			System.out.println("\t\tGANHOS");
			System.out.println();
			System.out.println("1°) Receita da corrida" +"\n2°) Gorgetas"+"\n3°) Voltar ao menu");
			System.out.print("\nOpção: ");
			ganhos = leia.nextInt();
			
			switch(ganhos) {
			
			case 1:
				System.out.print("Insira o quanto você lucrou com a corrida: ");
				c =leia.nextDouble();
				gan.setReceita(c);
				System.out.println(gan.getReceita());
				System.out.println("\n***************************************************************");
			
				System.out.println();
			break;
			
			case 2:
				System.out.print("Insira o quanto você recebeu de gorgeta: ");
				c =leia.nextDouble();
				gan.setGorjeta(c);
				System.out.println(gan.getGorjeta());
				System.out.println("\n***************************************************************");
				
				System.out.println();
				break;
			
			case 3:
				System.out.println("\nVoltando para o menu...");
				
				System.out.println("\n***************************************************************");
			
				System.out.println();
				break;
			
			default:
				System.out.println("\nOpção invalido");
				
				System.out.println("\n***************************************************************");
			
				System.out.println();
				break;
			
			
			
			}
		
		}while(ganhos != 3);
		break;

	default:
		System.out.println("\nOpção invalido");
		
		System.out.println("\n***************************************************************");
	
		System.out.println();
		break;
	
				
		
			
		
		
		
}}while(menu != 0);
	
	
	
	


	
	}

}
