package Pwrenato;



public class Produto {
	public double valor;
	public int parcelas;
	
	public String showVrTotal() {
		return FuncoesGenericas.maskDinheiro(valor*Math.pow(1.05, parcelas));
	}

}
