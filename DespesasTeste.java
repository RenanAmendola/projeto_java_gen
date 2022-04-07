import java.util.Scanner;

public class DespesasTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);
Despesas Des = new Despesas(0,0,0,0,0);
	
	int menu = 1, despesas = 1, man = 0;
	double c = 0, m = 0; 
	
String[] tipoDeMan= new String[30]; // 0 = espelho quebrado / 1 = 

	
	
	
	
	

do {

	
	System.out.println("\t\tMENU");
	System.out.println();
	System.out.println("1°) DESPESAS" +"\n2°) GANHOS"+"\n3°) TAXAS DE SERVIÇOS");
	System.out.print("\nOpção: ");

	menu =leia.nextInt();
	
	
	
	
	
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
				
				System.out.print("Insira o tipo de Manutenção: ");				
				tipoDeMan[man] = leia.next();      //não pode dar espaço, quebra o codigo
				man++;
	
				System.out.print("Insira o valor gasto: ");
				m =leia.nextDouble();
				Des.setManutencao(m);
				System.out.println(Des.getManutencao());
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
				
				System.out.print("Insira o nome da despesa: ");				
				tipoDeMan[man] = leia.next();      //não pode dar espaço, quebra o codigo
				man++;
				
				System.out.println("\n***************************************************************");
				
				System.out.println();
				System.out.println(Des.getOutrasDespesas());
				break;
			
			
			case 6:
				System.out.println("\nVoltando para o menu");
			
				System.out.println("\n***************************************************************");
			
				System.out.println();
			
			
			
			default:
				System.out.println("\nOpção invalido");
				
				System.out.println("\n***************************************************************");
			
				System.out.println();
			
			
			
			}}while(despesas != 6);
				
				
				
			
			
			
		
	
			
			
	case 2:
		break;
	
	
	
	
	case 3:
		break;
		
	
	
	
	
	
	
}}while(menu != 0);
	
	
	
	


	
	}

}
