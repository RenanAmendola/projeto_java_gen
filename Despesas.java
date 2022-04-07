import java.text.NumberFormat;

public class Despesas {


	private double Combustivel;
	private double Manutencao;
	private double Limpeza;
	private double Alimentacao;
	private double OutrasDespesas;


public Despesas(double Combustivel, double Manutencao, double Limpeza, double Alimentacao, double OutrasDespesas) {
	
	
	
	this.Combustivel = Combustivel;
	this.Manutencao = Manutencao;
	this.Limpeza = Limpeza;
	this.Alimentacao = Alimentacao;
	this.OutrasDespesas = OutrasDespesas;
	
	
	
}



public double getCombustivel() {
	return Combustivel;
}



public void setCombustivel(double combustivel) {
	this.Combustivel = combustivel;
}



public double getManutencao() {
	return Manutencao;
}



public void setManutencao(double manutencao) {
	Manutencao = manutencao;
}



public double getLimpeza() {
	return Limpeza;
}



public void setLimpeza(double limpeza) {
	Limpeza = limpeza;
}



public double getAlimentacao() {
	return Alimentacao;
}



public void setAlimentacao(double alimentacao) {
	Alimentacao = alimentacao;
}



public double getOutrasDespesas() {
	return OutrasDespesas;
}



public void setOutrasDespesas(double outrasDespesas) {
	OutrasDespesas = outrasDespesas;
}



public String FormCombustivel() {
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	nf.setMinimumFractionDigits(2);
	String FormCombustivel = nf.format(Combustivel);
	return FormCombustivel;
		
	
}

public String FormManutencao() {
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	nf.setMinimumFractionDigits(2);
	String FormManutencao = nf.format(Manutencao);
	return FormManutencao;
		

}



}



