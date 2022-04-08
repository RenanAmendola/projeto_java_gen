import java.text.NumberFormat;

public class Ganhos {

	private double receita;
	private double gorjeta;
	
	
	public Ganhos (double r, double g)
	{
		this.setReceita(r);
		this.setGorjeta(g);
		
	}

	public double getReceita() {
		return receita;
	}

	public void setReceita(double receita) {
		this.receita = receita;
	}

	public double getGorjeta() {
		return gorjeta;
	}

	public void setGorjeta(double gorjeta) {
		this.gorjeta = gorjeta;
	}

	
	//Formatando moedas
	public String formatarReceita()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoReceita = nf.format(receita);
		return formatoReceita;
	}
	public String formatarGorjeta()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoGorjeta = nf.format(gorjeta);
		return formatoGorjeta;
	}
	
	//Fim de formatação de moedas
	public void imprimir()
	{
		System.out.println("\nVocê apurou "+this.formatarReceita()+" recebeu "+this.formatarGorjeta()+" de gorjeta e pagou o equivalente.");
	}



}
